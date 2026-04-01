package constrained;

import java.beans.*;

public class ConstrainedPerson {
    private int age;
    private VetoableChangeSupport support = new VetoableChangeSupport(this);

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) throws PropertyVetoException {
        support.fireVetoableChange("age", this.age, newAge);

        this.age = newAge;
        System.out.println("Age set to: " + age);
    }

    public void addVetoableChangeListener(VetoableChangeListener listener) {
        support.addVetoableChangeListener(listener);
    }
}
package constrained;

import java.beans.*;

public class TestConstrained {
    public static void main(String[] args) {
        ConstrainedPerson p = new ConstrainedPerson();

        p.addVetoableChangeListener(new VetoableChangeListener() {
            public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
                int newAge = (int) evt.getNewValue();

                if (newAge < 18) {
                    throw new PropertyVetoException("Age must be 18+", evt);
                }
            }
        });

        try {
            p.setAge(20); // valid
            p.setAge(15); // invalid
        } catch (PropertyVetoException e) {
            System.out.println("Change rejected: " + e.getMessage());
        }
    }
}
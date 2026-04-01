package bound;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class TestBound {
    public static void main(String[] args) {
        BoundPerson p = new BoundPerson();

        p.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.println("Property changed: " + evt.getPropertyName());
                System.out.println("Old Value: " + evt.getOldValue());
                System.out.println("New Value: " + evt.getNewValue());
            }
        });

        p.setName("Himanshu");
        p.setName("Pant");
    }
}
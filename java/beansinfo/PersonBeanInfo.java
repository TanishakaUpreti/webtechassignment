package beansinfo;

import java.beans.*;

public class PersonBeanInfo extends SimpleBeanInfo {

    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor name = new PropertyDescriptor("name", beans.Person.class);
            PropertyDescriptor age = new PropertyDescriptor("age", beans.Person.class);

            return new PropertyDescriptor[]{name, age};
        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }
    }
}
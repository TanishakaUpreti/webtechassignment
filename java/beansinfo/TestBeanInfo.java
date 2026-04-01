package beansinfo;

import java.beans.*;

public class TestBeanInfo {
    public static void main(String[] args) throws Exception {
        BeanInfo info = Introspector.getBeanInfo(beans.Person.class);

        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            System.out.println("Property: " + pd.getName());
        }
    }
}
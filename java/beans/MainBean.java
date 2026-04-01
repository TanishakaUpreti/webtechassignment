package beans;

public class MainBean {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Tanishaka");
        p.setAge(20);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
class Person {
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Jigyasa");
        p.setAge(19);
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}

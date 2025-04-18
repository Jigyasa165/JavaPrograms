interface Animal {
    void sound();
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meow");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.sound();
    }
}

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

public class InheritanceExample extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        InheritanceExample obj = new InheritanceExample();
        obj.eat();
        obj.bark();
    }
}

public class MethodOverloading {
    void display() {
        System.out.println("No parameters");
    }

    void display(int a) {
        System.out.println("Integer parameter: " + a);
    }

    void display(String s) {
        System.out.println("String parameter: " + s);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display();
        obj.display(5);
        obj.display("Hello");
    }
}

import java.util.Scanner;

class Student {
    String name;
    int roll;
    float marks;

    void inputDetails(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter roll number: ");
        roll = sc.nextInt();
        System.out.print("Enter marks: ");
        marks = sc.nextFloat();
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Roll: " + roll + ", Marks: " + marks);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            students[i] = new Student();
            System.out.println("Enter details for Student " + (i + 1));
            students[i].inputDetails(sc);
        }

        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.displayDetails();
        }

        sc.close();
    }
}

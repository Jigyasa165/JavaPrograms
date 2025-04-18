import java.util.Scanner;

class Book {
    String title;
    boolean isIssued;

    Book(String title) {
        this.title = title;
        this.isIssued = false;
    }

    void issue() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(title + " issued.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }

    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println(title + " returned.");
        } else {
            System.out.println(title + " was not issued.");
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book("Java Programming");

        int choice;
        do {
            System.out.println("\n1. Issue Book\n2. Return Book\n3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    b1.issue();
                    break;
                case 2:
                    b1.returnBook();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 3);
        sc.close();
    }
}

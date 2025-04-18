import java.util.*;

public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n1. Add Task\n2. View Tasks\n3. Remove Task\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task added.");
                    break;
                case 2:
                    System.out.println("Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Enter task number to remove: ");
                    int index = sc.nextInt();
                    if (index >= 1 && index <= tasks.size()) {
                        tasks.remove(index - 1);
                        System.out.println("Task removed.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}

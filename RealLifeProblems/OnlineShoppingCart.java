import java.util.*;

class CartItem {
    String name;
    double price;

    CartItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<CartItem> cart = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n1. Add Item\n2. View Cart\n3. Total\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Item name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: ₹");
                    double price = sc.nextDouble();
                    cart.add(new CartItem(name, price));
                    System.out.println("Item added.");
                    break;
                case 2:
                    System.out.println("Items in Cart:");
                    for (CartItem item : cart) {
                        System.out.println(item.name + " - ₹" + item.price);
                    }
                    break;
                case 3:
                    double total = 0;
                    for (CartItem item : cart) {
                        total += item.price;
                    }
                    System.out.println("Total: ₹" + total);
                    break;
                case 4:
                    System.out.println("Thank you for shopping!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
        sc.close();
    }
}

import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter price of item " + (i + 1) + ": ₹");
            double price = sc.nextDouble();
            total += price;
        }

        double gst = total * 0.18;
        double finalAmount = total + gst;

        System.out.println("\nTotal: ₹" + total);
        System.out.println("GST (18%): ₹" + gst);
        System.out.println("Amount Payable: ₹" + finalAmount);

        sc.close();
    }
}

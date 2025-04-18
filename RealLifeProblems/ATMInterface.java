import java.util.Scanner;

public class ATMInterface {
    private static double balance = 1000.00;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWelcome to Simple ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Amount deposited successfully.");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Please collect your cash.");
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while(choice != 4);

        sc.close();
    }
}

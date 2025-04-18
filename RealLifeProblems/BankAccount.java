class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String name, double balance) {
        this.accountHolder = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Jigyasa", 5000.00);
        acc.displayBalance();
        acc.deposit(1500);
        acc.withdraw(2000);
        acc.displayBalance();
    }
}

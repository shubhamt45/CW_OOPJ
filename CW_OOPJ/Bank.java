import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    
    BankAccount(int accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }

    
    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New Balance: " + balance);
    }

    
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Display account details
    void display() {
        System.out.println(accountNumber + " " + accountHolder + " " + balance);
    }
}

 class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating 3 bank accounts
        BankAccount b1 = new BankAccount(1001, "Amit", 5000);
        BankAccount b2 = new BankAccount(1002, "Rahul", 10000);
        BankAccount b3 = new BankAccount(1003, "Priya", 7500);

        // Display initial details
        System.out.println("Initial Account Details:");
        b1.display();
        b2.display();
        b3.display();

        // Taking user input for transactions
        System.out.print("\nEnter account number (1001/1002/1003): ");
        int accNo = sc.nextInt();

        BankAccount selectedAccount = null;
        if (accNo == 1001) selectedAccount = b1;
        else if (accNo == 1002) selectedAccount = b2;
        else if (accNo == 1003) selectedAccount = b3;
        else System.out.println("Invalid account number!");

        if (selectedAccount != null) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            if (choice == 1) selectedAccount.deposit(amount);
            else if (choice == 2) selectedAccount.withdraw(amount);
            else System.out.println("Invalid choice!");

            // Display updated details
            System.out.println("\nUpdated Account Details:");
            selectedAccount.display();
        }

        
    }
}


import java.util.Scanner;

class Atm{
    float Balance;
    int PIN = 2035;
    Scanner sc = new Scanner(System.in); // Reuse the same scanner

    public void checkpin() {
        System.out.println("Hello Java World Bank Customer");
        System.out.println("Please enter your PIN:");
        int enteredpin = sc.nextInt();
        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("You have Entered the wrong PIN, Please restart again.");
        }
    }

    public void menu() {
        System.out.println("Please choose an option:");
        System.out.println("1: Check Balance");
        System.out.println("2: Deposit Money");
        System.out.println("3: Withdraw Money");
        System.out.println("4: Exit");
        
        int option = sc.nextInt();

        switch (option) {
            case 1:
                checkbalance();
                break;
            case 2:
                deposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                System.out.println("Thank you for banking with us! Have a nice day.");
                return;
            default:
                System.out.println("Please enter a valid option.");
                System.out.println();
                menu();
        }
    }

    public void checkbalance() {
        System.out.println("Current Balance: $" + Balance);
        System.out.println();
        menu();
    }

    public void withdraw() {
        System.out.println("Enter amount to withdraw:");
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Funds.");
            System.out.println("Please deposit more funds.");
        } else {
            Balance -= amount;
            System.out.println("Successfully withdrawn: $" + amount);
            System.out.println("New balance: $" + Balance);
        }
        System.out.println();
        menu();
    }

    public void deposit() {
        System.out.println("Enter amount to deposit:");
        float depositamount = sc.nextFloat();
        Balance += depositamount;
        System.out.println("Successfully deposited: $" + depositamount);
        System.out.println("New balance: $" + Balance);
        System.out.println();
        menu();
    }
}

public class AtmMachine {
    public static void main(String[] args) {
        ATM a = new ATM();
        a.checkpin();
    }
}

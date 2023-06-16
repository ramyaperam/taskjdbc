package corejava3;
import java.util.*;

public class BankTaskv1main {
    public static void main(String[] args) {
        String[] accountNumbers = {"123", "234", "345", "456", "567"};
        String[] names = {"ramya", "ram", "sam", "lex", "siri"};
        double[] balances = {1000, 2000, 3000, 4000, 5000};
        String[] passwords = {"pass123", "pass234", "pass345", "pass456", "pass567"};

        bankTaskV1 bankAccount = new bankTaskV1(accountNumbers, names, balances, passwords);

        System.out.println("Welcome to Online Banking!");
        System.out.println("This is sam, what's your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ". Nice to see you here!");

        String accountNumber;
        String password;
        String choice;

        do {
            System.out.print("Enter your account number: ");
            accountNumber = scanner.nextLine();

            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            if (bankAccount.authenticateAccount(accountNumber, password)) {
                System.out.print("Do you want to see your balance? (yes/no): ");
                choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("yes")) {
                    bankAccount.displayBalance(accountNumber);
                } else {
                    System.out.println("Thank you for using Online Banking!");
                }
            } else {
                System.out.println("Authentication failed! Please check your account number and password.");
                break;
            }

            System.out.print("Do you want to continue? (yes/no): ");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Goodbye! Have a nice day.");
    }
}

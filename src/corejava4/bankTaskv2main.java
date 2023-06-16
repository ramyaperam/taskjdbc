package corejava4;

import java.util.Scanner;
public class bankTaskv2main extends accountHolderv2 {
    public bankTaskv2main(String[] accountNumbers, String[] names, double[] balances, String[] passwords) {
        super(accountNumbers, names, balances, passwords);
    }

    public static void main(String[] args) {
        String[] accountNumbers = {"123", "234", "345", "456", "567"};
        String[] names = {"ramya", "ram", "sam", "lex", "siri"};
        double[] balances = {1000, 2000, 3000, 4000, 5000};
        String[] passwords = {"password123", "password234", "password345", "password456", "password567"};

        bankTaskv2main bankApp = new bankTaskv2main(accountNumbers, names, balances, passwords);

        System.out.println("Welcome to American Online Banking facility");
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

            if (bankApp.authenticateAccount(accountNumber, password)) {
                System.out.print("Do you want to see your balance? (yes/no): ");
                choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("yes")) {
                    bankApp.displayBalance(accountNumber);
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
        System.out.println("Logging off .........");
        System.out.println(" Thank you !! ");
        System.out.println("Bye! Have a nice day.");
    }
}

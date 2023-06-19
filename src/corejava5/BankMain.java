package corejava5;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] accountNumbers = {"123", "234", "345", "456", "567"};
        String[] names = {"ramya", "ram", "sam", "lex", "siri"};
        double[] balances = {1000, 2000, 3000, 4000, 5000};
        String[] passwords = {"password123", "password234", "password345", "password456", "password567"};

        BankAccount[] accounts = new BankAccount[accountNumbers.length];
        for (int i = 0; i < accountNumbers.length; i++) {
            accounts[i] = new PersonalAccount(accountNumbers[i], names[i], balances[i], passwords[i],
                    "Street " + (i + 1), "12345", "1234567890");
        }

        String[] businessAccountNumbers = {"678", "789"};
        String[] businessNames = {"ABC Corp", "XYZ Ltd"};
        double[] businessBalances = {10000, 20000};
        String[] businessPasswords = {"password678", "password789"};
        String[] companyAddresses = {"Company Address 1", "Company Address 2"};
        String[] contactNumbers = {"9898989898", "8888899999"};

        BankAccount[] businessAccounts = new BankAccount[businessAccountNumbers.length];
        for (int i = 0; i < businessAccountNumbers.length; i++) {
            businessAccounts[i] = new BusinessAccount(businessAccountNumbers[i], businessNames[i],
                    businessBalances[i], businessPasswords[i], businessNames[i], companyAddresses[i], contactNumbers[i]);
        }

        Bank personalBank = new Bank(accounts);
        Bank businessBank = new Bank(businessAccounts);
        System.out.println("Welcome to the Banking System!");
        System.out.println("This is sam, what's your name: ");

        String name = scanner.nextLine();
        System.out.println("Hello " + name + ". Nice to see you here!");
        String choice;
        do {
            System.out.println("\nPlease select an account type: ");
            System.out.println("1. Personal");
            System.out.println("2. Business");
            System.out.print("Choice: ");
            int accountTypeChoice = scanner.nextInt();
            scanner.nextLine();

            if (accountTypeChoice == 1) {
                System.out.print("\nEnter Personal Account Number: ");
                String accountNumber = scanner.nextLine();

                System.out.print("Enter Password: ");
                String password = scanner.nextLine();

                boolean authenticated = personalBank.authenticateAccount(accountNumber, password);
                if (authenticated) {
                    System.out.println("\nAuthentication Successful!");
                    System.out.println("Logging in ..... ");
                    System.out.println("Please wait ....");
                    BankAccount account = personalBank.getAccount(accountNumber);
                    if (account != null ) {
                        PersonalAccount personalAccount = (PersonalAccount) account;
                        System.out.println("Name: " + personalAccount.getName());
                        System.out.println("Account Balance: " + personalAccount.getBalance());
                        System.out.println("Address: " + personalAccount.getAddress());
                        System.out.println("Phone Number: " + personalAccount.getPhoneNumber());
                        System.out.println("Zip Code: " + personalAccount.getZipCode());
                    } else {
                        System.out.println("Invalid Account!");
                    }
                } else {
                    System.out.println("\nAuthentication Failed! Invalid Account Number or Password.");
                }
            } else if (accountTypeChoice == 2) {
                System.out.print("\nEnter Business Account Number: ");
                String accountNumber = scanner.nextLine();

                System.out.print("Enter Password: ");
                String password = scanner.nextLine();

                boolean authenticated = businessBank.authenticateAccount(accountNumber, password);
                if (authenticated) {
                    System.out.println("\nAuthentication Successful!");
                    System.out.println("Logging in ..... ");
                    System.out.println("Please wait ....");
                    BankAccount account = businessBank.getAccount(accountNumber);
                    if (account != null ) {
                        BusinessAccount businessAccount = (BusinessAccount) account;

                        System.out.println("Account Balance: " + businessAccount.getBalance());
                        System.out.println("Address: " + businessAccount.getAddress());

                    } else {
                        System.out.println("Invalid Account!");
                    }
                } else {
                    System.out.println("\nAuthentication Failed! Invalid Account Number or Password.");
                }
            } else {
                System.out.println("\nInvalid choice!");
            }

            System.out.print("\nDo you want to continue? (yes/no): ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));
        System.out.println("Thank you for using the Banking System.");
        System.out.println("Logging off.........");
        System.out.println("Thank you!!");
        System.out.println("Bye! Have a nice day.");

    }
}

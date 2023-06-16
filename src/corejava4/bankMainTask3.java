package corejava4;
import java.util.Scanner;
public class bankMainTask3 {
        public static void main(String[] args) {
            String[] accountNumbers = {"123", "234", "345", "456", "567"};
            String[] names = {"ramya", "ram", "sam", "lex", "siri"};
            double[] balances = {1000, 2000, 3000, 4000, 5000};
            String[] passwords = {"password123", "password234", "password345", "password456", "password567"};

            bankAcountTask3[] accounts = new bankAcountTask3[accountNumbers.length];
            for (int i = 0; i < accountNumbers.length; i++) {
                accounts[i] = new bankAcountTask3(accountNumbers[i], names[i], balances[i], passwords[i]);
            }

            String[] doorNo = {"1", "2", "3", "4", "5"};
            String[] streetNo = {"Street 1", "Street 2", "Street 3", "Street 4", "Street 5"};
            String[] locality = {"Locality 1", "Locality 2", "Locality 3", "Locality 4", "Locality 5"};
            String[] zipCode = {"12345", "23456", "34567", "45678", "56789"};
            String[] mobileNumber = {"1234567890", "2345678901", "3456789012", "4567890123", "5678901234"};
            String[] telephoneNumber = {"1111111111", "2222222222", "3333333333", "4444444444", "5555555555"};

            personalDetailsTask3 personalDetails = new personalDetailsTask3(accounts, doorNo, streetNo, locality, zipCode,
                    mobileNumber, telephoneNumber);
            bankTask3 bank = new bankTask3(accounts);

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

                if (bank.authenticateAccount(accountNumber, password)) {
                    System.out.println("Authentication Successful");
                    System.out.println("Logging in ..... ");
                    System.out.println("Please wait ....");
                    System.out.print("Do you want to see your balance? (yes/no): ");
                    choice = scanner.nextLine();

                    if (choice.equalsIgnoreCase("yes")) {
                        bankAcountTask3 account = bank.getAccount(accountNumber);
                        if (account != null) {
                            account.displayBalance();
                            personalDetails.displayAddress(accountNumber);
                        }
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

            System.out.println("Logging off.........");
            System.out.println("Thank you!!");
            System.out.println("Bye! Have a nice day.");
        }
    }

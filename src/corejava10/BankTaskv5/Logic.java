package corejava10.BankTaskv5;
import corejava10.InvalidCredentialsException;

import java.util.*;
public class Logic extends ManagerLogin {
    BankImp bankAccount;
    public Logic() {
        List<String> accountNumbers = Arrays.asList("123", "234", "345", "456", "567");
        List<String> names = Arrays.asList("ramya", "ram", "sam", "lex", "siri");
        List<Integer> balances = Arrays.asList(1000, 2000, 3000, 4000, 5000);
        List<String> doorNo = Arrays.asList("1", "2", "3", "4", "5");
        List<String> streetNo = Arrays.asList("Street 1", "Street 2", "Street 3", "Street 4", "Street 5");
        List<String> locality = Arrays.asList("Locality 1", "Locality 2", "Locality 3", "Locality 4", "Locality 5");
        List<String> zipCode = Arrays.asList("12345", "23456", "34567", "45678", "56789");
        List<String> mobileNumber = Arrays.asList("1234567890", "2345678901", "3456789012", "4567890123", "5678901234");
        List<String> telephoneNumber = Arrays.asList("1111111111", "2222222222", "3333333333", "4444444444", "5555555555");

        bankAccount = new BankImp(accountNumbers.get(0), names.get(0), balances.get(0),
                doorNo.get(0), streetNo.get(0), locality.get(0), zipCode.get(0),
                mobileNumber.get(0), telephoneNumber.get(0));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bank");

        String choice;

        do {
            try {
                System.out.print("Select login type (1. Manager, 2. User): ");
                int loginType = scanner.nextInt();
                boolean loggedIn = false;
                if (loginType == 1) {
                    loggedIn = ManagerLogin.login();

                    if (loggedIn) {
                        System.out.println("Manager Login successful!");
                        bankAccount.createAccount();
                        bankAccount.displayAccountDetails();
                        ManagerLogin.login();
                    }
                } else if (loginType == 2) {
                    loggedIn = UserLogin.login();
                    if (loggedIn) {
                        System.out.println("User Login successful!");
                        bankAccount.displayAccountDetails();

                        System.out.print("Do you want to check the balance? (yes/no): ");
                        choice = scanner.next();

                        if (choice.equalsIgnoreCase("yes")) {
                            bankAccount.checkBalance();
                            UserLogin.login();
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Invalid login type selected!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input mismatch exception! Please enter a valid choice.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
                choice = "invalid ";
            } catch (InvalidCredentialsException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
            System.out.print("Do you want to continue (yes/no): ");
            choice = scanner.next();
            if (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
                throw new IllegalArgumentException("Invalid choice! Please enter either 'yes' or 'no'.");
            }

        } while (!choice.equalsIgnoreCase("no"));

        System.out.println("Logging off.........");
        System.out.println("Thank you!!");
        System.out.println("Bye! Have a nice day.");
    }
}

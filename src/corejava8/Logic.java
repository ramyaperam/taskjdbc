package corejava8;
import java.util.*;
public class Logic extends ManagerLogin  {

    public String[] accountNumbers = {"123", "234", "345", "456", "567"};
    String[] names = {"ramya", "ram", "sam", "lex", "siri"};
    double[] balances = {1000, 2000, 3000, 4000, 5000};
    String[] doorNo = {"1", "2", "3", "4", "5"};
    String[] streetNo = {"Street 1", "Street 2", "Street 3", "Street 4", "Street 5"};
    String[] locality = {"Locality 1", "Locality 2", "Locality 3", "Locality 4", "Locality 5"};
    String[] zipCode = {"12345", "23456", "34567", "45678", "56789"};
    String[] mobileNumber = {"1234567890", "2345678901", "3456789012", "4567890123", "5678901234"};
    String[] telephoneNumber = {"1111111111", "2222222222", "3333333333", "4444444444", "5555555555"};
    BankImp bankAccount = new BankImp(accountNumbers[0], names[0], balances[0], doorNo[0], streetNo[0], locality[0], zipCode[0], mobileNumber[0], telephoneNumber[0]);

    public Logic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bank");

        String choice ;
        do {
            System.out.print("Select login type (1. Manager, 2. User): ");
            int loginType = scanner.nextInt();

            boolean loggedIn = false;

            if (loginType == 1) {
                loggedIn = ManagerLogin.login();

                if (loggedIn) {
                    System.out.println("Manager Login successful!");
                    bankAccount.createAccount();
                    bankAccount.displayAccountDetails();
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
                    }

                }
            }
            if (!loggedIn) {
                System.out.println("Invalid username or password. Login failed!");
            }
            System.out.println(" Do you want to continue :");
            choice =scanner.nextLine();

        } while (!choice.equalsIgnoreCase("no"));

        System.out.println("Logging off.........");
        System.out.println("Thank you!!");
        System.out.println("Bye! Have a nice day.");
    }
}

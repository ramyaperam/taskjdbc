package corejava8;
import java.util.Scanner;

public class BankImp implements BankAccount {

    private static String accountNumber;
    private static String name;
    private static double balance;
    private String password;
    private static String doorNo;
    private static String streetNo;
    private static String locality;
    private static String zipCode;
    private static String mobileNumber;
    private String telephoneNumber;

    public BankImp(String accountNumber, String name, double balance, String password, String doorNo, String streetNo, String locality, String zipCode, String mobileNumber) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.doorNo = doorNo;
        this.streetNo = streetNo;
        this.locality = locality;
        this.zipCode = zipCode;
        this.mobileNumber = mobileNumber;
    }



    @Override
    public  void displayAccountDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Address: " + doorNo + ", " + streetNo + ", " + locality + ", " + zipCode);
        System.out.println("Mobile Number: " + mobileNumber);
    }
    public static void createAccount() {
        System.out.println("Enter user details:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Door No: ");
        doorNo = scanner.nextLine();
        System.out.print("Street No: ");
        streetNo = scanner.nextLine();
        System.out.print("Locality: ");
        locality = scanner.nextLine();
        System.out.print("Zip Code: ");
        zipCode = scanner.nextLine();
        System.out.print("Mobile Number: ");
        mobileNumber = scanner.nextLine();
        System.out.println("Account created successfully!");

    }
    @Override
    public  void checkBalance() {
        System.out.println("Balance: $" + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPassword() {
        return password;
    }
}

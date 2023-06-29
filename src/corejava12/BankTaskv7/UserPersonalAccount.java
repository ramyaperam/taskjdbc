package corejava12.BankTaskv7;
import java.util.*;
public class UserPersonalAccount extends UserBankAccount {
    private String address;
    private String zipCode;
    private String phoneNumber;
    private String name;
    public UserPersonalAccount(String accountNumber, String accountHolderName, double
            balance, String password,
                               String address, String zipCode, String phoneNumber) {
        super(accountNumber, accountHolderName, balance, password);
        this.address = address;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.name = accountHolderName;
    }
    public String getAddress() {
        return address;
    }
    public String getZipCode() {
        return zipCode;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getName() {
        return name;
    }
    public static void personalAccountMenu() {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" ---- Personal account menu ----");
        boolean exit = false;
        do {

            System.out.println("Select an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Exit");
            System.out.print("Choice:");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                   System.out.println( UserBankAccount.getBalance());
                    break;
                case 2:
                    System.out.println("Exiting Personal Account Menu.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (!exit);
    }
}
package corejava12.BankTaskv7;

import java.util.Map;
import java.util.Scanner;
public class managerLogin  {
    public BankImp bankImp;
    public static boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Manager Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Manager Password: ");
        String password = scanner.nextLine();
        String storedPassword = "admin123";
        if (storedPassword.equals(password)) {
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }

    public void addUser(Scanner scanner) {
        System.out.print("Enter User ID: ");
        String id = scanner.next();
        scanner.nextLine();
        System.out.print("Enter User Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Initial Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter User Password: ");
        String password = scanner.nextLine();

        System.out.println("Select account type (1. Personal Account, 2. Business Account): ");
        int accountType = scanner.nextInt();
        scanner.nextLine();

        if (accountType == 1) {
            System.out.print("Enter User Address: ");
            String address = scanner.nextLine();
            System.out.print("Enter User Phone Number: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Enter User PAN Number: ");
            String panNumber = scanner.nextLine();

            UserPersonalAccount userAccount = new UserPersonalAccount(id, name, amount, password, address, phoneNumber, panNumber);
            UserLogin.accounts.put(id, userAccount);
            UserLogin.accountPasswords.put(id, password);

            System.out.println("Personal Account added successfully!");
        } else if (accountType == 2) {
            System.out.print("Enter Business Name: ");
            String businessName = scanner.nextLine();
            System.out.print("Enter Business Address: ");
            String businessAddress = scanner.nextLine();
            System.out.print("Enter Business Phone Number: ");
            String phoneNumber = scanner.nextLine();

            UserBusinessAccount userAccount = new UserBusinessAccount(id, businessName, amount, password, businessAddress, phoneNumber);
            UserLogin.accounts.put(id, userAccount);
            UserLogin.accountPasswords.put(id, password);

            System.out.println("Business Account added successfully!");
        } else {
            System.out.println("Invalid account type.");
        }
    }

    public void modifyUser(Scanner scanner) {
        System.out.print("Enter User ID: ");
        String id = scanner.next();
        scanner.nextLine();

        UserBankAccount userAccount = UserLogin.accounts.get(id);
        if (userAccount != null) {
            if (userAccount instanceof UserPersonalAccount) {
                UserPersonalAccount personalAccount = (UserPersonalAccount) userAccount;

                System.out.println("Current User Details:");
                System.out.println("ID: " + personalAccount.getAccountNumber());
                System.out.println("Name: " + personalAccount.getName());
                System.out.println("Amount: " + personalAccount.BankImp.getBalance());
                System.out.println("Address: " + personalAccount.getAddress());
                System.out.println("Phone Number: " + personalAccount.getPhoneNumber());
                System.out.println("PAN Number: " + personalAccount.getAccountNumber());

                System.out.println("Enter new User Details (Press Enter to skip):");
                System.out.print("Enter User Name: ");
                String name = scanner.nextLine();
                if (!name.isEmpty()) {
                    personalAccount.getName();
                }

                System.out.print("Enter Initial Amount: ");
                String amountStr = scanner.nextLine();
                if (!amountStr.isEmpty()) {
                    double amount = Double.parseDouble(amountStr);
                    personalAccount.getBalance();
                }

                System.out.print("Enter User Address: ");
                String address = scanner.nextLine();
                if (!address.isEmpty()) {
                    personalAccount.getAddress();
                }

                System.out.print("Enter User Phone Number: ");
                String phoneNumber = scanner.nextLine();
                if (!phoneNumber.isEmpty()) {
                    personalAccount.getPhoneNumber();
                }

                System.out.print("Enter User PAN Number: ");
                String panNumber = scanner.nextLine();
                if (!panNumber.isEmpty()) {
                    personalAccount.getAccountNumber();
                }

                System.out.println("Personal Account modified successfully!");

            } else if (userAccount instanceof UserBusinessAccount) {
                UserBusinessAccount businessAccount = (UserBusinessAccount) userAccount;

                System.out.println("Current User Details:");
                System.out.println("ID: " + businessAccount.getAccountNumber());
                System.out.println("Business Name: " + businessAccount.getCompanyName());
                System.out.println("Amount: " + businessAccount.BankImp.getBalance());
                System.out.println("Business Address: " + businessAccount.getAddress());
                System.out.println("Phone Number: " + businessAccount.getContactNumber());

                System.out.println("Enter new User Details (Press Enter to skip):");
                System.out.print("Enter Business Name: ");
                String businessName = scanner.nextLine();
                if (!businessName.isEmpty()) {
                    businessAccount.getCompanyName();
                }

                System.out.print("Enter Initial Amount: ");
                String amountStr = scanner.nextLine();
                if (!amountStr.isEmpty()) {
                    double amount = Double.parseDouble(amountStr);
                    businessAccount.getBalance();
                }

                System.out.print("Enter Business Address: ");
                String businessAddress = scanner.nextLine();
                if (!businessAddress.isEmpty()) {
                    businessAccount.getAddress();
                }

                System.out.print("Enter Business Phone Number: ");
                String phoneNumber = scanner.nextLine();
                if (!phoneNumber.isEmpty()) {
                    businessAccount.getContactNumber();
                }

                System.out.println("Business Account modified successfully!");
            }
        } else {
            System.out.println("User not found.");
        }
    }

    public void deleteUser(Scanner scanner) {
        System.out.print("Enter User ID: ");
        String id = scanner.next();
        scanner.nextLine();

        UserBankAccount userAccount = UserLogin.accounts.get(id);
        if (userAccount != null) {
            UserLogin.accounts.remove(id);
            UserLogin.accountPasswords.remove(id);
            System.out.println("User deleted successfully!");
        } else {
            System.out.println("User not found.");
        }
    }

    public void searchUser(Scanner scanner) {
        System.out.print("Enter User ID: ");
        String id = scanner.next();
        scanner.nextLine();

        UserBankAccount userAccount = UserLogin.accounts.get(id);
        if (userAccount != null) {
            System.out.println("User Details:");
            System.out.println("ID: " + userAccount.getAccountNumber());
            if (userAccount instanceof UserPersonalAccount) {
                UserPersonalAccount personalAccount = (UserPersonalAccount) userAccount;
                System.out.println("Name: " + personalAccount.getName());
                System.out.println("Amount: " + personalAccount.getBalance());
                System.out.println("Address: " + personalAccount.getAddress());
                System.out.println("Phone Number: " + personalAccount.getPhoneNumber());
                System.out.println("PAN Number: " + personalAccount.getAccountNumber());
            } else if (userAccount instanceof UserBusinessAccount) {
                UserBusinessAccount businessAccount = (UserBusinessAccount) userAccount;
                System.out.println("Business Name: " + businessAccount.getCompanyName());
                System.out.println("Amount: " + businessAccount.getBalance());
                System.out.println("Business Address: " + businessAccount.getAddress());
                System.out.println("Phone Number: " + businessAccount.getContactNumber());
            }
        } else {
            System.out.println("User not found.");
        }
    }

    public void viewAllUsers() {
        System.out.println("All Users:");
        for (Map.Entry<String, UserBankAccount> entry : UserLogin.accounts.entrySet()) {
            UserBankAccount userAccount = entry.getValue();
            System.out.println("ID: " + userAccount.getAccountNumber());
            if (userAccount instanceof UserPersonalAccount) {
                UserPersonalAccount personalAccount = (UserPersonalAccount) userAccount;
                System.out.println("Name: " + personalAccount.getName());
                System.out.println("Amount: " + personalAccount.getBalance());
                System.out.println("Address: " + personalAccount.getAddress());
                System.out.println("Phone Number: " + personalAccount.getPhoneNumber());
                System.out.println("PAN Number: " + personalAccount.getAccountNumber());
            } else if (userAccount instanceof UserBusinessAccount) {
                UserBusinessAccount businessAccount = (UserBusinessAccount) userAccount;
                System.out.println("Business Name: " + businessAccount.getCompanyName());
                System.out.println("Business account number : " + businessAccount.getAccountNumber());
                System.out.println("Amount: " + businessAccount.getBalance());
                System.out.println("Business Address: " + businessAccount.getAddress());
            }
            System.out.println("-----------------------------");
        }
    }
}

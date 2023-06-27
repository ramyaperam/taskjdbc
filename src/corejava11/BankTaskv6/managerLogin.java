package corejava11.BankTaskv6;
import java.util.*;
 public class managerLogin {
        private BankImp newUser;
        private static final String username = "admin";
        private static final String password = "admin123";
        private BankImp[] userList;
        private int Users;
     private BankImp manager;


     public managerLogin() {
         manager = new BankImp(username, "Manager", 0.0, password, "", "", "", "", "");
         userList = new BankImp[100];
         Users = 0;
     }
    public static boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter manager username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter manager password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("manager login successfull ");
            return true;
        } else {
            System.out.println("Invalid manager username or password.");
            return false;
        }
    }

    public void manageUsers(Scanner scanner) {
        boolean continueManagement = true;

        while (continueManagement) {
            System.out.println("\n===== Manager Menu =====");
            System.out.println("1. Add User");
            System.out.println("2. Modify User");
            System.out.println("3. Delete User");
            System.out.println("4. Search User");
            System.out.println("5. Print All Users");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addUser(scanner);
                    break;
                case 2:
                    modifyUser(scanner);
                    break;
                case 3:
                    deleteUser(scanner);
                    break;
                case 4:
                    searchUser(scanner);
                    break;
                case 5:
                    printAllUsers();
                    break;
                case 6:
                    continueManagement = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public void addUser(Scanner scanner) {
        System.out.println("Enter user details:");

        System.out.print("Account Number: ");
        String accountNumber = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.print("Door No: ");
        String doorNo = scanner.nextLine();
        System.out.print("Street No: ");
        String streetNo = scanner.nextLine();
        System.out.print("Locality: ");
        String locality = scanner.nextLine();
        System.out.print("Zip Code: ");
        String zipCode = scanner.nextLine();
        System.out.print("Mobile Number: ");
        String mobileNumber = scanner.nextLine();
        System.out.print("email ");
        String email = scanner.nextLine();


        BankImp newUser = new BankImp(accountNumber, name, balance, password, doorNo, streetNo, locality, zipCode,
                mobileNumber);

        userList[Users] = newUser;
        Users++;

        System.out.println("User added successfully.");
    }

    public void modifyUser(Scanner scanner) {
        System.out.print("Enter account number of the user to modify: ");
        String accountNumber = scanner.nextLine();
        scanner.nextLine();
        for (int i = 0; i < Users; i++) {
            if (userList[i] != null && userList[i].getAccountNumber().equals(accountNumber)) {
                BankImp user = userList[i];
                System.out.println("Enter new details for the user:");
                scanner.nextLine();
                System.out.print("Name: ");
                String name = scanner.nextLine();
                user.setName(name);
                System.out.print("Balance: ");
                double balance = scanner.nextDouble();
                user.setBalance(balance);
                scanner.nextLine();

                System.out.print("Password: ");
                String password = scanner.nextLine();
                user.setPassword(password);

                System.out.print("Door No: ");
                String doorNo = scanner.nextLine();
                user.setDoorNo(doorNo);

                System.out.print("Street No: ");
                String streetNo = scanner.nextLine();
                user.setStreetNo(streetNo);

                System.out.print("Locality: ");
                String locality = scanner.nextLine();
                user.setLocality(locality);

                System.out.print("Zip Code: ");
                String zipCode = scanner.nextLine();
                user.setZipCode(zipCode);

                System.out.print("Mobile Number: ");
                String mobileNumber = scanner.nextLine();
                user.setMobileNumber(mobileNumber);
                System.out.print("email ");
                String email = scanner.nextLine();
                user.setEmail(email);

                System.out.println("User modified successfully.");
                return;
            }
        }

        System.out.println("User not found with the specified account number.");
    }
    public void deleteUser(Scanner scanner) {
        System.out.print("Enter account number of the user to delete: ");
        String accountNumber = scanner.nextLine();
        scanner.nextLine();
        for (int i = 0; i < Users; i++) {
            if (userList[i] != null && userList[i].getAccountNumber().equalsIgnoreCase(accountNumber)) {
                userList[i]=null;
                System.out.println("User deleted successfully.");
                return;
            }
        }
        System.out.println("User not found with the specified account number.");
    }

     public void searchUser(Scanner scanner) {
         System.out.print("Enter account number of the user to search: ");
         String accountNumber = scanner.nextLine();
         scanner.nextLine();
         for (int i = 0; i < Users; i++) {
             if (userList[i] != null && userList[i].getAccountNumber().equalsIgnoreCase(accountNumber)) {
                 System.out.println("User found:");
                 userList[i].displayAccountDetails();
                 return;
             }
         }

         System.out.println("User not found with the specified account number.");
     }
    public void printAllUsers() {
        if (Users == 0) {
            System.out.println("No users found.");
        } else {
            System.out.println("All Users:");
            for (int i = 0; i <userList.length; i++) {
                if (userList[i] != null) {
                    userList[i].displayAccountDetails();
                }
            }
        }
    }
}
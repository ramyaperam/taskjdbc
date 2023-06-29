package corejava12.BankTaskv7;

import java.util.Scanner;
public class UserBusinessAccount extends UserBankAccount {
        private String companyName;
        private String address;
        private String contactNumber;
        private String zipCode;
        private String phoneNumber;
        private String name;
        private double balance;
        public UserBusinessAccount(String accountNumber, String accountHolderName, double
                balance, String password,
                                   String address, String zipCode) {
            super(accountNumber, accountHolderName, balance, password);
            this.address = address;
            this.zipCode = zipCode;
            this.phoneNumber = phoneNumber;
            this.name = accountHolderName;
            this.balance =balance;
        }
        public String getCompanyName() {
            return companyName;
        }
        public String getAddress() {
            return address;
        }
        public String getContactNumber() {
            return contactNumber;
        }

        public static void businessAccountMenu() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("----- Business Account Menu -----");
            boolean exit = false;
            do {
                System.out.println("Select an option:");
                System.out.println("1. Check Balance");
                System.out.println("2. Exit" );

                System.out.print("Choice:");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println(UserBankAccount.getBalance());
                        break;
                    case 2:
                        System.out.println("Exiting Business Account Menu.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } while (!exit);
        }
}

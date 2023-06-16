package corejava3;
import java.util.Scanner;
public class bankTaskV1 {
        private String[] accountNumbers;
        private String[] names;
        private double[] balances;
        private String[] passwords;

        public bankTaskV1(String[] accountNumbers, String[] names, double[] balances, String[] passwords) {
            this.accountNumbers = accountNumbers;
            this.names = names;
            this.balances = balances;
            this.passwords = passwords;
        }

        public String[] getAccountNumbers() {
            return accountNumbers;
        }

        public String[] getNames() {
            return names;
        }

        public double[] getBalances() {
            return balances;
        }

        public String[] getPasswords() {
            return passwords;
        }

        public void displayBalance(String accountNumber) {
            int index = -1;
            for (int i = 0; i < accountNumbers.length; i++) {
                if (accountNumbers[i].equals(accountNumber)) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                System.out.println("Account Holder: " + names[index]);
                System.out.println("Account Balance: " + balances[index]);
            } else {
                System.out.println("Account not found! Please check your account number.");
            }
        }

        public boolean authenticateAccount(String accountNumber, String password) {
            int index = -1;
            for (int i = 0; i < accountNumbers.length; i++) {
                if (accountNumbers[i].equals(accountNumber)) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                if (passwords[index].equals(password)) {
                    System.out.println("Authentication successful!");
                    return true;
                } else {
                    System.out.println("Authentication failed! Please check your password.");
                }
            } else {
                System.out.println("Account not found! Please check your account number.");
            }

            return false;
        }
    }


package corejava5;

public class BankAccount {
        private String accountNumber;
        private String accountHolderName;
        private double balance;
        private String password;

        public BankAccount(String accountNumber, String accountHolderName, double balance, String password) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
            this.password = password;
        }

        public boolean authenticate(String password) {
            return this.password.equals(password);
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public String getAccountHolderName() {
            return accountHolderName;
        }

        public double getBalance() {
            return balance;
        }
    }

package corejava5;

public class Bank {

        private BankAccount[] accounts;

        public Bank(BankAccount[] accounts) {
            this.accounts = accounts;
        }

        public BankAccount getAccount(String accountNumber) {
            for (BankAccount account : accounts) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    return account;
                }
            }
            return null;
        }

        public boolean authenticateAccount(String accountNumber, String password) {
            for (BankAccount account : accounts) {
                if (account.getAccountNumber().equals(accountNumber) && account.authenticate(password)) {
                    return true;
                }
            }
            return false;
        }
    }

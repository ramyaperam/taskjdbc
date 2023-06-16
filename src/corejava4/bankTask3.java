package corejava4;

public class bankTask3 {
        private bankAcountTask3[] accounts;

        public bankTask3(bankAcountTask3[] accounts) {
            this.accounts = accounts;
        }

        public boolean authenticateAccount(String accountNumber, String password) {
            for (bankAcountTask3 account : accounts) {
                if (account.authenticate(accountNumber, password)) {
                    return true;
                }
            }
            return false;
        }

        public bankAcountTask3 getAccount(String accountNumber) {
            for (bankAcountTask3 account : accounts) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    return account;
                }
            }
            return null;
        }
    }


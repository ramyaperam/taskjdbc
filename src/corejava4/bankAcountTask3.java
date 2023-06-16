package corejava4;

public class bankAcountTask3 {
        private String accountNumber;
        private String name;
        private double balance;
        private String password;

        public bankAcountTask3(String accountNumber, String name, double balance, String password) {
            this.accountNumber = accountNumber;
            this.name = name;
            this.balance = balance;
            this.password = password;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public String getPassword() {
            return password;
        }

        public void displayBalance() {
            System.out.println("Account Holder: " + name);
            System.out.println("Account Balance: " + balance);
        }

        public boolean authenticate(String accountNumber, String password) {
            return (accountNumber.equals(accountNumber) && password.equals(password));
        }

    public String getName() {
            return name;
    }
}

package corejava12.BankTaskv7;

public class UserBankAccount {
    public BankImp BankImp;
    private String accountNumber;
    private String accountHolderName;
    private  static double balance;
    private String password;
    public UserBankAccount(String accountNumber, String accountHolderName, double
            balance, String password) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.password = password;
    }
    // public boolean authenticate(String password) {
// return this.password.equals(password);
// }
    public String getAccountNumber() {
        return accountNumber;
    }
// public String getAccountHolderName() {
// return accountHolderName;
// }

    public static double getBalance() {
        return balance;
    }

}
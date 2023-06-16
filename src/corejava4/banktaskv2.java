package corejava4;

public class banktaskv2 {
    protected String[] accountNumbers;
    protected String[] names;
    protected double[] balances;

    public banktaskv2(String[] accountNumbers, String[] names, double[] balances) {
        this.accountNumbers = accountNumbers;
        this.names = names;
        this.balances = balances;
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
}

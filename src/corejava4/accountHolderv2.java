package corejava4;

public class accountHolderv2 extends banktaskv2 {
    protected String[] passwords;

    public accountHolderv2(String[] accountNumbers, String[] names, double[] balances, String[] passwords) {
        super(accountNumbers, names, balances);
        this.passwords = passwords;
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

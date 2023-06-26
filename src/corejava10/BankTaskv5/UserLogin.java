package corejava10.BankTaskv5;

import corejava10.InvalidCredentialsException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserLogin {
    private static final String[] accountNumbers = {"123", "234", "345", "456", "567"};
    private static final String[] passwords = {"password123", "password234", "password345", "password456", "password567"};

    public static boolean login() throws InvalidCredentialsException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user account number: ");
        String inputAccountNumber = scanner.nextLine();
        System.out.print("Enter user password: ");
        String inputPassword = scanner.nextLine();
        try {

            for (int i = 0; i < accountNumbers.length; i++) {
                if (inputAccountNumber.equals(accountNumbers[i]) && inputPassword.equals(passwords[i])) {
                    return true;
                } else {
                    throw new InvalidCredentialsException(" user account number  and password don't match.");
                }
            }
        } catch (InvalidCredentialsException e) {
            System.out.println( e.getMessage() + "\n Invalid credentials: Please check it once !!! " );
        }
        return false;
    }
}

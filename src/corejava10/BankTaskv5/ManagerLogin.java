package corejava10.BankTaskv5;
import corejava10.InvalidCredentialsException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManagerLogin {
    private static final String username = "admin";
    private static final String password = "admin123";

    public static boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter manager username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter manager password: ");
        String inputPassword = scanner.nextLine();

        try {
            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                return true;
            } else {
                throw new InvalidCredentialsException("Manager username and password don't match.");
            }
        } catch (InvalidCredentialsException e) {
            System.out.println( e.getMessage() + "\n Invalid credentials: Please check it once !!! " );
            return false;
        }
    }
}

package corejava8;
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

        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}

package corejava11.BankTaskv6;
import java.util.*;
public class UserLogin {
        private static final String USER_USERNAME = "user";
        private static final String USER_PASSWORD = "user";

        public static boolean login() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter User Username: ");
            String username = scanner.nextLine();
            System.out.print("Enter User Password: ");
            String password = scanner.nextLine();

            return username.equals(USER_USERNAME) && password.equals(USER_PASSWORD);
        }
    }

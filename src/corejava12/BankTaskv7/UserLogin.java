package corejava12.BankTaskv7;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class UserLogin {
    static Map<String, String> accountPasswords;
    static Map<String, UserBankAccount>accounts;
    static {
        accountPasswords = new HashMap<>();
        accountPasswords.put("123", "password123");
        accountPasswords.put("234", "password234");
        accountPasswords.put("345", "password345");
        accountPasswords.put("456", "password456");
        accountPasswords.put("567", "password567");
        accountPasswords.put("678", "password678");
        accountPasswords.put("789", "password789");
        accounts = new HashMap<>();
        accounts.put("123", new UserPersonalAccount("123", "ramya", 1000, "password123", "Street 1", "12345", "1234567890"));
        accounts.put("234", new UserPersonalAccount("234", "ram", 2000, "password234", "Street 2", "12345", "1234567890"));
        accounts.put("345", new UserPersonalAccount("345", "sam", 3000, "password345", "Street 3", "12345", "1234567890"));
        accounts.put("456", new UserPersonalAccount("456", "lex", 4000, "password456", "Street 4", "12345", "1234567890"));
        accounts.put("567", new UserPersonalAccount("567", "siri", 5000, "password567", "Street 5", "12345", "1234567890"));
        accounts.put("678", new UserBusinessAccount("678", "ABC Corp", 10000, "password678", "ABC Corp Address", "9898989898"));
        accounts.put("789", new UserBusinessAccount("789", "XYZ Ltd", 20000, "password789", "XYZ Ltd Address", "8888899999"));
    }
    public static boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter User Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter User Password: ");
        String password = scanner.nextLine();
        String storedPassword = accountPasswords.get(username);
        if (storedPassword != null &&storedPassword.equals(password)) {
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }
}
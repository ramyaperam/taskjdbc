package corejava16;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Taskjdbc2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB?useSSL=false", "root", "Ram11@ya");
            if (con == null) {
                System.out.println("Connection Failed");
                return;
            } else {
                System.out.println("Success... Connection with the database is established");
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter how many records you want to insert?");
            int records = scanner.nextInt();

            Statement statement = con.createStatement();

            int count = 0;
            while (count < records) {
                int pid = 0;
                try {
                    System.out.println("Enter product number:");
                    pid = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println(" enter valid product number : ");
                }
                String pname = null;
                try {
                    System.out.println("Enter product name:");
                    pname = scanner.next();
                } catch (Exception e) {
                    System.out.println(" enter valid product name : ");
                }
                int quantity = 0;
                try {
                    System.out.println("Enter quantity:");
                    quantity = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println(" enter valid quantity : ");
                }
                Double price = null;
                try {
                    System.out.println("Enter price :");
                    price = scanner.nextDouble();
                } catch (Exception e) {
                    System.out.println(" enter valid price : ");
                }

                String sqlQuery = "INSERT INTO product VALUES (" + pid + ", '" + pname + "', '" + quantity + "','" + price + "')";

                System.out.println(sqlQuery);

                int result = statement.executeUpdate(sqlQuery);

                if (result == 0) {
                    System.out.println("Failed to insert the record");
                } else {
                    count++;
                    System.out.println( count +"Record inserted successfully");

                }
            }

            statement.close();
            con.close();

            System.out.println(records + " record(s) successfully inserted");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}


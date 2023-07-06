package corejava16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Taskjdbc1 {
    public static void main(String[] args)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB?useSSL=false", "root","Ram11@ya");
            if(con==null)
            {
                System.out.println("Connection Failed ");
            }
            else{
                System.out.println("Success ... Connection with oracle DB is established ");
            }



            //connection established
            Statement statement = con.createStatement();
            boolean success = statement.execute("CREATE TABLE product(pid INT(5), pname VARCHAR(35), quantity INT(100),price DOUBLE(10,3))");
            if (!success) {
                System.out.println("Success... Table created");
            } else {
                System.out.println("Failed to create a table");
            }

        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}




//
//public class Taskjdbc2 {
//    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB?useSSL=false", "root", "Ram11@ya");
//            if (con == null) {
//                System.out.println("Connection Failed");
//                return;
//            } else {
//                System.out.println("Success... Connection with the database is established");
//            }
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter how many records you want to insert?");
//            int records = scanner.nextInt();
//
//            Statement statement = con.createStatement();
//
//            for (int i = 0; i < records; i++) {
//                System.out.println("Enter Student number:");
//                int no = scanner.nextInt();
//                System.out.println("Enter Student name:");
//                String name = scanner.next();
//                System.out.println("Enter the course enrolled:");
//                String course = scanner.next();
//
//                String sqlQuery = "INSERT INTO studentsnva VALUES (" + no + ", '" + name + "', '" + course + "')";
//
//                System.out.println(sqlQuery);
//
//                int result = statement.executeUpdate(sqlQuery);
//
//                if (result == 0) {
//                    System.out.println("Failed to insert the record");
//                } else {
//                    System.out.println( records +"Record inserted successfully");
//                }
//            }
//
//            statement.close();
//            con.close();
//
//            System.out.println(records + " record(s) successfully inserted");
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}

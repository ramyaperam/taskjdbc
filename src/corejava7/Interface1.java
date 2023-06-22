package corejava7;

public class Interface1 {
    public static void main(String[] args)
    {
        MySql mysql = new MySql();
    mysql.connect();
    OracleDB oracledb = new OracleDB();
    oracledb.connect();
    }
}

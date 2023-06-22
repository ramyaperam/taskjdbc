package corejava7;

public class MySql implements MyInterface {
    @Override
    public void connect()
    {
        System.out.println("Connecting to MySql");
    }
}

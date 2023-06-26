package corejava8.p1;

public class protection {
    int num1=100;
    private int num_private =200;
    protected int num_protected =300;
    public  int num_public;
    public protection()
    {
        System.out.println("Base class constructor :");
        System.out.println("num1 =  :" + num1 );
        System.out.println("num_private = " +num_private);
        System.out.println("num_protected = " +num_protected );
        System.out.println("num_public = " +num_public);
    }
    public int getNum1()
    {
        return num1;
    }
    public int getNum_private()
    {
        return num_private;
    }
    public int getNum_protected()
    {
        return num_protected;
    }
}

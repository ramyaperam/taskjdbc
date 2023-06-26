package corejava8.p2;
import corejava8.p1.protection;
public class OtherPackage {
    public OtherPackage()
    {
        protection protection=new protection();
        System.out.println("Base class constructor :");
        System.out.println("num1 =  :" + protection.getNum1() );
        System.out.println("num_private = " +protection.getNum_private());
        System.out.println("num_protected = " +protection.getNum_protected() );
        System.out.println("num_public = " +protection.num_public);
    }
}

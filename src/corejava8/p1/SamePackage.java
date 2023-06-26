package corejava8.p1;

public class SamePackage {
    SamePackage()
    {
        protection protection= new protection();
        System.out.println("Base class constructor :");
        System.out.println("num1 =  :" + protection.num1 );
       // System.out.println("num_private = " +protection.num_private);
        System.out.println("num_protected = " +protection.num_protected );
        System.out.println("num_public = " +protection.num_public);
    }
}

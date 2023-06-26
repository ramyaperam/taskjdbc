package corejava8.p1;

public class Derived extends  protection{
    Derived()
    {
        System.out.println("Base class constructor :");
        System.out.println("num1 =  :" + num1 );
//        System.out.println("num_private = " +num_private);  // private annot be accesses in other class even in same package
       System.out.println("num_protected = " +num_protected ); // protected can be accessed in same package

        System.out.println("num_public = " +num_public);
    }
}

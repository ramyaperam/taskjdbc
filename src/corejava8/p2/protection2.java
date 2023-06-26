package corejava8.p2;
import corejava8.p1.protection;
public class protection2 extends protection {
    public protection2() {
    protection protection = new protection();


        System.out.println("Base class constructor :");
        //System.out.println("num1 =  :" + protection.num1);
        //System.out.println("num_private = " +protection.num_private);
        //System.out.println("num_protected = " +protection.num_protected );
        System.out.println("num_public = " + protection.num_public);
    }
}
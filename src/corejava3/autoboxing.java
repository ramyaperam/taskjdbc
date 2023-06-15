package corejava3;

public class autoboxing {
    public static void main(String[] args) {
        int int1=4;
        float float1=2.3f;
        boolean boolean1=false;
        System.out.println("  Autoboxing Int");
        Integer intWrap=int1;
        System.out.println(intWrap+ " "+ int1 );
        System.out.println("Autoboxing  Float ");
        Float floatWrap=float1;
        System.out.println(floatWrap+" "+float1);
        System.out.println("  Autoboxing Boolean");
        Boolean booleanWrap=boolean1;
        System.out.println(booleanWrap+" "+boolean1);
        System.out.println("--------------------------");
        System.out.println(" Unboxing intger");
        int1=intWrap;
        System.out.println(intWrap+ " "+ int1 );
        System.out.println(" Unboxing Float ");
        float1=floatWrap;
        System.out.println(floatWrap+" "+float1);
        System.out.println(" Unboxing Boolean");
        boolean1=booleanWrap;
        System.out.println(booleanWrap+" "+boolean1);

    }
}

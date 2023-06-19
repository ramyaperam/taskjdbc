package corejava5;

public class overloadmain {
    public static void main(String[] args)
    {
        overload overload = new overload();
        overload.sum();
        overloadsub overloadsub=new overloadsub();
        System.out.println(overloadsub.sum(100,200));
    }
}

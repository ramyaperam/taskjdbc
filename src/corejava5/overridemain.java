package corejava5;

public class overridemain {
    public static void main(String[] args) {

        override override = new override();
        override.i = 10;
        override.j = 20;
        System.out.println(override.sum(override.i, override.j));
        overloadsub sub =new overloadsub();
        System.out.println(sub.sum(10,0));
    }
}

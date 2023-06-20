package corejava5.Staticclass;

public class StaticDemoMain {
    public static void main(String[] args){
        StaticDemo demo = new StaticDemo();
        demo.sum();
        StaticDemo.displayNum();
        System.out.println("Num2 :" +StaticDemo.num2);
    }
}

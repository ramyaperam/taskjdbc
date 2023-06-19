package corejava5;

public class overload {
    int num1=10, num2=20, sum=0;
    void sum() {
        sum=num1+num2;
        System.out.println(sum);
    }
    void sum(double num1, double num2) {
        System.out.println(num1+num2);
    }
}
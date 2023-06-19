package corejava5;
public class overloadsub extends overload {
    int sum(int i, int j) {
        return i+j;
    }
    void sum(double num1, int num2) {
        System.out.println(num1+num2);
    }
}

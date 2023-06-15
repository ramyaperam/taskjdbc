package corejava2;

public class even {
    public static void main(String[] args) {
        int num = 100;
        while (num <= 120) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}

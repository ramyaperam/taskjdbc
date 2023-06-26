package corejava9;
import java.util.*;
public class EH1 {
    public static void main(String [] args )
    {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println(" enter num1 : ");
            int num1 = scan.nextInt();
            System.out.println(" enter num2 : ");
            int num2 = scan.nextInt();
            int divide = num1/num2;
            System.out.println(num1 + " / " + num2 + " = "  + divide);
        } catch ( ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("Exception caught :");
        }
        catch(InputMismatchException ime)
        {
            System.out.println(" Input mismatch exception caught ");
        }
        System.out.println("After exception is caught .. you will believe ");
    }
}

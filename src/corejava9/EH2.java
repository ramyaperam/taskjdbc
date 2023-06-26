package corejava9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EH2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println(" enter num1 : ");
            int num1 = scan.nextInt();
            System.out.println(" enter num2 : ");
            int num2 = scan.nextInt();
            int divide = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + divide);
            int nums[] = {100, 200, 300};
            nums[99] = 300; // in this line it throws outofbound exception

        } catch(Exception e )
        {
            System.out.println("Exception caught " +e);
        }
//        catch (ArithmeticException | ArrayIndexOutOfBoundsException | InputMismatchException e) {
//            //e.printStackTrace();
//            System.out.println(" Arthematic Exception caught :");
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(" OOB exception  caught ");
//        } catch (InputMismatchException ime) {
//            System.out.println("mismatch exception caught  ");
//        }
        System.out.println("After try catch block .. program still runs ");
        int ctr =5;
        while(ctr >0 )
        {
            System.out.println(ctr);
            ctr--;
        }
    }
}

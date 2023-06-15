package corejava2;

import java.util.Scanner;

public class midpoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter input 1");
        int input1 = scan.nextInt();
        System.out.println("enter input 2");
        int input2 = scan.nextInt();
        while (input1 <= input2) {
            System.out.println("result  " + (input1 + input2) / 2);
            break;
        }
    }
}

//public class While2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the start number: ");
//        int input1 = scanner.nextInt();
//        System.out.print("Enter the end number: ");
//        int input2 = scanner.nextInt();
//        while(input1 < input2){
//            input1++; input2--;
//        }
//        System.out.println("mid point is: "+input1);
//}
//        }


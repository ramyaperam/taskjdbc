package corejava2;

import java.util.Scanner;

public class monthArray1 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int num=0;
        String[] arr= {"Jan","Feb","March","April","May","June","July","August","Sept","Oct","Nov","Dec"};
        System.out.println("Enter the month number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("You birthday is in"+" "+ arr[num-1]);
    }

}

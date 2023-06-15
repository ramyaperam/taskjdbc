package corejava2;

import java.util.Scanner;

public class infiniteloop {
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            for( ; ; )
            {
                String input=scan.nextLine();
                System.out.println("Enter user input");
                if(input.equalsIgnoreCase("yes")) {
                    System.out.println("Java is esy to learn");
                }else {
                    break;
                }
            }
        }
    }

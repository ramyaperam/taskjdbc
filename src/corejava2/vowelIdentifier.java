package corejava2;

import java.util.Scanner;

public class vowelIdentifier {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter character");
        char c= scan.next().charAt(0);
            switch (Character.toUpperCase(c)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println(c + " is a vowel.");
                    break;
                default:
                    System.out.println(c + " is a consonant.");
                    break;
            }
    }
}

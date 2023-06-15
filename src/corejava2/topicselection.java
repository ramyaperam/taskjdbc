package corejava2;
import java.util.Scanner;
public class topicselection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
         int c=sc.nextInt();
        switch(c) {
            case 1:
                System.out.println("Enter your selection");
                c=sc.nextInt();
                switch(c) {
                    case 1:
                        System.out.println("You have selected Java script as topic and js variables as sub topic");
                        break;
                    case 2:
                        System.out.println("You have selected Java script as topic and ES6 as sub topic");
                        break;
                    case 3:
                        System.out.println("You have selected Java script as topic and promises as sub topic");
                        break;
                }
                break;
            case 2:
                System.out.println("Enter your selection");
                c=sc.nextInt();
                switch(c) {
                    case 1:
                        System.out.println("You have selected Java as topic and core Java as sub topic");
                        break;
                    case 2:
                        System.out.println("You have selected Java as topic and Multithrading as sub topic");
                        break;
                    case 3:
                        System.out.println("You have selected Java as topic and Swing as sub topic");
                        break;
                }
                break;
            case 3:
                System.out.println("Enter your selection");
                c=sc.nextInt();
                switch(c) {
                    case 1:
                        System.out.println("You have selected RDBMS as topic and SQL as sub topic");
                        break;
                    case 2:
                        System.out.println("You have selected RDBMS as topic and Oracle as sub topic");
                        break;
                    case 3:
                        System.out.println("You have selected RDBMS as topic and MySQL as sub topic");
                        break;
                }
                break;
            default:
                System.out.println("invalid input");
        }
    }

}
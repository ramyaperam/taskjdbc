package corejava1;
import java.util.*;
public class rectangle {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                System.out.print("Enter the length of side 1: ");
                double side1 = scan.nextDouble();
                System.out.print("Enter the length of side 2: ");
                double side2 = scan.nextDouble();
                if (side1 == side2 ) {
                    System.out.println("This is square");
                } else {
                    System.out.println("Th is rectangle.");
                }
            }
        }

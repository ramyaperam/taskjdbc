package corejava3;
import java.util.Scanner;
public class equationmain {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
               System.out.print("Enter the value of a: ");
                    int a = scanner.nextInt();

                    System.out.print("Enter the value of b: ");
                    int b = scanner.nextInt();

                    System.out.print("Enter the value of c: ");
                    int c = scanner.nextInt();

                    int result = 3 * a + 5 * b - 2 * c;

                    System.out.println("The value of the solved equation is :" + result);
                }
            }



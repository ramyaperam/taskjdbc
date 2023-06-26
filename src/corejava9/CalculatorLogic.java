package corejava9;
import java.util.Scanner;
public class CalculatorLogic {
    public CalculatorLogic()
    {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        do {
            try {
                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();
                System.out.println("Choose an operation (+, -, *, /, %): ");
                String operator = scanner.next();

                double result = 0.0;
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        System.out.println("Result of " + num1 + " + " + num2 + " = " + result);
                        break;
                    case "-":
                        result = num1 - num2;
                        System.out.println("Result of " + num1 + " - " + num2 + " = " + result);
                        break;
                    case "*":
                        result = num1 * num2;
                        System.out.println("Result of " + num1 + " * " + num2 + " = " + result);
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result of " + num1 + " / " + num2 + " = " + result);
                        } else {
                            System.out.println("Arithmetic exception: ");
                        }
                        break;
                    case "%":
                        if (num2 != 0) {
                            result = num1 % num2;
                            System.out.println("Result of " + num1 + " % " + num2 + " = " + result);
                        } else {
                            System.out.println("Arithmetic exception: ");
                        }
                        break;
                    default:
                        System.out.println("Invalid operator selected!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter valid numbers.");
                scanner.nextLine(); // Clear the input buffer
            }
            System.out.print("Do you want to exit? (yes/no): ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("yes")) {
                exit = true;
                System.out.println("Thanks for using the calculator!");
            }
        } while (!exit);

        scanner.close();
    }
    }
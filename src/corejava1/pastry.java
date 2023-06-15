package corejava1;
import java.util.*;
public class pastry {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] pastryQuantities = new int[4];
            String[] pastryNames = {"black current", "chocolate", "red valvet", "white chocolate"};
            for (int i = 0; i < 4; i++) {
                System.out.print("Enter the quantity of " + pastryNames[i] + ": ");
                pastryQuantities[i] = scanner.nextInt();
            }
            for (int i = 0; i < 4; i++) {
                int quantity = pastryQuantities[i];
                double pastryPrice = calculatePastryPrice(i);
                double totalAmount = quantity * pastryPrice;
                System.out.println(pastryNames[i] + " - Quantity: " + quantity + " - Total Amount: $" + totalAmount);
            }
        }
        public static double calculatePastryPrice(int pastryType) {

            double[] prices = {3, 4, 5, 6};
            return prices[pastryType];
        }
    }


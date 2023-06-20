package corejava5.CarDealerTask;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of salespersons: ");
        int numSalespersons = scanner.nextInt();

        Salesperson[] salespersons = new Salesperson[numSalespersons];

        for (int i = 0; i < numSalespersons; i++) {
            System.out.print("Enter the name of salesperson " + (i + 1) + ": ");
            String salespersonName = scanner.next();
            salespersons[i] = new Salesperson(salespersonName);
        }

        int numCarSales = 0;
        boolean continueSales = true;

        while (continueSales) {
            System.out.println("\nCar Sale " + (numCarSales + 1));
            System.out.print("Enter the salesperson number (1-" + numSalespersons + ") or 0 to finish: ");
            int salespersonNum = scanner.nextInt();
            scanner.nextLine();

            if (salespersonNum == 0) {
                continueSales = false;
                break;
            }

            if (salespersonNum < 1 || salespersonNum > numSalespersons) {
                System.out.println("Invalid salesperson number. Try again.");
                continue;
            }

            System.out.print("Enter the car brand: ");
            String carBrand = scanner.nextLine();

            System.out.print("Enter the car model: ");
            String carModel = scanner.nextLine();

            System.out.print("Enter the car price: ");
            double carPrice = scanner.nextDouble();
            scanner.nextLine();

            Car car = new Car(carModel, carBrand, carPrice);
            salespersons[salespersonNum - 1].sellCar(car);
            numCarSales++;
        }

        System.out.println("\nCar Sales Summary:");
        for (int i = 0; i < numSalespersons; i++) {
            salespersons[i].displaySalesSummary();
        }
    }
}

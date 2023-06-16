package corejava2;
import java.util.Scanner;

public class iceCreamProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] quantities = new int[8];
        double[] prices = {2, 3, 4, 5, 4.5, 8, 6, 7};
        double[] flavorTotalAmounts = new double[8];
        double totalAmount = 0;
        int cartSerialNumber = 1;

        boolean stop = false;
        while (!stop) {
            System.out.println("Welcome to the Ice Cream Shop!");
            System.out.println("Please select an option:");
            System.out.println("1. Order Ice Cream Online");
            System.out.println("2. Purchase Ice Cream from the Shop");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Online Ordering");
                    System.out.println("Welcome to Online ordering!");
                    System.out.print("Enter your name: ");
                    String name = scanner.next();
                    System.out.println("Hello, " + name + "! How can I help you?");
                    System.out.println("These are the flavors we have: ");
                    System.out.println("1. Vanilla\n2. Chocolate\n3. Strawberry");
                    System.out.print("Enter the flavor of ice cream you need: ");
                    String flavor = scanner.next();
                    boolean continueOnline = true;
                    while (continueOnline) {
                        System.out.println("\nAvailable flavors:");
                        System.out.println("1. Vanilla\n2. Chocolate\n3. Strawberry\n4. Mango\n" +
                                "5. Nuts\n6. Strawberry Cheesecake\n7. Salted Caramel\n8. Pistachio");
                        System.out.print("Enter the flavor number: ");
                        int flavorOnline = scanner.nextInt();
                        System.out.print("Enter the quantity: ");
                        int quantityOnline = scanner.nextInt();

                        if (flavorOnline >= 1 && flavorOnline <= 8) {
                            quantities[flavorOnline - 1] += quantityOnline;
                            double amountOnline = prices[flavorOnline - 1] * quantityOnline;
                            flavorTotalAmounts[flavorOnline - 1] += amountOnline;
                            totalAmount += amountOnline;

                            System.out.println("\nCart Details:");
                            System.out.println("Serial\t\tFlavor\t\tQuantity\tPrice\t\tTotal Amount");
                            System.out.println("---------------------------------------------------------");
                            int serial = 1;
                            for (int i = 0; i < quantities.length; i++) {
                                if (quantities[i] > 0) {
                                    String item;
                                    switch (i + 1) {
                                        case 1:
                                            item = "Vanilla";
                                            break;
                                        case 2:
                                            item = "Chocolate";
                                            break;
                                        case 3:
                                            item = "Strawberry";
                                            break;
                                        case 4:
                                            item = "Mango";
                                            break;
                                        case 5:
                                            item = "Nuts";
                                            break;
                                        case 6:
                                            item = "Strawberry Cheesecake";
                                            break;
                                        case 7:
                                            item = "Salted Caramel";
                                            break;
                                        case 8:
                                            item = "Pistachio";
                                            break;
                                        default:
                                            item = "Unknown";
                                            break;
                                    }
                                    System.out.printf("%d\t\t%s\t\t%d\t\t%.2f\t\t%.2f\n",
                                            serial, item, quantities[i], prices[i], flavorTotalAmounts[i]);
                                    serial++;
                                }
                            }
                            System.out.println("---------------------------------------------------------");
                            System.out.println("Total Amount: $" + totalAmount);

                            // Increment the cart serial number for the next cart
                            cartSerialNumber = serial;
                        } else {
                            System.out.println("Invalid flavor number!");
                        }

                        System.out.print("\nDo you want to order more? (y/n): ");
                        String continueOnlineStr = scanner.next();
                        continueOnline = continueOnlineStr.equalsIgnoreCase("y");
                    }

                    break;

                case 2:
                    System.out.println("Purchase from the Shop");
                    System.out.println("Welcome to the Shop!");
                    System.out.println("These are the flavors we have: ");
                    System.out.println("1. Vanilla\n2. Chocolate\n3. Strawberry\n4. Mango\n" +
                            "5. Nuts\n6. Strawberry Cheesecake\n7. Salted Caramel\n8. Pistachio");
                    System.out.print("Enter the flavor number: ");
                    int flavorShop = scanner.nextInt();
                    System.out.print("Enter the quantity: ");
                    int quantityShop = scanner.nextInt();

                    if (flavorShop >= 1 && flavorShop <= 8) {
                        quantities[flavorShop - 1] += quantityShop;
                        double amountShop = prices[flavorShop - 1] * quantityShop;
                        flavorTotalAmounts[flavorShop - 1] += amountShop;
                        totalAmount += amountShop;

                        System.out.println("\nCart Details:");
                        System.out.println("Serial\t\tFlavor\t\tQuantity\tPrice\t\tTotal Amount");
                        System.out.println("---------------------------------------------------------");
                        int serial = 1;
                        for (int i = 0; i < quantities.length; i++) {
                            if (quantities[i] > 0) {
                                String item;
                                switch (i + 1) {
                                    case 1:
                                        item = "Vanilla";
                                        break;
                                    case 2:
                                        item = "Chocolate";
                                        break;
                                    case 3:
                                        item = "Strawberry";
                                        break;
                                    case 4:
                                        item = "Mango";
                                        break;
                                    case 5:
                                        item = "Nuts";
                                        break;
                                    case 6:
                                        item = "Strawberry Cheesecake";
                                        break;
                                    case 7:
                                        item = "Salted Caramel";
                                        break;
                                    case 8:
                                        item = "Pistachio";
                                        break;
                                    default:
                                        item = "Unknown";
                                        break;
                                }
                                System.out.printf("%d\t\t%s\t\t%d\t\t%.2f\t\t%.2f\n",
                                        serial, item, quantities[i], prices[i], flavorTotalAmounts[i]);
                                serial++;
                            }
                        }
                        System.out.println("---------------------------------------------------------");
                        System.out.println("Total Amount: $" + totalAmount);

                        // Increment the cart serial number for the next cart
                        cartSerialNumber = serial;
                    } else {
                        System.out.println("Invalid flavor number!");
                    }

                    break;

                case 3:
                    stop = true;
                    System.out.println("Thank you for visiting the Ice Cream Shop!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}

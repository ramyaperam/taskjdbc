package corejava6.AbstractClass;
import java.util.*;
public class main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Laptop laptop;
            Gadget gadget = new Gadget();
            OtherGadget otherGadget = new OtherGadget();
            int choice;

            System.out.println("Welcome to the Online Electronic Store!");
            System.out.println("==========================================================");
        System.out.println("Hello This is Sam !!");
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "! Nice to see you here :");
            double totalBill = 0;
            double giftCard = 500;

            int itemCount = 0;
            int[] itemSerialNumbers = new int[100];
            String[] itemNames = new String[100];
            int[] itemQuantities = new int[100];
            double[] itemPrices = new double[100];
            double[] itemTotalPrices = new double[100];

            do {

                System.out.println("Select a category:");
                System.out.println("1. Laptop");
                System.out.println("2. Gadget");
                System.out.println("3. Other Gadget");
                System.out.println("4. Exit");

                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Select a brand:");
                        System.out.println("1. Mac");
                        System.out.println("2. HP");
                        System.out.println("3. Dell");

                        int brandChoice = scanner.nextInt();
                        scanner.nextLine();

                        switch (brandChoice) {
                            case 1:
                                laptop = new Mac();
                                break;
                            case 2:
                                laptop = new Hp();
                                break;
                            case 3:
                                laptop = new Dell();
                                break;
                            default:
                                laptop = null;
                                break;
                        }

                        if (laptop != null) {
                            laptop.displayCategories();

                            System.out.println("Enter the category number:");
                            int laptopCategoryChoice = scanner.nextInt();
                            scanner.nextLine();

                            laptop.displayItems(laptopCategoryChoice);

                            System.out.println("Enter the item number:");
                            int laptopItemChoice = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Enter the quantity:");
                            int quantity = scanner.nextInt();
                            scanner.nextLine();

                            double itemPrice = laptop.getItemPrice(laptopCategoryChoice, laptopItemChoice);
                            double totalItemPrice = itemPrice * quantity;

                            totalBill += totalItemPrice;

                            // Add item to the bill
                            itemCount++;
                            itemSerialNumbers[itemCount] = itemCount;
                            itemNames[itemCount] = laptop.getItemName(laptopCategoryChoice, laptopItemChoice);
                            itemQuantities[itemCount] = quantity;
                            itemPrices[itemCount] = itemPrice;
                            itemTotalPrices[itemCount] = totalItemPrice;

                            // Display the itemized bill
                            displayItemizedBill(itemSerialNumbers, itemNames, itemQuantities, itemPrices, itemTotalPrices,
                                    itemCount, totalBill, giftCard);
                        } else {
                            System.out.println("Invalid brand choice. Please try again.");
                        }
                        break;
                    case 2:
                        gadget.displayCategories();

                        System.out.println("Enter the item number:");
                        int gadgetChoice = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Enter the quantity:");
                        int quantity = scanner.nextInt();
                        scanner.nextLine();

                        double gadgetItemPrice = gadget.getItemPrice(gadgetChoice);
                        double totalItemPrice = gadgetItemPrice * quantity;

                        totalBill += totalItemPrice;

                        // Add item to the bill
                        itemCount++;
                        itemSerialNumbers[itemCount] = itemCount;
                        itemNames[itemCount] = gadget.getItemName(gadgetChoice);
                        itemQuantities[itemCount] = quantity;
                        itemPrices[itemCount] = gadgetItemPrice;
                        itemTotalPrices[itemCount] = totalItemPrice;

                        // Display the itemized bill
                        displayItemizedBill(itemSerialNumbers, itemNames, itemQuantities, itemPrices, itemTotalPrices,
                                itemCount, totalBill, giftCard);
                        break;
                    case 3:
                        otherGadget.displayCategories();

                        System.out.println("Enter the item number:");
                        int otherGadgetChoice = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Enter the quantity:");
                         quantity = scanner.nextInt();
                        scanner.nextLine();

                        double otherGadgetItemPrice = otherGadget.getItemPrice(otherGadgetChoice);
                       totalItemPrice = otherGadgetItemPrice * quantity;

                        totalBill += totalItemPrice;

                        // Add item to the bill
                        itemCount++;
                        itemSerialNumbers[itemCount] = itemCount;
                        itemNames[itemCount] = otherGadget.getItemName(otherGadgetChoice);
                        itemQuantities[itemCount] = quantity;
                        itemPrices[itemCount] = otherGadgetItemPrice;
                        itemTotalPrices[itemCount] = totalItemPrice;

                        // Display the itemized bill
                        displayItemizedBill(itemSerialNumbers, itemNames, itemQuantities, itemPrices, itemTotalPrices,
                                itemCount, totalBill, giftCard);
                        break;
                    case 4:
                        System.out.println("Thank you for shopping with us!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } while (choice != 4);
        }

        private static void displayItemizedBill(int[] itemSerialNumbers, String[] itemNames, int[] itemQuantities,
                                                double[] itemPrices, double[] itemTotalPrices, int itemCount,
                                                double totalBill, double giftCard) {
            System.out.println("Itemized Bill:");
            System.out.println("=============================================================");
            System.out.printf("%-15s %-30s %-10s %-15s %-15s%n", "Serial Number", "Item Name", "Quantity", "Price",
                    "Total Price");
            System.out.println("-------------------------------------------------------------");
            for (int i = 1; i <= itemCount; i++) {
                System.out.printf("%-15d %-30s %-10d $%-14.2f $%-14.2f%n", itemSerialNumbers[i], itemNames[i],
                        itemQuantities[i], itemPrices[i], itemTotalPrices[i]);
            }
            System.out.println("-------------------------------------------------------------");
            System.out.printf("%-15s %-30s $%-10.2f%n", "Total Amount:", "", totalBill);

            double remainingBalance = totalBill - giftCard;
            if (remainingBalance == 0) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Gift Card Exhausted.");
            } else if (remainingBalance < 0) {
                System.out.println("-------------------------------------------------------------");
                System.out.printf("%-15s %-30s $%-10.2f%n", "Balance:", "", Math.abs(remainingBalance));
            } else {
                System.out.println("-------------------------------------------------------------");
                System.out.printf("%-15s %-30s $%-10.2f%n", "Remaining Balance:", "", remainingBalance);
            }

            System.out.println("-------------------------------------------------------------");

            System.out.println();
        }
    }

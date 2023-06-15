package corejava2;

import java.util.Scanner;

public class icecream {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" 1. Online ordering :");
        System.out.println(" 2. icecream flavours :");
        System.out.println(" 3.Quantity :");
        System.out.println(" Enter choice :");
        int[] pastryQuantities = new int[4];
        double total=0;
        double[] prices = {3, 4, 5, 6};
        int choice = scan.nextInt();
        System.out.println(" enter selection :");
        for (; ; ) {
            switch (choice) {
                case 1:
                    System.out.println("Welcome to Online ordering !");
                    System.out.println("Hello this is sam , whats your name ");
                    String name = scan.next();
                    System.out.println("hello " + name + " How can i help you ?");
                    System.out.println("   These are flavours we have \n 1. chocolate \n 2. vanilla \n 3. strawberry");
                    System.out.println("enter the flavour of icecream you need : ");
                    String flavour = scan.next();
                    System.out.println(" your " + flavour + "icecream is ready ");
                    break;
                case 2:
                    choice = scan.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Here is the scoops menu  ");
                            System.out.println("  \n 1. vanilla \n 2. chocolate \n 3. strawberry");
                            System.out.println("which flavor would you like  ");
                            flavour = scan.next();
                            System.out.println("How many scoops would you like : ");
                            int scoop = scan.nextInt();
                            System.out.println("enter the choice for icecream flavours ");
                            choice = scan.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println("   These are flavours we have \n 1. chocolate \n 2. vanilla \n 3. strawberry");
                                    String[] iceCreamNames = {"chocolate", "red velvet", "white chocolate"};
                                    for (int i = 0; i < 3; i++) {
                                        System.out.println("Enter the quantity of " + iceCreamNames[i] + ": ");
                                        pastryQuantities[i] = scan.nextInt();
                                        int quantity = pastryQuantities[i];
                                        double pastryPrice = prices[i];
                                        double totalAmount = quantity * pastryPrice;
                                        System.out.println(iceCreamNames[i] + " - Quantity: " + quantity + " - Total Amount: $" + totalAmount);
                                        break;

                                    }
                                    break;
                            }
                            break;
                    }
                    break;
                        case 3:
                            System.out.println("Here is the exquisite menu  ");
                            System.out.println("  \n 1. mango \n 2. nuts \n 3. color");
                            System.out.println("which exquisite would you like  ");
                            flavour = scan.next();
                            System.out.println("How many scoops would you like : ");
                             int scoop = scan.nextInt();
                            System.out.println("enter the ice cream you need ");
                            choice = scan.nextInt();
                            switch (choice){
                                case 1:
                                    System.out.println("   These are flavours we have \n 1. chocolate \n 2. vanilla \n 3. strawberry");
                                    String[] iceCreamNames = {"chocolate", "red velvet", "white chocolate"};
                                    for (int i = 0; i < 3; i++) {
                                        System.out.println("Enter the quantity of " + iceCreamNames[i] + ": ");
                                        pastryQuantities[i] = scan.nextInt();
                                        for ( i = 0; i < 3; i++) {
                                            int quantity = pastryQuantities[i];
                                            double pastryPrice = prices[i];
                                            double totalAmount = quantity * pastryPrice;
                                            System.out.println(iceCreamNames[i] + " - Quantity: " + quantity + " - Total Amount: $" + totalAmount);
                                            total = total+totalAmount;
                                            break;
                                        }
                                    }
                            }
                            System.out.println("here you go  " + flavour + "enjoy it ");
                            break;
                    }
            }
        }
    }

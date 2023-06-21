package corejava6.AbstractClass;
import java.util.Scanner;

public abstract class Laptop {
    public abstract void displayCategories();

    public abstract void displayItems(int categoryChoice);

    public abstract double getItemPrice(int categoryChoice, int itemChoice);

    public abstract String getItemName(int categoryChoice, int itemChoice);
}




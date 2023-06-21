package corejava6.AbstractClass;
public class Hp extends Laptop {
    private String[][] categories = {
            {"HP I3", "HP I5", "HP I7"},
            {"$799", "$1299", "$1399"},
            {"$999", "$1499", "$1599"}
    };

    @Override
    public void displayCategories() {
        System.out.println("Categories:");
        System.out.println("1. HP I3");
        System.out.println("2. HP I5");
        System.out.println("3. HP I7");
    }
    @Override
    public void displayItems(int categoryChoice) {
        int index = categoryChoice - 1;

        if (index >= 0 && index < categories[0].length) {
            System.out.println("Item Name: " + categories[0][index]);
            System.out.println("Price: " + categories[1][index]);
        } else {
            System.out.println("Invalid category choice. Please try again.");
        }
    }

    @Override
    public double getItemPrice(int categoryChoice, int itemChoice) {
        int index = itemChoice - 1;

        if (index >= 0 && index < categories[1].length) {
            String price = categories[1][index].substring(1);
            return Double.parseDouble(price);
        } else {
            return 0;
        }
    }

    @Override
    public String getItemName(int categoryChoice, int itemChoice) {
        int index = itemChoice - 1;

        if (index >= 0 && index < categories[0].length) {
            return categories[0][index];
        } else {
            return "";
        }
    }
}

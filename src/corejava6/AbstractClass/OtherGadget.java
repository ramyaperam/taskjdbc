package corejava6.AbstractClass;
public class OtherGadget {
    private String[] categories = {
            "Cooling Pad",
            "HDMI Cable",
            "USB Cable",
            "Laptop Cover",
            "Charger"
    };

    private double[] prices = {
            15.0,
            10.0,
            5.0,
            25.0,
            20.0
    };

    public void displayCategories() {
        System.out.println("Categories:");
        for (int i = 0; i < categories.length; i++) {
            System.out.println((i + 1) + ". " + categories[i]);
        }
    }

    public double getItemPrice(int itemChoice) {
        int index = itemChoice - 1;

        if (index >= 0 && index < prices.length) {
            return prices[index];
        } else {
            return 0;
        }
    }

    public String getItemName(int itemChoice) {
        int index = itemChoice - 1;

        if (index >= 0 && index < categories.length) {
            return categories[index];
        } else {
            return "";
        }
    }
}

package corejava6.AbstractClass;

public class Mac extends Laptop {
        private String[][] categories = {
                {"MacBook Air", "MacBook Pro"},
                {"$999", "$1299"},
                {"$1299", "$1499"}
        };

        @Override
        public void displayCategories() {
            System.out.println("Categories:");
            System.out.println("1. MacBook Air");
            System.out.println("2. MacBook Pro");
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

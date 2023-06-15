package corejava3;

public class function1 {
        private int num1;
        private int num2;

        public function1() {
            num1 = 5;
            num2 = 6;
        }

        public function1(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        public int calculateSum() {
            return num1 + num2;
        }

        public void calculateProduct() {
            int product = num1 * num2;
            System.out.println("Product: " + product);
        }
    }


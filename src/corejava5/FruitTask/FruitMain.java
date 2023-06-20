package corejava5.FruitTask;

public class FruitMain {
        public static void main(String[] args) {
            Mango mango = new Mango("Yellow", 0.3);
            mango.setColor("yellow");
            mango.setAverageWeight(100);
            System.out.println();
            Apple apple = new Apple("Red", 0.4);
            apple.setColor("Red");
            apple.setAverageWeight(80);
        }
    }

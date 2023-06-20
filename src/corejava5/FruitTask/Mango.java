package corejava5.FruitTask;

public class Mango extends Fruit {
    public Mango(String color, double averageWeight) {
        super(color, averageWeight);
    }

    public void setColor(String color) {
        super.color = color;
        System.out.println("Mango color : " + getColor());
    }

    public void setAverageWeight(double averageWeight) {
        super.averageWeight = averageWeight;
        System.out.println("Mango average weight: " + getAverageWeight());
    }
}

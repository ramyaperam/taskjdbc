package corejava5.FruitTask;

public class Apple extends Fruit {
    public Apple(String color, double averageWeight) {
        super(color, averageWeight);
    }

    public void setColor(String color) {
        super.color = color;
        System.out.println("Apple color : " + getColor());
    }

    public void setAverageWeight(double averageWeight) {
        super.averageWeight = averageWeight;
        System.out.println("Apple average weight : " + getAverageWeight());
    }
}

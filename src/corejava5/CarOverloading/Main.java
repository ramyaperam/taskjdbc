package corejava5.CarOverloading;
public class Main {
    public static void main(String[] args) {
        System.out.println("   Ferrari features :");
        Car car1 = new Car("Red", 200);
        System.out.println(car1.getCarDetails());
        System.out.println(car1.sportsMode());
        System.out.println(car1.isConvertible());
        System.out.println("   Ferrari features :");
        Ferrari ferrari1 = new Ferrari("Yellow", 300, "new ");
        System.out.println(ferrari1.getCarDetails());
        System.out.println(ferrari1.sportsMode(true));
        System.out.println(ferrari1.isConvertible(true));
    }
}

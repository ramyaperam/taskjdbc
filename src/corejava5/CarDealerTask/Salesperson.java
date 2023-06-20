package corejava5.CarDealerTask;
public class Salesperson {
    private static final int MAX_CARS_SOLD = 100000;

    private String name;
    private int dailyCarCount;
    private int monthlyCarCount;

    public Salesperson(String name) {
        this.name = name;
        this.dailyCarCount = 0;
        this.monthlyCarCount = 0;
    }

    public void sellCar(Car car) {
        if (dailyCarCount >= MAX_CARS_SOLD) {
            System.out.println("Daily car sales limit reached for salesperson: " + name);
            return;
        }

        System.out.println("Salesperson: " + name + ", Car Sold: " + car.getBrand() + " " +
                car.getModel() + ", Price: $" + car.getPrice());
        dailyCarCount++;
        monthlyCarCount++;
    }

    public void displaySalesSummary() {
        System.out.println("Salesperson: " + name + ", Daily Cars Sold: " +
                dailyCarCount + ", Monthly Cars Sold: " + monthlyCarCount);
    }
}

package corejava5.CarDealerTask;
public class Car {
    private String model;
    private String brand;
    private double price;

    public Car(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }
}

package corejava5.CarOverloading;

class Car {
    protected String color;
    protected int speed;

    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public String getCarDetails() {
        return "Color: " + color + ", Speed: " + speed;
    }

    public String sportsMode() {
        return "Sports mode is disabled.";
    }

    public String isConvertible() {
        return "The car is not convertible.";
    }
}

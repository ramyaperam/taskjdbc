package corejava5.CarOverloading;
class Ferrari extends Car {
    private String model;

    public Ferrari(String color, int speed, String model) {
        super(color, speed);
        this.model = model;
    }

    @Override
    public String getCarDetails() {
        return "Color: " + color + ", Speed: " + speed + ", Model: " + model;
    }

    public String sportsMode(boolean isSportsMode) {
        if (isSportsMode) {
            return "Ferrari is Sports mode .";
        } else {
            return "Ferrari is not sports mode .";
        }
    }

    public String isConvertible(boolean isConvertible) {
        if (isConvertible) {
            return "The Ferrari is convertible.";
        } else {
            return "The Ferrari is not convertible.";
        }
    }
}


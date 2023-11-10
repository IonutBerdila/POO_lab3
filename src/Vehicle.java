// Abstractizarea - clasa abstracta pentru vehicul
abstract class Vehicle {
    private String brand;
    private String model;
    private String color; // Atribut nou

    public Vehicle(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract void start();

    @Override
    public String toString() {
        return "Vehicle: " + getBrand() + " " + getModel() + ", Color: " + getColor();
    }
}
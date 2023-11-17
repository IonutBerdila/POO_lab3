abstract class Vehicle {
    private final String brand;
    private final String model;
    private final String culoare;
    private final int an;

    public Vehicle(String brand, String model, String culoare, int an) {
        this.brand = brand;
        this.model = model;
        this.culoare = culoare;
        this.an = an;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getAn() {
        return an;
    }

    abstract void start();

    abstract void stop();

    @Override
    public String toString() {
        return "Vehicle: " + getBrand() + " " + getModel() + ", Culoare: " + getCuloare() + ", An: " + getAn();
    }
}
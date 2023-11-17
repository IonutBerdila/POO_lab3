abstract class Vehicle {
    private String brand;
    private String model;
    private String culoare;
    private int an;

    public Vehicle() {
        this.brand = "Necunoscut";
        this.model = "Necunoscut";
        this.culoare = "Necunoscut";
        this.an = 0;
    }

    public Vehicle(String brand, String model, String culoare, int an) {
        this.brand = brand;
        this.model = model;
        this.culoare = culoare;
        this.an = an;
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

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    abstract void start();

    abstract void stop();

    @Override
    public String toString() {
        return "Vehicle: " + getBrand() + " " + getModel() + ", Culoare: " + getCuloare() + ", An: " + getAn();
    }
}
class Car extends Vehicle {
    public Car(String brand, String model, String culoare, int an) {
        super(brand, model, culoare, an);
    }

    @Override
    void start() {
        System.out.println("Motorul mașinii a fost pornit");
    }

    @Override
    void stop() {
        System.out.println("Motorul mașinii a fost oprit");
    }

    @Override
    public String toString() {
        return "Mașină: " + getBrand() + " " + getModel() + ", Culoare: " + getCuloare() + ", An: " + getAn();
    }
}
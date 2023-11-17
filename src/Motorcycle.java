class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String model, String culoare, int an) {
        super(brand, model, culoare, an);
    }

    @Override
    void start() {
        System.out.println("Motorul motocicletei a fost pornit");
    }

    @Override
    void stop() {
        System.out.println("Motorul motocicletei a fost oprit");
    }

    @Override
    public String toString() {
        return "Motocicletă: " + getBrand() + " " + getModel() + ", Culoare: " + getCuloare() + ", An: " + getAn();
    }
}
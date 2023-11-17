class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String model, String culoare, int an) {
        super(brand, model, culoare, an);
    }

    public Motorcycle(String brand, String model, int an) {
        super(brand, model, "Necunoscut", an);
    }

    @Override
    void start() {
        System.out.println("Motorul motocicletei a fost pornit");
    }

    @Override
    void stop() {
        System.out.println("Motorul motocicletei a fost oprit");
    }

    void ride() {
        System.out.println("Motocicleta este pe drum");
    }

    public void setSomething(int value) {
    }

    public int getSomething() {
        return 0;
    }

    @Override
    public String toString() {
        return "Motocicletă: " + getBrand() + " " + getModel() + ", Culoare: " + getCuloare() + ", An: " + getAn();
    }
}
class Car extends Vehicle {
    public Car(String brand, String model, String culoare, int an) {
        super(brand, model, culoare, an);
    }

    public Car(String brand, String model, int an) {
        super(brand, model, "Necunoscut", an);
    }

    @Override
    void start() {
        System.out.println("Motorul mașinii a fost pornit");
    }

    @Override
    void stop() {
        System.out.println("Motorul mașinii a fost oprit");
    }

    void drive() {
        System.out.println("Mașina este în mișcare");
    }

    public void setSomething(int value) {
    }

    public int getSomething() {
        return 0;
    }

    @Override
    public String toString() {
        return "Mașină: " + getBrand() + " " + getModel() + ", Culoare: " + getCuloare() + ", An: " + getAn();
    }
}
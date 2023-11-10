// Mostenire ierarhica - clasa Motorcycle care extinde clasa Vehicle
class Motorcycle extends Vehicle {
    // Constructor
    public Motorcycle(String brand, String model, String color) {
        super(brand, model, color);
    }

    void start() {
        System.out.println("Motorul motocicletei este pornit");
    }

    void ride() {
        System.out.println("Motocicleta este pe drum");
    }

    @Override
    public String toString() {
        return "Motorcycle: " + getBrand() + " " + getModel() + ", Color: " + getColor();
    }
}
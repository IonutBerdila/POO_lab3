// Mostenire simpla - clasa Car care extinde clasa Vehicle
class Car extends Vehicle {
    public Car(String brand, String model, String color) {
        super(brand, model, color);
    }

    void start() {
        System.out.println("Motorul mașinii este pornit");
    }

    void drive() {
        System.out.println("Mașina este în mișcare");
    }

    @Override
    public String toString() {
        return "Car: " + getBrand() + " " + getModel() + ", Color: " + getColor();
    }
}
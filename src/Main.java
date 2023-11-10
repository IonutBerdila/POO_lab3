public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", "Albă");
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", "Negru");

        // Polimorfism la nivel de runtime
        Vehicle[] vehicles = {car, motorcycle};

        Garage garage = new Garage();
        garage.operateVehicles(vehicles);

        // Afișare
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }
}
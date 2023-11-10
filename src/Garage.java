// Polimorfism la nivel de compilare
class Garage {
    void operateVehicles(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }
}
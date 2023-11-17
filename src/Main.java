import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldExit = false;

        do {
            System.out.println("Alege o opțiune:");
            System.out.println("1. Pornire și oprire pentru mașină");
            System.out.println("2. Pornire și oprire pentru motocicletă");
            System.out.println("3. Informații despre garaj");
            System.out.println("4. Ieșire");
            System.out.print("Introdu numărul opțiunii: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    Car carWithColor = new Car("Toyota", "Camry", "Albastru", 2022);
                    operateVehicle(carWithColor);
                    break;
                case 2:
                    Motorcycle motorcycleWithColor = new Motorcycle("Harley-Davidson", "Sportster", "Roșu", 2022);
                    operateVehicle(motorcycleWithColor);
                    break;
                case 3:
                    showGarageInfo();
                    break;
                case 4:
                    shouldExit = true;
                    break;
                default:
                    System.out.println("Opțiune invalidă.");
            }

        } while (!shouldExit);

        scanner.close();
    }

    private static void operateVehicle(Vehicle vehicle) {
        Garage garage = new Garage();
        garage.operateVehicles(new Vehicle[]{vehicle});

        System.out.println(vehicle.toString());
    }

    private static void showGarageInfo() {
        System.out.println("Bine ați venit la garaj! Aici avem diverse vehicule.");
    }
}
package com.coreJavaConcepts.vehicalrentalsystem;
import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            RentalService service = new RentalService();

            // Sample data
            service.addVehicle(new Car("C101", "Toyota", "Innova", 1500, 7, "Diesel"));
            service.addVehicle(new Car("C102", "Maruti", "Swift", 1000, 5, "Petrol"));
            service.registerCustomer(new Customer("U001", "Sainath"));

            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n--- Vehicle Rental System ---");
                System.out.println("1. Show Available Vehicles");
                System.out.println("2. Rent Vehicle");
                System.out.println("3. Return Vehicle");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        service.showAvailableVehicles();
                        break;
                    case 2:
                        System.out.print("Enter Vehicle ID to rent: ");
                        String vId = scanner.next();
                        System.out.print("Enter Customer ID: ");
                        String cId = scanner.next();
                        service.rentVehicleToCustomer(vId, cId);
                        break;
                    case 3:
                        System.out.print("Enter Customer ID: ");
                        String rId = scanner.next();
                        service.returnVehicleFromCustomer(rId);
                        break;
                    case 4:
                        System.out.println("Exiting. Thank you!");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } while (choice != 4);

            scanner.close();
        }

}

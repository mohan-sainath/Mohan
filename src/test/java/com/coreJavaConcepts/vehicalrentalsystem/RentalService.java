package com.coreJavaConcepts.vehicalrentalsystem;
import java.util.ArrayList;
import java.util.List;
public class RentalService {

        private List<Vehicle> vehicles = new ArrayList<>();
        private List<Customer> customers = new ArrayList<>();

        public void addVehicle(Vehicle vehicle) {
            vehicles.add(vehicle);
        }

        public void registerCustomer(Customer customer) {
            customers.add(customer);
        }

        public void showAvailableVehicles() {
            for (Vehicle v : vehicles) {
                if (v.isAvailable()) {
                    v.displayDetails();
                }
            }
        }

        public void rentVehicleToCustomer(String vehicleId, String customerId) {
            Vehicle vehicle = findVehicleById(vehicleId);
            Customer customer = findCustomerById(customerId);

            if (vehicle != null && customer != null) {
                customer.rentVehicle(vehicle);
            } else {
                System.out.println("Vehicle or Customer not found.");
            }
        }

        public void returnVehicleFromCustomer(String customerId) {
            Customer customer = findCustomerById(customerId);
            if (customer != null) {
                customer.returnVehicle();
            } else {
                System.out.println("Customer not found.");
            }
        }

        private Vehicle findVehicleById(String id) {
            for (Vehicle v : vehicles) {
                if (v.getVehicleId().equalsIgnoreCase(id)) return v;
            }
            return null;
        }

        private Customer findCustomerById(String id) {
            for (Customer c : customers) {
                if (c.getCustomerId().equalsIgnoreCase(id)) return c;
            }
            return null;
        }
    }



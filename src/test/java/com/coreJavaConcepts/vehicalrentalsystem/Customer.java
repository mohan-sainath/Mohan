package com.coreJavaConcepts.vehicalrentalsystem;

public class Customer {

    private String customerId;
    private String name;
    private Vehicle rentedVehicle;

    public Customer (String customerId, String name){
        this.customerId = customerId;
        this.name = name;
    }

    public void rentVehicle(Vehicle vehicle){
        if (vehicle.isAvailable()){
            vehicle.rentVehicle();
            this.rentedVehicle = vehicle;
            System.out.println(name + " has renter vehicle id : " + vehicle.getVehicleId());
        }
        else {
            System.out.println("No vehicles available for rent");
        }
    }

    public void returnVehicle (){
        if (rentedVehicle != null){
            rentedVehicle.returnVehicle();
            System.out.println(name + " has returned vehicle id : " + rentedVehicle.getVehicleId());
            rentedVehicle = null;
        }
        else {
            System.out.println("No vehicle to return");
        }
    }

    public String getCustomerId(){
        return customerId;
    }

}

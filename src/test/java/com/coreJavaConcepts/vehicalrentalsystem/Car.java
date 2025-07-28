package com.coreJavaConcepts.vehicalrentalsystem;

public class Car implements Vehicle {

    private String vehicleID;
    private String brand;
    private String  model;
    private double rentalPricePerDay;
    private boolean isAvailable;
    private int seatingCapacity;
    private String fuelType;

    public Car(String vehicleId, String brand, String model, double rentalPricePerDay, int seatingCapacity, String fuelType){
        this.vehicleID = vehicleId;
        this.brand = brand;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
        this.isAvailable = true;
    }

    @Override
    public void displayDetails() {
        System.out.println(vehicleID + "," + brand + "," + model + "," + rentalPricePerDay + "," + seatingCapacity + "," +  fuelType );
    }

    @Override
    public void rentVehicle() {
        this.isAvailable = false;
    }

    @Override
    public void returnVehicle() {
        this.isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String getVehicleId() {
        return vehicleID;
    }


}

package com.coreJavaConcepts.vehicalrentalsystem;

public interface Vehicle {

    void displayDetails();
    void rentVehicle();
    void returnVehicle();
    boolean isAvailable();
    String getVehicleId();

}

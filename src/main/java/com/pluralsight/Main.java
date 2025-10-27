package com.pluralsight;

import com.pluralsight.Vehicles.*;

import com.pluralsight.Vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        SemiTruck semiTruck = new SemiTruck();
        Moped slowride = new Moped();

        semiTruck.setColor("Black");
        semiTruck.setFuelCapacity(300);
        semiTruck.setCargoCapacity(2000);
        semiTruck.isLoadCargo();



        vehicle.setColor("Yellow");
        slowride.setColor("Red");
        slowride.setFuelCapacity(5);



        System.out.println("Color: " + semiTruck.getColor());
        System.out.println("Fuel Capacity: " + semiTruck.getFuelCapacity());
        System.out.println("Cargo Capacity: " + semiTruck.getCargoCapacity());
        System.out.println("Cargo " + semiTruck.isLoadCargo());
        System.out.println("Moped Color:" + slowride.getColor());







    }
}

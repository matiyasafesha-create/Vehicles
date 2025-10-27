package com.pluralsight.Vehicles;

public class SemiTruck extends Vehicle {
    private boolean trailerAttached;
    private boolean loadCargo;


   public boolean isTrailerAttached(){
       return trailerAttached;

    }


    public boolean isLoadCargo() {
        return trailerAttached && loadCargo;
    }


}

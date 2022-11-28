package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Equipment;
import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Rideable;
import com.zipcodewilmington.froilansfarm.StorageClasses.Farm.Farm;

public class Tractor extends FarmVehicle implements Rideable{

    public boolean mounted() {
        return false;
    }

    //Tractor can harvest a Crop
    public boolean harvest(){
        return false;
    }

    // Tractor is a FarmVehicle, Override the methods from FarmWehicle;
    public boolean operate(Farm farm1){
        return false;
    }

}

package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Equipment;
import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Rideable;
import com.zipcodewilmington.froilansfarm.StorageClasses.Farm.Farm;

public abstract class FarmVehicle extends Vehicle implements NoiseMaker, Rideable {
    public void makeNoise(){

    }
    public boolean mounted(){
        return false;
    }
    public void operate(Farm farm1){

    }
}

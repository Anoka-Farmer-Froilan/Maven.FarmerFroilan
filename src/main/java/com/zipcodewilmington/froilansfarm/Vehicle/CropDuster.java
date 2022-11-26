package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Aircraft;

public class CropDuster extends FarmVehicle implements Aircraft {

    public boolean mounted() {
        return false;
    }

    public void fly() {

    }
}

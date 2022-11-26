package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Rideable;

public class Tractor extends FarmVehicle implements Rideable {

    public boolean mounted() {
        return false;
    }
}

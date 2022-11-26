package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Rideable;

public abstract class Vehicle  implements NoiseMaker, Rideable{
    public void  makeNoise() {
        System.out.println("CLUNKING, CLUNKING, CLUNKING");

    }
    public boolean mounted(){
        return false;
    }

}


package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Operater;
import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Rider;
import com.zipcodewilmington.froilansfarm.StorageClasses.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

public class Farmer extends Person implements Rider {

    Farm newFarm;
    public void addFarm(Farm f){
        newFarm=f;
    }
    public void mount(Rideable type) {

    }

    public void dismount(Rideable type) {

    }

    @Override
    public void eat(Eater type) {

    }
}

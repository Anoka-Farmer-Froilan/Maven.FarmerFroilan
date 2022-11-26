package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Crop.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Rideable;

public class Horse extends Animal implements Eater<EarCorn>, Rideable {

    public void eat(EarCorn type) {
    }

    public boolean mounted() {
        return false;
    }
}

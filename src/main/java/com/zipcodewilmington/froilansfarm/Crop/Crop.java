package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Crop<T> implements Produce {
    public Edible yeild() {
        return null;
    }

    public boolean hasBeenFertilized() {
        return false;
    }

    public boolean hasBeenHarvested() {
        return false;
    }
}

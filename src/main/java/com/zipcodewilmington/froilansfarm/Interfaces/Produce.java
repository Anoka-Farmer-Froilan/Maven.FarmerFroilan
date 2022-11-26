package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;

public interface Produce {
    Edible yeild();
    boolean hasBeenFertilized();
    boolean hasBeenHarvested();
}

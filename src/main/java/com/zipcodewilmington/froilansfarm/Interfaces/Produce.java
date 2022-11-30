package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;

public interface Produce extends Edible {
    Edible yield();
}
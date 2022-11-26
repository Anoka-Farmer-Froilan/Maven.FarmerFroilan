package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;

public abstract class Person extends Animal implements Eater<Edible> {
    public void eat(Edible type) {
    }

}

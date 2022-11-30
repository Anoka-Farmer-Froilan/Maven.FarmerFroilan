package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Vegetable;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public abstract class Animal implements Eater<Vegetable>,NoiseMaker {

    public boolean fed = false;

    public String name;

    public Animal(String name) {
        this.name = name;
    }
    public Animal() {
        name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {

    }
    public boolean isFed() {
        return fed;
    }

}

package com.zipcodewilmington.froilansfarm.Animal;

import Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Vegetable;
import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Rideable;

//public class Horse extends Animal implements Eater, Rideable {

public class Horse extends Animal implements Rideable, Eater<Vegetable> {
    public boolean ridden = false;

    public String name;

    public Horse(String name) {
        this.name = name;
    }

    public Horse() {
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
        super.makeNoise();
        System.out.println("neigh");
    }

    public void eat(Edible edible) {}

    @Override
    public void setRidden(Person person) {
        if (person.isMounted() == false) {
            ridden = true;

        } else {
            ridden = false;
        }
    }

    public boolean isRidden() { return ridden; }

    @Override
    public void eat(int amount) {

    }
}

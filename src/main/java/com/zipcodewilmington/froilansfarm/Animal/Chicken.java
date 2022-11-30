package com.zipcodewilmington.froilansfarm.Animal;

import Food.EdibleEgg;
import Food.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Vegetable;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
//import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Vegetable;

public class Chicken extends Animal implements Produce, Eater<Vegetable> {

    public boolean fertilized = false;
    public Chicken(String name) {
        this.name = name;
    }

    public Chicken() {
        name = "";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isEdible() {
        return false;
    }

    @Override
    public void fertilized() {
        fertilized = true;
    }
    public boolean getFertilized() {
        return fertilized;
    }

    @Override
    public Edible yield() {
        Egg egg = new Egg();
        if (fertilized) {
            egg.fertilized();
            return new Egg();
        } else {
            return new Egg();
        }
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("bok bok");
    }
    public void eat(int amount){

    }

    @Override
    public void eat(Edible edible, int amount) {

    }
}
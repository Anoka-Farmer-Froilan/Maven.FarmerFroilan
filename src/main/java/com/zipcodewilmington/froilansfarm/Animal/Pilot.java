package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Flyer;
import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Rideable;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;

public class Pilot extends Person {

    public boolean mounted = false;

    public Pilot(String name) {
        super(name);
    }

    public Pilot() {
    }

    public void eat(Edible edible) {
    }

    @Override
    public void makeNoise() {
        System.out.println("Wooo");
    }

    public void mount(Rideable ride) {
        ride.setRidden(this);
        CropDuster cd = (CropDuster) ride;
        cd.fly();
        mounted = true;
    }

    public void eat(int amount) {

    }

    @Override
    public void eat(Edible edible, int amount) {

    }
}
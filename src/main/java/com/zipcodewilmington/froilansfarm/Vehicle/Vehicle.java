package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Animal.Person;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Rideable;

public class Vehicle<T extends Person >implements NoiseMaker, Rideable{

    String name;

    public Vehicle() {
        name = "";
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void operate() {}

    @Override
    public void  makeNoise() {
        System.out.println("vroom");
    }

    @Override
    public void setRidden(Person person) {}

    @Override
    public boolean isRidden() {
        return true; }


}
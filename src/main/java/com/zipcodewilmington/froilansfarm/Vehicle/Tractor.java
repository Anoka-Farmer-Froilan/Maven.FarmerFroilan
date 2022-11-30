package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Animal.Person;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;

public class Tractor extends Vehicle{

    boolean vehicleMounted = false;

    public Tractor() {
        super("");
    }

    public Tractor(String name) {
        super(name);
    }

    public Edible harvest(Crop crop) {
        if (vehicleMounted == true){
            return crop.yield();
        }
        return null;
    }

    @Override
    public void makeNoise() {
        System.out.println("ooomm ooom");

    }

    @Override
    public void setRidden(Person person) {
        if(person.isMounted() == false){
            vehicleMounted = true;
        } else {
            vehicleMounted = false;
        }
    }

    @Override
    public boolean isRidden() { return vehicleMounted; }

}

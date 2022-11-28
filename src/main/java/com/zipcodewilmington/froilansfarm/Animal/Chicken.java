package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
//import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Vegetable;

public class Chicken extends Produce implements Eater {

    public void eat() {

    }
    public Edible yield() {
        return null;
    }

    public EdibleEgg yield(boolean hasBeenFertilized){
        if(hasBeenFertilized==false){
            return new EdibleEgg();
        }else return null;
    }

    public void eat(Eater type) {

    }


}

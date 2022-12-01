package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;

public class TomatoPlant extends Crop<Tomato>{

    public Edible yield(){
        hasBeenHarvested=true;
        return new Tomato();
    }

}

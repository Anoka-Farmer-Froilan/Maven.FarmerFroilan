package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;

public class TomatoPlant extends Crop{
    public Tomato yeild() {
        if(isHasBeenFertilized()==true && isHasBeenHarvested()==false){
            setHasBeenFertilized(true);
            return new Tomato();
        } else {
            return null;
        }
    }

}

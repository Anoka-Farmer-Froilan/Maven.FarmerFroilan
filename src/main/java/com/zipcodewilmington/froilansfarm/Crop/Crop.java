package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Crop extends Produce {

    public Edible yield() {
        if(isHasBeenFertilized()==true && isHasBeenHarvested()==false){
            setHasBeenFertilized(true);
             return new Edible();
        } else {
            return null;
        }
    }


//    public boolean hasBeenFertilized() {
//        return false;
//    }
//
//    public boolean hasBeenHarvested() {
//        return false;
//    }
}

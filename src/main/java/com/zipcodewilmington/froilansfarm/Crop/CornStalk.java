package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;

public class CornStalk extends Crop{
    public EarCorn yeild() {
        if(isHasBeenFertilized()==true && isHasBeenHarvested()==false){
            setHasBeenFertilized(true);
            return new EarCorn();
        } else {
            return null;
        }
    }
}

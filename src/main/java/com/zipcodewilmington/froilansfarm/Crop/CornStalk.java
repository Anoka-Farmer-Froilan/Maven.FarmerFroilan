package com.zipcodewilmington.froilansfarm.Crop;

import Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;




public class CornStalk extends Crop<EarCorn> {
    @Override
    public Edible yield() {
        if(getFertilized()==true && getFertilized()==false){
            setHarvestToTrue();
            return new EarCorn();
        } else {
            return null;
        }
       // return new EarCorn();
    }

}
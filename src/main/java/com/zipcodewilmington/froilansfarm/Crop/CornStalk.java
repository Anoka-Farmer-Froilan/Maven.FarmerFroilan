package com.zipcodewilmington.froilansfarm.Crop;

import Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;




public class CornStalk extends Crop<EarCorn> {
    @Override
    public Edible yield() {
        return new EarCorn();
    }

}
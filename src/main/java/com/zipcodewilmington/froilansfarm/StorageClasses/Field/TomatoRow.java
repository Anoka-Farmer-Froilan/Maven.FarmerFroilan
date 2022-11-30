package com.zipcodewilmington.froilansfarm.StorageClasses.Field;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;

public class TomatoRow extends Crop<TomatoPlant> {
    @Override
    public Edible yield(){
        return null;
    }
}

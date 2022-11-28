package com.zipcodewilmington.froilansfarm.StorageClasses.Field;

import com.zipcodewilmington.froilansfarm.Crop.Crop;

import java.util.List;

public class Field {

    private List<Crop> field;

    public Field(){}

    public void addCropRow(Crop c){
        field.add(c);
    }

}

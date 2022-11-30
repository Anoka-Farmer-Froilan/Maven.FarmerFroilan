package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Rider;
import com.zipcodewilmington.froilansfarm.StorageClasses.Farm.Farm;
import com.zipcodewilmington.froilansfarm.StorageClasses.Field.CropRow;

public class Farmer extends Person implements Botanist {

    public boolean mounted = false;

    public Farmer(String name) {
        super(name);
    }

    public Farmer() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void plantCrop(CropRow crprw, Crop crop) {
        crprw.add(crop);

    }
}

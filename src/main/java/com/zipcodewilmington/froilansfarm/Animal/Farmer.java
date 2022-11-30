package com.zipcodewilmington.froilansfarm.Animal;

import Food.EarCorn;
import Food.Egg;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Ride.Rider;
import com.zipcodewilmington.froilansfarm.StorageClasses.Farm.Farm;
import com.zipcodewilmington.froilansfarm.StorageClasses.Field.CropRow;

public class Farmer extends Person implements Botanist {

    public boolean mounted = false;
    private Farm newFarm;

    public Farmer(String name) {
        super(name);
    }

    public Farmer() {

    }

    @Override
    public boolean isMounted() {
        return mounted;
    }

    public void setMounted(boolean mounted) {
        this.mounted = mounted;
    }

    public Farm getNewFarm() {
        return newFarm;
    }

    public void setNewFarm(Farm newFarm) {
        this.newFarm = newFarm;
    }

    @Override
    public void eat(Edible food) {
        if(food instanceof Chicken){
            newFarm.removeChicken();
        }else if(food instanceof EarCorn){
            newFarm.removeEarCorn();
        }else if(food instanceof Tomato){
            newFarm.removeTomato();
        }else if(food instanceof Egg){
            newFarm.removeEgg();
        }
    }

    @Override
    public void plantCrop(CropRow crprw, Crop crop) {
        crprw.add(crop);

    }

    @Override
    public void eat(Edible edible, int amount) {

    }
    public int countEgg(){
        return newFarm.getEggCount();
    }
    public int countChicken(){
        return newFarm.getChickenCount();
    }
    public int countTomato(){ return newFarm.getTomatoCount();
    }

    public int countEarCorn() {
        return newFarm.getEarCornCount();
    }
}

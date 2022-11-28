package com.zipcodewilmington.froilansfarm.StorageClasses.Farm;

import com.zipcodewilmington.froilansfarm.StorageClasses.Field.Field;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;

import java.util.ArrayList;

public class Farm{

    ArrayList<Stable> newStableArr;
    ArrayList<ChickenCoop> newChickenCoopArr;
    ArrayList<Field> newFieldArr;
    ArrayList<Vehicle> newVehicleArr;
    private FarmHouse newFarmHouse;

    public FarmHouse getNewFarmHouse() {
        return newFarmHouse;
    }

    public void setNewFarmHouse(FarmHouse newFarmHouse) {
        this.newFarmHouse = newFarmHouse;
    }
    public void addStable(Stable s){
        newStableArr.add(s);
    }
    public void addChickenCoop(ChickenCoop s){
        newChickenCoopArr.add(s);
    }
    public void addField(Field s){
        newFieldArr.add(s);
    }
    public void addVehicle(Vehicle s){
        newVehicleArr.add(s);
    }
}

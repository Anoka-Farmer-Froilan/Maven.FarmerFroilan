package com.zipcodewilmington.froilansfarm.StorageClasses.Farm;

import Food.EarCorn;
import Food.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.Tomato;
import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;
import com.zipcodewilmington.froilansfarm.StorageClasses.Field.Field;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;

import java.util.ArrayList;

public class Farm{

    ArrayList<Stable> newStableArr;
    ArrayList<ChickenCoop> newChickenCoopArr;
    ArrayList<Field> newFieldArr;
    ArrayList<Vehicle> newVehicleArr;

    private FarmHouse newFarmHouse;

    public Farm() {
        newFieldArr = new ArrayList<Field>();
        newChickenCoopArr=new ArrayList<ChickenCoop>();
        newStableArr = new ArrayList<Stable>();
        newVehicleArr= new ArrayList<Vehicle>();
    }



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
    public void removeChicken(){
        if(newChickenCoopArr.size()>=0) {
            newChickenCoopArr.get(newChickenCoopArr.size() - 1).removeChicken();
        }
    }
    public void removeEgg(){
        for(int i =0; i<newChickenCoopArr.size(); i++){
            if(newChickenCoopArr.get(i).countEgg() > 0) {
                newChickenCoopArr.get(i).removeEgg();
            }
        }

    }
    public void removeEarCorn(){
        Edible temp;
        for(int i=0; i<newFieldArr.size(); i++){
            for(int j=0; j<newFieldArr.get(i).size(); j++){
                if(newFieldArr.get(i).get(j) instanceof CornStalk){
                   temp = newFieldArr.get(i).getFood(new EarCorn());
                }
            }
        }
    }
    public void removeTomato(){
        Edible temp;
        for(int i=0; i<newFieldArr.size(); i++){
            for(int j=0; j<newFieldArr.get(i).size(); j++){
                if(newFieldArr.get(i).get(j) instanceof TomatoPlant){
                    temp = newFieldArr.get(i).getFood(new Tomato());
                }
            }
        }
    }
    public int getChickenCount(){
        int count =0;
        for(int i=0; i<newChickenCoopArr.size(); i++){
            count+=newChickenCoopArr.get(i).countChicken();
        }
        return count;
    }
    public int getEggCount(){
        int count =0;
        for(int i=0; i<newChickenCoopArr.size(); i++){
            count+=newChickenCoopArr.get(i).countEgg();
        }
        return count;
    }
}

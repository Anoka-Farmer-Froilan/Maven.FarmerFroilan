package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.StorageClasses.Farm.Farm;


public class CropDuster extends Aircraft implements FarmVehicle{

    public void fertilize(){
        System.out.println("Crop Duster fertilize CropRow");
    }

    public boolean operate(Farm farm1){
        return true;
    }
}

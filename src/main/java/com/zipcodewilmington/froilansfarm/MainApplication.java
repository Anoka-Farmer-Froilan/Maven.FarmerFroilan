package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Farmer;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Animal.Pilot;
import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.StorageClasses.Farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.StorageClasses.Farm.Farm;
import com.zipcodewilmington.froilansfarm.StorageClasses.Farm.Stable;
import com.zipcodewilmington.froilansfarm.StorageClasses.Field.Field;
import com.zipcodewilmington.froilansfarm.Vehicle.Aircraft;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicle;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {
    public static void main(String[] arg){
        Farm newFarm = new Farm();
        Farmer newFarmer = new Farmer();
//Froilan, a Farmer has a Farm
        newFarmer.addFarm(newFarm);
        newFarmer.setName("Froilan");

//       a Farm consisting of
//        1 Field of 5 CropRow.
//                Row 1 has Corn
//        Row 2 has Tomato
//        Row 3 and beyond grows arbitrary vegetation.

        Field newField = new Field();
        newField.addCropRow(new CornStalk());
        newField.addCropRow(new TomatoPlant());
        newField.addCropRow(new Crop());
        newField.addCropRow(new Crop());
        newField.addCropRow(new Crop());
        //add field to the farm
        newFarm.addField(newField);
//15 Chicken across 4 ChickenCoop
        ChickenCoop coop1= new ChickenCoop();
        ChickenCoop coop2= new ChickenCoop();
        ChickenCoop coop3= new ChickenCoop();
        ChickenCoop coop4= new ChickenCoop();

        coop1.addChicken(new Chicken());
        coop2.addChicken(new Chicken());
        coop3.addChicken(new Chicken());
        coop4.addChicken(new Chicken());
        coop1.addChicken(new Chicken());
        coop2.addChicken(new Chicken());
        coop3.addChicken(new Chicken());
        coop4.addChicken(new Chicken());
        coop1.addChicken(new Chicken());
        coop2.addChicken(new Chicken());
        coop3.addChicken(new Chicken());
        coop4.addChicken(new Chicken());
        coop1.addChicken(new Chicken());
        coop2.addChicken(new Chicken());
        coop3.addChicken(new Chicken());

        //add chickenCoop to the farm
        newFarm.addChickenCoop(coop1);
        newFarm.addChickenCoop(coop2);
        newFarm.addChickenCoop(coop3);
        newFarm.addChickenCoop(coop4);

//10 Horse across 3 Stable.
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();
        stable1.addHorse(new Horse());
        stable2.addHorse(new Horse());
        stable3.addHorse(new Horse());
        stable1.addHorse(new Horse());
        stable2.addHorse(new Horse());
        stable3.addHorse(new Horse());
        stable1.addHorse(new Horse());
        stable2.addHorse(new Horse());
        stable3.addHorse(new Horse());
        stable1.addHorse(new Horse());
        //add stable to the farm
        newFarm.addStable(stable1);
        newFarm.addStable(stable2);
        newFarm.addStable(stable3);

// 2 FarmVehicle
        newFarm.addVehicle(new FarmVehicle());
        newFarm.addVehicle(new FarmVehicle());

//1 Aircraft
        newFarm.addVehicle(new Aircraft());

 //His sister, Froilanda, is a Pilot who uses a CropDuster.
        Pilot newPilot = new Pilot();
        newPilot.setName("Froilanda");


    }
}

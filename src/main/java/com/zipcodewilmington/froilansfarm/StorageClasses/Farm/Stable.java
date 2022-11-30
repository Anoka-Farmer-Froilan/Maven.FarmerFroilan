package com.zipcodewilmington.froilansfarm.StorageClasses.Farm;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import Food.EarCorn;
import com.zipcodewilmington.froilansfarm.StorageClasses.Shelter;

import java.util.ArrayList;

public class Stable extends Shelter<Horse> {
    ArrayList<Horse> newHorseArr;
    public Stable(){
        newHorseArr = new ArrayList<Horse>();
    }

    public void feed(Horse horse, EarCorn earCorn){}

    public void addHorse(Horse h){
        newHorseArr.add(h);
    }

}

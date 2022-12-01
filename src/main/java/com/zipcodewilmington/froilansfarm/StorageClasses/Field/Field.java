package com.zipcodewilmington.froilansfarm.StorageClasses.Field;

import Food.Broccoli;
import Food.EarCorn;
import Food.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.Tomato;
import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;

import java.util.ArrayList;
import java.util.List;

public class Field <T> extends ArrayList<T> {
    private ArrayList<Crop> field;
    private ArrayList<Tomato> tomatoFieldArr;
    private ArrayList<EarCorn> earCornArr;
    public Field(){
        field = new ArrayList<Crop>();
        tomatoFieldArr = new ArrayList<Tomato>();
        earCornArr = new ArrayList<EarCorn>();
    }

    public int countTomato(){
        int count=0;
        for(int i=0; i<field.size(); i++){
            if((field.get(i) instanceof TomatoPlant) && !field.get(i).getHarvested()){
                count++;
            }
        }
        return count;
    }
    public int countEarCorn(){
        int count=0;
        for(int i=0; i<field.size(); i++){
            if(field.get(i) instanceof CornStalk){
                count++;
            }
        }
        return count;
    }
    public void addCropRow(Crop c){
        field.add(c);
    }
//    public void addTomato(Tomato t){
//        tomatoFieldArr.add(t);
//    }
    public Edible getFood(Edible c){
        if(c instanceof EarCorn){
            for(int i=0; i<field.size(); i++){
                if(field.get(i) instanceof CornStalk){
                    return field.get(i).yield();
                }
            }
        }else if(c instanceof Tomato){
            for(int i=0; i<field.size(); i++){
                if(field.get(i) instanceof TomatoPlant){
                    return field.get(i).yield();
                }
            }
        }
        return null;
    }

}

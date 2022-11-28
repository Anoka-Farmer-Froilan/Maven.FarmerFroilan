package com.zipcodewilmington.froilansfarm.StorageClasses.Farm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;

import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Vegetable;
import com.zipcodewilmington.froilansfarm.StorageClasses.Shelter;

import java.util.ArrayList;

public class ChickenCoop extends Shelter<Chicken> {
 ArrayList<Chicken> newChickenArr;
 public ChickenCoop(){}

 public void feed(Chicken chicken, Vegetable vegetable){}
 public void addChicken(Chicken c){
   newChickenArr.add(c);
 }
}

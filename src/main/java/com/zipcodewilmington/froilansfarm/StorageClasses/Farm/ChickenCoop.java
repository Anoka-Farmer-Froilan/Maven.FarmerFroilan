package com.zipcodewilmington.froilansfarm.StorageClasses.Farm;

import Food.Egg;
import com.zipcodewilmington.froilansfarm.Animal.Chicken;

import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Vegetable;
import com.zipcodewilmington.froilansfarm.StorageClasses.Shelter;

import java.util.ArrayList;

public class ChickenCoop extends Shelter<Chicken> {
 ArrayList<Chicken> newChickenArr;
 ArrayList<Egg> newEggArr;

 public ChickenCoop() {
  newChickenArr= new ArrayList<Chicken>();
  newEggArr = new ArrayList<Egg>();
 }

 public void feed(Chicken chicken, Vegetable vegetable) {
 }

 public void addChicken(Chicken c) {
  newChickenArr.add(c);
 }

 public void removeChicken() {
  if (newChickenArr.size() > 0) {
   newChickenArr.remove(newChickenArr.size() - 1);
  }

 }

 public void addEgg(Egg e) {
  newEggArr.add(e);
 }

 public void removeEgg() {
  if (newEggArr.size() > 0) {
   newEggArr.remove(newEggArr.size() - 1);
  }

 }

  public int countEgg() {
   return newEggArr.size();
  }
 public int countChicken() {
  return newChickenArr.size();
 }
}

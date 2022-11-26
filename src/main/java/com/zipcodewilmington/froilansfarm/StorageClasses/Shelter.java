package com.zipcodewilmington.froilansfarm.StorageClasses;

import com.zipcodewilmington.froilansfarm.Animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Shelter <AnimalType extends Animal>{

    private final ArrayList<AnimalType> animals = new ArrayList<>();

    public void feed() {
    }

    public ArrayList<AnimalType> getAllAnimals() {
        return animals;
    }

    public void add(AnimalType animal){
        animals.add(animal);
    }

    public void remove(Animal animal){
        animals.remove(animal);
    }

//    public AnimalType getById(int id){ //TODO add getId to Animal Class
//        for(AnimalType animal : animals){
//            if (animal.getId() == id){
//                return animal;
//            }
//        }
//        return null;
//    }

//    public AnimalType getByName(String name){ //TODO add getName to Animal Class
//        for(AnimalType animal : animals){
//            if(animal.getName.equals(name)){
//                return animal;
//            }
//        }
//        return null;
//    }

    public int size(){
        return animals.size();
    }

    public void clear(){
        animals.clear();
    }

}

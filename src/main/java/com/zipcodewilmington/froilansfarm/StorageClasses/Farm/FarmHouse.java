package com.zipcodewilmington.froilansfarm.StorageClasses.Farm;

import com.zipcodewilmington.froilansfarm.Animal.Person;
import com.zipcodewilmington.froilansfarm.StorageClasses.Shelter;

public class FarmHouse extends Shelter<Person> {

    private static Shelter<Person> farmHouse = new Shelter<>();

    public void add(Person person){
        farmHouse.add(person);
    }

    public void remove(Person person){
        farmHouse.remove(person);
    }


}

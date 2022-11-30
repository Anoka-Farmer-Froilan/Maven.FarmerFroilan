package com.zipcodewilmington.froilansfarm.Interfaces.Ride;

import com.zipcodewilmington.froilansfarm.Animal.Person;
import com.zipcodewilmington.froilansfarm.Animal.Pilot;

public interface Rideable{
    public void setRidden( Person person);

    public boolean isRidden();
}

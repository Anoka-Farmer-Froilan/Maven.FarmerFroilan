package com.zipcodewilmington.froilansfarm.Interfaces.Ride;

import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

public interface Equipment <T extends Rider> extends Rideable<T>{

    public void operate();
}

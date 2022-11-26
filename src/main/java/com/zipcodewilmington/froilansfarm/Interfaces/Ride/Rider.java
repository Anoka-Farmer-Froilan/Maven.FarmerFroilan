package com.zipcodewilmington.froilansfarm.Interfaces.Ride;

public interface Rider <T extends Rideable>{

    public void mount(T type);

    public void dismount(T type);
}

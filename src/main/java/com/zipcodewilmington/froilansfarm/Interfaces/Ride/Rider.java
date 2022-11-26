package com.zipcodewilmington.froilansfarm.Interfaces.Ride;

public interface Rider <T extends Rideable>{
    void mount(T type);
    void dismount(T type);
}

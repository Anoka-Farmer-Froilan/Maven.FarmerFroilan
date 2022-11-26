package com.zipcodewilmington.froilansfarm.Vehicle;


public class Aircraft extends Vehicle {
    @Override
    public void makeNoise() {
        System.out.println("");
    }

    @Override
    public boolean mounted() {
        return false;
    }
    public boolean fly(){
        return true;
    }
}

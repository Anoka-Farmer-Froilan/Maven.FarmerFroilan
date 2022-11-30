package com.zipcodewilmington.froilansfarm.Vehicle;


public class Aircraft extends Vehicle {
    @Override
    public void makeNoise() {
        System.out.println("Whirr, Whirr, Whirr");
    }

    public boolean mounted() {
        return false;
    }
    public boolean fly(){
        return true;
    }
}

package com.zipcodewilmington.froilansfarm.Interfaces.Eat;

//public interface Eater<T extends Edible> {
public interface Eater<V extends Edible> {
    public void eat( Edible edible,int amount);

}

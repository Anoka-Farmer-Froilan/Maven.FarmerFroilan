package com.zipcodewilmington.froilansfarm.Interfaces.Eat;

public interface Eater<T extends Edible> {

    public void eat(T type);

    public void hasEaten();
}

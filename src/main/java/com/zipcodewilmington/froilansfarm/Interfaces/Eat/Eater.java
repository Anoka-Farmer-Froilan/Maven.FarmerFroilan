package com.zipcodewilmington.froilansfarm.Interfaces.Eat;

public interface Eater<T extends Edible> {

    void eat(T type);

}

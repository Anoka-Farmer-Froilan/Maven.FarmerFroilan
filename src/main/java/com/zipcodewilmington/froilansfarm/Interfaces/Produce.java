package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;

public class Produce{



   private boolean hasBeenFertilized;
   private boolean hasBeenHarvested;

    public Produce() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }
    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }


    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public Edible yeild(){
        return new Edible();
    }
}
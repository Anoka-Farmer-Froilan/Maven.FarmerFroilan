package Food;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.AnimalProduct;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Egg extends Animal implements Produce {
    Boolean isEdible = false;
    
    public boolean isEdible(){
        return isEdible;
    }


    public void fertilized(){
        isEdible = true;
    }


    public void eat(int amount) {

   }

    @Override
    public Edible yield() {
        return null;
    }


    public void eat(Edible edible, int amount) {

    }
}

package Food;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.AnimalProduct;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class EdibleEgg extends Animal implements Produce {
    @Override
    public void eat(Edible edible, int amount) {

    }

    @Override
    public boolean isEdible() {
        return false;
    }

    @Override
    public void fertilized() {

    }

    @Override
    public Edible yield() {
        return null;
    }
}

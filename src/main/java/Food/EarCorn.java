package Food;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Vegetable;
//import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Vegetable;

public class EarCorn extends Crop implements Vegetable {
    public boolean edible = false;
    @Override
    public boolean isEdible() {
        return false;
    }

    @Override
    public void fertilized() {
        edible = true;
    }
}

package Food;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Vegetable;

public class Broccoli implements Vegetable {

    @Override
    public boolean isEdible() {
        return false;
    }

    @Override
    public void fertilized() {

    }
}

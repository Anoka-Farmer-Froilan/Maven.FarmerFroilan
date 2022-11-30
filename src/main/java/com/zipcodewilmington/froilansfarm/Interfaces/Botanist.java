package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.StorageClasses.Field.CropRow;

public interface Botanist {
    void plantCrop(CropRow crprw, Crop crop);
}

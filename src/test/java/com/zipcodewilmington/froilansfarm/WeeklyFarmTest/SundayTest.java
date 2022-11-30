package com.zipcodewilmington.froilansfarm.WeeklyFarmTest;


import Food.EarCorn;
import Food.Egg;
import Food.Tomato;
import com.zipcodewilmington.froilansfarm.Animal.Farmer;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Animal.Pilot;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;
import com.zipcodewilmington.froilansfarm.StorageClasses.Farm.Stable;
import com.zipcodewilmington.froilansfarm.StorageClasses.Field.CropRow;
import com.zipcodewilmington.froilansfarm.StorageClasses.Field.Field;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SundayTest {

        @Test
        public void froilanBreakfastTest() {
            Farmer Froilan = new Farmer("Froilan");

            Froilan.eat(new EarCorn());

            Froilan.eat(new Tomato());
            Froilan.eat(new Tomato());

            Froilan.eat(new Egg());
            Froilan.eat(new Egg());
            Froilan.eat(new Egg());
            Froilan.eat(new Egg());
            Froilan.eat(new Egg());

            Assert.assertTrue(Froilan.eat();

        }

        @Test
        public void froilandaBreakfastTest() {
            Pilot Froilanda = new Pilot("Froilanda");

            Froilanda.eat(new EarCorn());
            Froilanda.eat(new EarCorn());

            Froilanda.eat(new Tomato());

            Froilanda.eat(new Egg());
            Froilanda.eat(new Egg());

            Assert.assertTrue(Froilanda.eat());
        }

        @Test
        public void toFlyTest() {
            //given
            CropDuster crpDuster = new CropDuster();
            Boolean expected = true;
            //when
            Boolean actual = crpDuster.fly();
            //then
            Assert.assertEquals(expected, actual);
        }
        @Test
        public void plantThreeCrops(){
            //Given
            Field objField=new Field();
            List<CropRow> lstCropRowsExpected=new ArrayList<>();
            CropRow expectedFirstCrop=new CropRow(objField.createTomatoCrop());
            CropRow expectedSecondCrop=new CropRow(objField.createCornStalkCrop());
            CropRow expectedThirdCrop=new CropRow(objField.createTomatoCrop());
            //When
            lstCropRowsExpected.add(expectedFirstCrop);
            lstCropRowsExpected.add(expectedSecondCrop);
            lstCropRowsExpected.add(expectedThirdCrop);
            //Then
            Assert.assertEquals(expectedFirstCrop,lstCropRowsExpected.get(0));
            Assert.assertEquals(expectedSecondCrop,lstCropRowsExpected.get(1));
            Assert.assertEquals(expectedThirdCrop,lstCropRowsExpected.get(2));

        }

        @Test
        public void feedEachHorseTest() {
            Stable stable = new Stable();
            Horse seaBiscuit = new Horse("sea biscuit");
            Horse redRum = new Horse("red rum");

            stable.addHorse(seaBiscuit);
            stable.addHorse(redRum);

            seaBiscuit.eat(new EarCorn());
            seaBiscuit.eat(new EarCorn());
            seaBiscuit.eat(new EarCorn());
            redRum.eat(new EarCorn());
            redRum.eat(new EarCorn());
            redRum.eat(new EarCorn());

            Assert.assertTrue(seaBiscuit.eat());
            Assert.assertTrue(redRum.eat());

        }

        @Test
        public void rideEachHorseTest() {
            Stable stable = new Stable();
            Horse seaBiscuit = new Horse("sea biscuit");

            stable.addHorse(seaBiscuit);

            seaBiscuit.isRidden();

            Assert.assertTrue(seaBiscuit.isRidden());
        }
}





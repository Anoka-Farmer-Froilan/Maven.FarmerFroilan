package com.zipcodewilmington.froilansfarm.WeeklyFarmTest;


import Food.EarCorn;
import Food.Egg;
import Food.Tomato;
import com.zipcodewilmington.froilansfarm.StorageClasses.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Animal.Farmer;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Animal.Pilot;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;
import com.zipcodewilmington.froilansfarm.MainApplication;
import com.zipcodewilmington.froilansfarm.StorageClasses.Farm.Stable;
import com.zipcodewilmington.froilansfarm.StorageClasses.Field.CropRow;
import com.zipcodewilmington.froilansfarm.StorageClasses.Field.Field;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SundayTest {
        Farm newFarm;
        Farmer froilan;
        Farmer froilanda;


        @Test
        public void froilanBreakfastEggTest() {

           froilan = MainApplication.plot();
           froilanda= new Farmer("froilanda");
//get the farm belones to froilan;
            newFarm = froilan.getNewFarm();
            froilanda.setNewFarm(newFarm);
//Expect: there is 7 eggs from the beginning in the farm;

            froilan.eat(new Egg());
            froilan.eat(new Egg());
            froilan.eat(new Egg());
            froilan.eat(new Egg());
           froilan.eat(new Egg());

            Assert.assertEquals(2,froilan.countEgg());

        }
        @Test
    public void froilanBreakfastTomatoTest() {

        Farmer froilan = MainApplication.plot();
        //

        froilan.eat(new Tomato());
        froilan.eat(new Tomato());


        Assert.assertEquals(2,froilan.countTomato());

    }
    @Test
    public void froilanBreakfastEarCornTest() {
        froilan = MainApplication.plot();
        froilanda= new Farmer("froilanda");
//get the farm belones to froilan;
        newFarm = froilan.getNewFarm();
        froilanda.setNewFarm(newFarm);

        froilan.eat(new EarCorn());

        Assert.assertEquals(0,froilan.countEarCorn());

    }
        @Test
//Froilanda eats 2 EarCorn, 1 Tomoato, and 2 Egg.
        public void froilandaBreakfastEggTest() {
            froilan = MainApplication.plot();
            froilanda= new Farmer("froilanda");
//get the farm belones to froilan;
            newFarm = froilan.getNewFarm();
            froilanda.setNewFarm(newFarm);

            froilanda.eat(new Egg());
            froilanda.eat(new Egg());

            Assert.assertEquals(5, froilanda.countEgg());
        }
    @Test
//Froilanda eats 2 EarCorn, 1 Tomoato, and 2 Egg.
    public void froilandaBreakfastTomatoTest() {
        froilan = MainApplication.plot();
        froilanda= new Farmer("froilanda");
//get the farm belones to froilan;
        newFarm = froilan.getNewFarm();
        froilanda.setNewFarm(newFarm);

        froilanda.eat(new Tomato());

        Assert.assertEquals(2, froilanda.countTomato());
    }
    @Test
    //Froilanda eats 2 EarCorn, 1 Tomoato, and 2 Egg.
    public void froilandaBreakfastEarCornTest() {
        froilan = MainApplication.plot();
        froilanda= new Farmer("froilanda");
//get the farm belones to froilan;
        newFarm = froilan.getNewFarm();
        froilanda.setNewFarm(newFarm);

        froilanda.eat(new EarCorn());

        Assert.assertEquals(0, froilanda.countEarCorn());
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
//            Field objField=new Field();
//            List<CropRow> lstCropRowsExpected=new ArrayList<>();
//            CropRow expectedFirstCrop=new CropRow(objField.createTomatoCrop());
//            CropRow expectedSecondCrop=new CropRow(objField.createCornStalkCrop());
//            CropRow expectedThirdCrop=new CropRow(objField.createTomatoCrop());
//            //When
//            lstCropRowsExpected.add(expectedFirstCrop);
//            lstCropRowsExpected.add(expectedSecondCrop);
//            lstCropRowsExpected.add(expectedThirdCrop);
//            //Then
//            Assert.assertEquals(expectedFirstCrop,lstCropRowsExpected.get(0));
//            Assert.assertEquals(expectedSecondCrop,lstCropRowsExpected.get(1));
//            Assert.assertEquals(expectedThirdCrop,lstCropRowsExpected.get(2));

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

//            Assert.assertTrue(seaBiscuit.eat());
//            Assert.assertTrue(redRum.eat());

        }

        @Test
        public void rideEachHorseTest() {
            Stable stable = new Stable();
            Horse seaBiscuit = new Horse("sea biscuit");

            stable.addHorse(seaBiscuit);

            seaBiscuit.isRidden();

           // Assert.assertTrue(seaBiscuit.isRidden());
        }
}





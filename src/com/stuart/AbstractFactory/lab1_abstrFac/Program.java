package com.stuart.AbstractFactory.lab1_abstrFac;

import com.stuart.AbstractFactory.factories.HouseFactory;
import com.stuart.AbstractFactory.factories.StoneHouseFactory;
import com.stuart.AbstractFactory.factories.WoodHouseFactory;
import com.stuart.Prototype.lab1_prototype.Coords;

import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        SceneFactory sceneFactory;

        if ( Locale.getDefault().getCountry().equals("ENG"))
            sceneFactory = new ColorSceneFactory();
        else
            sceneFactory = new BlackWhiteSceneFactory();

//        sceneFactory.createCircle(new Coords(2,3), 1.5).install();
//        sceneFactory.createLine(new Coords(6, 3), new Coords(5,6)).install();
        sceneFactory.createPoint(new Coords(1,1)).install();
    }
}

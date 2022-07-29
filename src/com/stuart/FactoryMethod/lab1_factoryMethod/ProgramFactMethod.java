package com.stuart.FactoryMethod.lab1_factoryMethod;

import com.stuart.Prototype.lab1_prototype.Coords;
import com.stuart.Prototype.lab1_prototype.GraphObject;
import com.stuart.Singletone.lab1_singletone.Scene;

public class ProgramFactMethod {
    public static void main(String[] args) {
//        CreatorGrObj creatorGrObj = new CreatorGrObj();

        CreatorGrObj creatorGrObj = new CreatorGrObj();

        GraphObject go = creatorGrObj.install(new Coords(1,3));
        GraphObject go2 = creatorGrObj.install(new Coords(6,3), new Coords(1,7));
        GraphObject go3 = creatorGrObj.install(new Coords(4,6), 4);

//        int i = Scene.graphObjects.size();
//        for (var y : Scene.graphObjects) {
//            System.out.println(i);
//        }


    }
}

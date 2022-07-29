package com.stuart.FactoryMethod.lab1_factoryMethod;

import com.stuart.Prototype.lab1_prototype.Coords;
import com.stuart.Prototype.lab1_prototype.GraphObject;
import com.stuart.Singletone.lab1_singletone.Scene;

public class CreatorGrObj {

    public GraphObject createGraphObj () {
        return new GraphObject() {
            @Override
            public GraphObject clone() {
                return null;
            }
        };
    }

    protected void onInstall (GraphObject graphObject) {
        Scene.graphObjects.add(graphObject);
    }

    public GraphObject install (Coords x) {
        GraphObject graphObject = FabricaGrOb.createGraphObj(x);
        System.out.printf("Установлено %s\n", graphObject);
        onInstall(graphObject);
        return graphObject;
    }

    public GraphObject install (Coords x, Coords y) {
        GraphObject graphObject = FabricaGrOb.createGraphObj(x, y);
        System.out.printf("Установлено %s\n", graphObject);
        onInstall(graphObject);
        return graphObject;
    }

    public GraphObject install (Coords x, double r) {
        GraphObject graphObject = FabricaGrOb.createGraphObj(x, r);
        System.out.printf("Установлено %s\n", graphObject);
        onInstall(graphObject);
        return graphObject;
    }
//
//
//    public  GraphObject createGraphObj(Coords x) {
//        return null;
//    }
//
//    public  GraphObject createGraphObj(Coords x, Coords y) {
//        return null;
//    }
//
//    public  GraphObject createGraphObj(Coords x, double r) {
//        return null;
//    }
}

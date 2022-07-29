package com.stuart.Builder.lab1_builder;

import com.stuart.Prototype.lab1_prototype.GraphObject;
import com.stuart.Singletone.Singleton4;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    boolean building;
    double s; //площадь сцены
    public List<GraphObject> graphObjects = new ArrayList<>();

    public Scene(double s) {
        this.s = s;
    }

    public boolean isBuilding() {
        return building;
    }
    public void setBuilding(boolean building) {
        this.building = building;
    }

    @Override
    public String toString() {
        return "Scene{" +
                "building=" + building +
                ", s=" + s +
                ", graphObjects=" + graphObjects.size() +
                '}';
    }
}

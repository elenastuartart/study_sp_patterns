package com.stuart.Adapter.lab2_adapter;

import com.stuart.Singletone.Singleton4;

import java.util.ArrayList;
import java.util.List;

public class Scene {

    double s; //площадь сцены
    public List<GraphObject> graphObjects = new ArrayList<>();

    public Scene(double s) {
        this.s = s;
    }


}

package com.stuart.Singletone.lab1_singletone;

import com.stuart.Prototype.lab1_prototype.GraphObject;
import com.stuart.Singletone.Singleton4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Scene {

    double s; //площадь сцены
    public static List<GraphObject> graphObjects = new ArrayList<>();

    private Scene(double s) {
        this.s = s;
    }

    private volatile static Scene instance;

    public static  Scene getInstance(double s) {
        if (instance == null)
            synchronized (Singleton4.class) {
                if (instance == null)
                    instance = new Scene(s);
            }

        return instance;
    }
}

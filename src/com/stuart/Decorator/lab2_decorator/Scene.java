package com.stuart.Decorator.lab2_decorator;

import com.stuart.Adapter.lab2_adapter.GraphObject;
import com.stuart.Composit.Circle;
import com.stuart.Composit.Coords;
import com.stuart.Composit.Point;
import com.stuart.Composit.*;

import java.util.ArrayList;
import java.util.List;

public class Scene {

    double s; //площадь сцены
    public List<GraphObjectComponent> graphObjects = new ArrayList<>();

    public Scene(double s) {
        this.s = s;
    }

}

package com.stuart.AbstractFactory.lab1_abstrFac;

import com.stuart.Prototype.lab1_prototype.Circle;
import com.stuart.Prototype.lab1_prototype.Coords;
import com.stuart.Prototype.lab1_prototype.Line;
import com.stuart.Prototype.lab1_prototype.Point;

public class BlackWhiteSceneFactory implements SceneFactory {

    public final String name = "black-white";

    @Override
    public Point createPoint(Coords x) {
        return new Point(x);
    }

    @Override
    public Line createLine(Coords x, Coords y) {
        return null;
    }

    @Override
    public Circle createCircle(Coords x, double r) {
        return null;
    }
}

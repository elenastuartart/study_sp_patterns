package com.stuart.AbstractFactory.lab1_abstrFac;

import com.stuart.Prototype.lab1_prototype.Circle;
import com.stuart.Prototype.lab1_prototype.Coords;
import com.stuart.Prototype.lab1_prototype.Line;
import com.stuart.Prototype.lab1_prototype.Point;

public class ColorSceneFactory implements SceneFactory{

    public final String name = "color";

    @Override
    public Point createPoint(Coords x) {
        return null;
    }

    @Override
    public Line createLine(Coords x, Coords y) {
        return new Line(x, y);
    }

    @Override
    public Circle createCircle(Coords x, double r) {
        return new Circle(x, r);
    }
}

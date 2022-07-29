package com.stuart.AbstractFactory.lab1_abstrFac;

import com.stuart.Prototype.lab1_prototype.Circle;
import com.stuart.Prototype.lab1_prototype.Coords;
import com.stuart.Prototype.lab1_prototype.Line;
import com.stuart.Prototype.lab1_prototype.Point;

public interface SceneFactory {

    Point createPoint(Coords x);
    Line createLine(Coords x, Coords y);
    Circle createCircle(Coords x, double r);

}

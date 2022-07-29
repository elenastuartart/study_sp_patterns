package com.stuart.FactoryMethod.lab1_factoryMethod;

import com.stuart.Prototype.lab1_prototype.*;

public class FabricaGrOb {

    public static Point createGraphObj(Coords x) {
        return new Point(x);
    }

    public static Line createGraphObj(Coords x, Coords y) {
        return new Line(x, y);
    }

    public static Circle createGraphObj(Coords x, double r) {
        return new Circle(x, r);
    }
}

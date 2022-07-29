package com.stuart.Prototype.lab1_prototype;

public class Line extends GraphObject {

//    int x1, y1, x2, y2;

    Coords x, y;

    public Line(Coords x, Coords y) {
        this.x = x;
        this.y = y;

    }

    public Line (Line l) {
        this(l.x, l.y);
    }

    @Override
    public Line clone() {
        return new Line(this);
    }

    @Override
    public String toString() {
        return String.format("Line (%d,%d, %d,%d)", x.x, x.y, y.x, y.y);
    }

    public GraphObject install () {
        System.out.println("Установили линию");
        return this;
    }
}

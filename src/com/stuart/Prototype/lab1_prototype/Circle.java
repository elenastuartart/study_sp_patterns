package com.stuart.Prototype.lab1_prototype;

public class Circle extends GraphObject {

    Coords x;
    double r;

    public Circle(Coords x, double r) {
        this.x = x;
        this.r = r;
    }

    public Circle(Circle c) {
        this(c.x, c.r);
    }


    @Override
    public GraphObject clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return String.format("Circle (%d,%d)", x.x, x.y);
    }

    public GraphObject install () {
        System.out.println("Установили круг");
        return this;
    }
}

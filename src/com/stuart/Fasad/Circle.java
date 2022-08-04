package com.stuart.Fasad;


public class Circle extends GraphObject {

    public Coords center;
    public String color;
    public double r;


    public Circle(Coords center, double r) {
        this.center = center;
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.printf("Создан круг с координатами (%d, %d) %n", center.x, center.y);
    }

}

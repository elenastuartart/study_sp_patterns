package com.stuart.Composit;

public class Line extends SimpleShape implements GraphObject {

//    int x1, y1, x2, y2;

    Coords x, y;


    public Line(Coords x, Coords y) {
        super("линия");
        this.x = x;
        this.y = y;

    }


    @Override
    public void draw() {
        System.out.println("Лист линия");
    }


    @Override
    public void setColor(String Color) {

    }
}

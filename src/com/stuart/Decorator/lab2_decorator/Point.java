package com.stuart.Decorator.lab2_decorator;

import com.stuart.Composit.SimpleShape;

public class Point extends GraphObject{

    public com.stuart.Decorator.lab2_decorator.Coords x;
    public String color;


    public Point(Coords x) {

        this.x = x;
    }


    @Override
    public void draw() {

    }
}

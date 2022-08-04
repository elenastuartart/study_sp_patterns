package com.stuart.Decorator.lab2_decorator;

import com.stuart.Composit.GraphObjectComponent;
import com.stuart.Composit.SimpleShape;

public class Line  implements GraphObjectComponent {

//    int x1, y1, x2, y2;

    com.stuart.Decorator.lab2_decorator.Coords x, y;


    public Line(com.stuart.Decorator.lab2_decorator.Coords x, Coords y) {

        this.x = x;
        this.y = y;

    }


    @Override
    public void draw() {

    }


    @Override
    public void setColor(String Color) {

    }
}

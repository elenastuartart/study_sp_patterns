package com.stuart.Fasad;

import com.stuart.Composit.GraphObjectComponent;

public class Line  implements GraphObjectComponent {

//    int x1, y1, x2, y2;

    Coords x, y;


    public Line(Coords x, Coords y) {

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

package com.stuart.Adapter.lab2_adapter;

public class TriangleAdapter implements GraphObject {

    Triangle triangle;
    Coords xxx, yyy, zzz;


    public TriangleAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public void draw() {
        triangle.draw();
    }

    @Override
    public void move(Coords xx) {
        triangle.move(xxx,yyy,zzz);
    }

    @Override
    public void setColor(String Color) {
        triangle.setColor(Color);
    }

    public void initMoveCoords(Coords xx, Coords yy, Coords zz) {
        this.xxx = xx;
        this.yyy = yy;
        this.zzz = zz;
    }
}

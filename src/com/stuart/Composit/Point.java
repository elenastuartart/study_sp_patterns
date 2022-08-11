package com.stuart.Composit;

public class Point extends SimpleShape implements GraphObject {

    public Coords x;
    public String color;


    public Point(Coords x) {
        super("точка");
        this.x = x;
    }

    @Override
    public void draw() {
        System.out.println("Лист точка");;
    }


    @Override
    public void setColor(String Color) {
        System.out.printf("Установлен %s цвет точки %n", Color);
    }
}

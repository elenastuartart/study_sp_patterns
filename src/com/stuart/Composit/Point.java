package com.stuart.Composit;

public class Point extends SimpleShape implements GraphObjectComponent {

    public Coords x;
    public String color;


    public Point(Coords x) {
        super("точка");
        this.x = x;
    }

    @Override
    public void draw() {
        System.out.printf("Создана точка с координатами (%d, %d) %n ", x.x, x.y);
    }


    @Override
    public void setColor(String Color) {
        System.out.printf("Установлен %s цвет точки %n", Color);
    }
}

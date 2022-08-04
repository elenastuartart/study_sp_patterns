package com.stuart.Adapter.lab2_adapter;

public class Point implements GraphObject {

    public com.stuart.Adapter.lab2_adapter.Coords x;
    public String color;

    public Point(com.stuart.Adapter.lab2_adapter.Coords x) {
        this.x = x;
    }

    @Override
    public void draw() {
        System.out.printf("Создана точка с координатами (%d, %d) %n ", x.x, x.y);
    }

    @Override
    public void move(Coords xx) {
        System.out.printf("Точка перенесена по координатам (%d, %d)", xx.x, xx.y);
    }

    @Override
    public void setColor(String Color) {
        System.out.printf("Установлен %s цвет точки %n", Color);
    }
}

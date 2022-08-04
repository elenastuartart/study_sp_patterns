package com.stuart.Adapter.lab2_adapter;

public class Circle implements GraphObject {

    public com.stuart.Adapter.lab2_adapter.Coords center;
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

    @Override
    public void move(Coords xx) {
        System.out.printf("Круг перенесен по координатам (%d, %d) %n", xx.x, xx.y);
    }

    @Override
    public void setColor(String Color) {
        System.out.printf("Установлен %s цвет точки %n", Color);
    }
}

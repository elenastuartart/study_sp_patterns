package com.stuart.Prototype.lab1_prototype;

public class Point extends GraphObject {

//    int x, y;

    Coords x; //композиция. Координата включена в точку

    public Point(Coords x) {
        this.x = x;
    }

    //копирующий конструктор
    public Point(Point p) {
        this(p.x);
    }

    //метод клон
    @Override
    public Point clone() {
        return new Point(this);
    }

    @Override
    public String toString() {
        return String.format("Point (%d, %d)", x.x, x.y);
    }

    public GraphObject install () {
        System.out.println("Установили точку");
        return this;
    }
}

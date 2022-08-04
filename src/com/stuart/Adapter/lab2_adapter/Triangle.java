package com.stuart.Adapter.lab2_adapter;

public class Triangle {

    public com.stuart.Adapter.lab2_adapter.Coords x, y, z;

    public Triangle(com.stuart.Adapter.lab2_adapter.Coords x, com.stuart.Adapter.lab2_adapter.Coords y, Coords z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public void draw() {
        System.out.printf("Создан треугольник с координатами (%d, %d, %d, %d, %d, %d) %n",
                x.x,x.y, y.x,y.y, z.x,z.y);
    }


    public void move(com.stuart.Adapter.lab2_adapter.Coords xx, Coords yy, Coords zz) {
        System.out.printf("Треугольник перенесен по координатам (%d, %d, %d, %d, %d, %d) %n",
                xx.x,xx.y, yy.x,yy.y, zz.x,zz.y);
    }


    public void setColor(String Color) {
        System.out.printf("Установлен %s цвет треугольника %n", Color);
    }
}

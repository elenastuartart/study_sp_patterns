package com.stuart.Composit;

public class Circle extends SimpleShape implements GraphObject {

    public Coords center;
    public String color;
    public double r;




    public Circle(Coords center, double r) {
        super("круг");
        this.center = center;
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Лист круг");
    }


    @Override
    public void setColor(String Color) {
        System.out.printf("Установлен %s цвет точки %n", Color);
    }
}

package com.stuart.Composit;

public class Circle extends SimpleShape implements GraphObjectComponent {

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
        System.out.printf("Создан круг с координатами (%d, %d) %n", center.x, center.y);
    }


    @Override
    public void setColor(String Color) {
        System.out.printf("Установлен %s цвет точки %n", Color);
    }
}

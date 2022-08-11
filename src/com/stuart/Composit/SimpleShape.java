package com.stuart.Composit;

public class SimpleShape implements GraphObject {

    public final String type = "simple";

    public String name;

    public SimpleShape(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Элемент дерева-сцены");
    }


    @Override
    public void setColor(String Color) {

    }
}

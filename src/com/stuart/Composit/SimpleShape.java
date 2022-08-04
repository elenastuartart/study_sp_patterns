package com.stuart.Composit;

public class SimpleShape implements GraphObjectComponent {

    public final String type = "simple";

    public String name;

    public SimpleShape(String name) {

        this.name = name;
    }

    @Override
    public void draw() {

    }


    @Override
    public void setColor(String Color) {

    }
}

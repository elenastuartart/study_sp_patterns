package com.stuart.Composit;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape implements GraphObjectComponent {

    public List<GraphObjectComponent> components = new ArrayList<>();
    public int width = 50;
    public int heigth = 10;


    public final String type = "composite";

    public CompositeShape() {
    }

    @Override
    public void draw() {
        System.out.println("---------Контейнер с фигурами-------");
        System.out.println();
    }

    public void add(GraphObjectComponent shape) {
        components.add(shape);
        System.out.printf("----Добавлено: ");
    }

    @Override
    public void setColor(String Color) {

    }
}

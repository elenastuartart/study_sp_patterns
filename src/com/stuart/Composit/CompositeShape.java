package com.stuart.Composit;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape implements GraphObject {

    public List<GraphObject> components = new ArrayList<>();

    public final String type = "composite";

    boolean flag = false;

    public CompositeShape() {
    }

    @Override
    public void draw() {

        for (int i = 0; i < components.size(); i++) {
            components.get(i).draw();
        }
    }

    public void add(GraphObject shape) {
        components.add(shape);

    }

    @Override
    public void setColor(String Color) {

    }
}

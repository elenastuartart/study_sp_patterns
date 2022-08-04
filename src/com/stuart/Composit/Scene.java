package com.stuart.Composit;

import com.stuart.Adapter.lab2_adapter.GraphObject;

import java.util.ArrayList;
import java.util.List;

public class Scene {

    double s; //площадь сцены
    public List<GraphObject> graphObjects = new ArrayList<>();

    public Scene(double s) {
        this.s = s;
    }

    public void init() {
        CompositeShape cs = new CompositeShape();
        cs.draw(); //создали общий контейнер


        SimpleShape p = new Point(new Coords(1,1));
        SimpleShape c = new Circle(new Coords(3,3), 4);

        cs.add(p); //добавили простую фигуру в контейнер
        System.out.println(p.name);
        cs.add(c);
        System.out.println(c.name);

        cs.draw();


    }


}

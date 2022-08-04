package com.stuart.Adapter.lab2_adapter;

import com.stuart.Prototype.lab1_prototype.Line;

public class ProgramAdapter {

    public static void main(String[] args) {

        Scene scene = new Scene(9);

        Point p = new Point(new Coords(1,1));
        p.draw();
        p.setColor("Красный");
        p.move(new Coords(2,2));

        GraphObject c = new Circle(new Coords(3,6), 5);
        c.draw();
        c.setColor("Синий");
        c.move(new Coords(1,2));
        scene.graphObjects.add(c);
        scene.graphObjects.add(p);

        TriangleAdapter tr = new TriangleAdapter(new Triangle(new Coords(1,1), new Coords(2,2), new Coords(3,3)));
        tr.draw();
        tr.setColor("Зеленый");
        tr.initMoveCoords(new Coords(4,4), new Coords(5,5), new Coords(6,6));
        tr.move(new Coords(8,7));
        scene.graphObjects.add(tr);

        System.out.println(scene.graphObjects.size());

//        scene.graphObjects.add(c);
//        scene.graphObjects.add(p);
//        System.out.println( scene.graphObjects.size());
//        scene.graphObjects.add(new Point(new Coords(1, 1)));
//        scene.graphObjects.add(new Circle(new Coords(2, 3), 5));
//        scene.graphObjects.add(new Line(new Coords(1,2), new Coords(4, 4)));

    }
}

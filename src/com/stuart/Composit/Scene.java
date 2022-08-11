package com.stuart.Composit;

public class Scene {

    double s; //площадь сцены
//    public List<GraphObject> graphObjects = new ArrayList<>();
    CompositeShape compositeMainNode;

    public Scene(double s) {
        this.s = s;
    }

    boolean flag = false;

    public void init() {
        compositeMainNode = new CompositeShape();
        System.out.println("Главный контейнер");

            CompositeShape cs = new CompositeShape(); // создали новый контейнер
            compositeMainNode.add(cs); //в главный контейнер положили доп контейнер
            System.out.println("Доп контейнер");

                SimpleShape circle = new Circle(new Coords(1,1), 5);
                cs.add(circle); // в доп контейнер добавили круг

            GraphObject point = new Point(new Coords(3,2));
            compositeMainNode.add(point);// в главный контейнер положили точку и линию

            Line line = new Line(new Coords(2,2), new Coords(3,2));
            compositeMainNode.add(line);

        compositeMainNode.draw();

    }


}

package com.stuart.Builder.lab1_builder;

import com.stuart.AbstractFactory.lab1_abstrFac.ColorSceneFactory;
import com.stuart.Prototype.lab1_prototype.*;

public class TestSceneBuilder implements Builder {

    private Scene scene;

    @Override
    public void createScene() {
        scene = new Scene(4);
        scene.setBuilding(true);
    }

    @Override
    public void addGraphObj() {

        scene.graphObjects.add(new Point(new Coords(1,1)));

    }

    public Scene getScene() {
        return scene;
    }
}

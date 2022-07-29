package com.stuart.Builder.lab1_builder;

import com.stuart.Prototype.lab1_prototype.Circle;
import com.stuart.Prototype.lab1_prototype.Coords;
import com.stuart.Prototype.lab1_prototype.Line;
import com.stuart.Prototype.lab1_prototype.Point;

public class ProgramBuilder {
    public static void main(String[] args) {

        TestSceneBuilder sceneBuilder = new TestSceneBuilder();
        SizeMemoryBuilder sizeMemoryBuilder = new SizeMemoryBuilder();

        Director director = new Director();
        director.setBuilder(sceneBuilder);
        director.make();

        Scene scene = sceneBuilder.getScene();
        System.out.println(scene.toString());

        director.setBuilder(sizeMemoryBuilder);
    director.make();
        int sum = sizeMemoryBuilder.getResult();
        System.out.println(sum);
    }
}

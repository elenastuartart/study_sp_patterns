package com.stuart.Builder.lab1_builder;

public class FasadeBuilder {

    public FasadeBuilder() {
    }

    public void initBuilder() {
        TestSceneBuilder sceneBuilder = new TestSceneBuilder();
        SizeMemoryBuilder sizeMemoryBuilder = new SizeMemoryBuilder();

        Director director = new Director();
        director.setBuilder(sceneBuilder);
        director.make();

        Scene scene = sceneBuilder.getScene();
        System.out.println(scene.toString());
    }
}

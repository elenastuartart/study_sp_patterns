package com.stuart.Builder.lab1_builder;

import com.stuart.Prototype.lab1_prototype.GraphObject;

public class Director {

    private Builder builder;

    public Director() {

    }

//    public void make(int s, GraphObject g1, GraphObject g2, GraphObject g3) {
//        builder.createScene(s);
//        builder.addGraphObj(g1);
//        builder.addGraphObj(g2);
//        builder.addGraphObj(g3);
//    }

    public void make() {
        builder.createScene();
        builder.addGraphObj();
        builder.addGraphObj();
        builder.addGraphObj();
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}

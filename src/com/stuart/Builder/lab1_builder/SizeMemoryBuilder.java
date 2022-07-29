package com.stuart.Builder.lab1_builder;

import com.stuart.Prototype.lab1_prototype.GraphObject;

public class SizeMemoryBuilder implements Builder {

    int total;

    @Override
    public void createScene() {
        total += 90;
    }

    @Override
    public void addGraphObj() {
        total += 15;
    }

    public int getResult() {
        return total;
    }

}

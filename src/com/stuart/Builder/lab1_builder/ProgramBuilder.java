package com.stuart.Builder.lab1_builder;

import com.stuart.Prototype.lab1_prototype.Circle;
import com.stuart.Prototype.lab1_prototype.Coords;
import com.stuart.Prototype.lab1_prototype.Line;
import com.stuart.Prototype.lab1_prototype.Point;

public class ProgramBuilder {
    public static void main(String[] args) {

        FasadeBuilder fb = new FasadeBuilder();
        fb.initBuilder();
    }
}

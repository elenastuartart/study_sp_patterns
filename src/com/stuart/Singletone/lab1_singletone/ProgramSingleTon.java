package com.stuart.Singletone.lab1_singletone;

public class ProgramSingleTon {

    public static void main(String[] args) {

        Scene scene = Scene.getInstance(6);
        System.out.println(scene);

        Scene scene1 = Scene.getInstance(3);
        System.out.println(scene1);
    }
}

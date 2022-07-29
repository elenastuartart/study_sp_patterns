package com.stuart.Prototype.lab1_prototype;

public class Coords {

    int x, y;

    public Coords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("%d, %d", x, y);
    }
}

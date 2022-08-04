package com.stuart.Decorator.lab2_decorator;

public class CompressSizeDecorator extends BaseDecorator {

    public CompressSizeDecorator(GraphObject wrappee, int size) {
        super(wrappee);
        this.size = size;
    }

    public int size;

    @Override
    public void draw() {

    }

    public void compressSize(int value) {
        System.out.printf("Размер фигуры сжат на %d процентов", value);
    }

    public void getFinalSize (int value) {
        System.out.printf("Итоговый размер фигуры %d", size-value );
    }
}

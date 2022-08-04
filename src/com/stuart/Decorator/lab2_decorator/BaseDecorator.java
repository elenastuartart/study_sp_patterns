package com.stuart.Decorator.lab2_decorator;

public abstract class BaseDecorator extends GraphObject {

    protected GraphObject wrappee;

    public BaseDecorator(GraphObject wrappee) {
        this.wrappee = wrappee;
    }
}

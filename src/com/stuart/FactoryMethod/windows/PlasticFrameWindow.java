package com.stuart.FactoryMethod.windows;

import com.stuart.FactoryMethod.windows.Window;

public class PlasticFrameWindow implements Window {
    @Override
    public void open() {
        System.out.println("Открыли пластиковое окно");
    }

    @Override
    public String toString() {
        return "Пластиковое окно";
    }
}

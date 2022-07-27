package com.stuart.FactoryMethod.windows;

import com.stuart.FactoryMethod.windows.Window;

public class MetalFrameWindow implements Window {
    @Override
    public void open() {
        System.out.println("ќткрыли металлическое окно");
    }

    @Override
    public String toString() {
        return "ћеталлическое окно";
    }
}

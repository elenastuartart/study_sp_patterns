package com.stuart.FactoryMethod;

import com.stuart.FactoryMethod.windows.Window;
import com.stuart.FactoryMethod.windows.WoodFrameWindow;

public class CompanyB extends Supplier {
    @Override
    public Window createWindow() {
        return new WoodFrameWindow();
    }

}
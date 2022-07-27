package com.stuart.FactoryMethod;

import com.stuart.FactoryMethod.windows.PlasticFrameWindow;
import com.stuart.FactoryMethod.windows.Window;

public class CompanyA extends Supplier {
    @Override
    public Window createWindow() {
        return new PlasticFrameWindow();
    }
}

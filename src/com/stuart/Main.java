package com.stuart;

import com.stuart.FactoryMethod.CompanyA;
import com.stuart.FactoryMethod.CompanyB;
import com.stuart.FactoryMethod.GenericSupplier;
import com.stuart.FactoryMethod.Supplier;
import com.stuart.FactoryMethod.windows.MetalFrameWindow;
import com.stuart.FactoryMethod.windows.Window;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Window> windows = new ArrayList<Window>();

    public static void main(String[] args) {
        //Window  wnd = new MetalFrameWindow();

        Supplier[] creators = new Supplier[] {
                new Supplier(), new CompanyA(), new CompanyB(),
                new GenericSupplier(MetalFrameWindow.class)};

        for(Supplier c : creators)
            c.install().open();

        System.out.println("”становленные окна:");
        for(Window w : windows)
            System.out.println(w);
    }

}

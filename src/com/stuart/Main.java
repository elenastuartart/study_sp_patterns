package com.stuart;

import com.stuart.AbstractFactory.factories.HouseFactory;
import com.stuart.AbstractFactory.factories.StoneHouseFactory;
import com.stuart.AbstractFactory.factories.WoodHouseFactory;
import com.stuart.Builder.*;
import com.stuart.FactoryMethod.CompanyA;
import com.stuart.FactoryMethod.CompanyB;
import com.stuart.FactoryMethod.GenericSupplier;
import com.stuart.FactoryMethod.Supplier;
import com.stuart.FactoryMethod.windows.MetalFrameWindow;
import com.stuart.FactoryMethod.windows.Window;
import com.stuart.Singletone.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static java.lang.System.out;

public class Main {

    public static List<Window> windows = new ArrayList<Window>();

    public static void main(String[] args) {
        //Window  wnd = new MetalFrameWindow();
    //фабричный метод
        Supplier[] creators = new Supplier[] {
                new Supplier(), new CompanyA(), new CompanyB(),
                new GenericSupplier(MetalFrameWindow.class)};

        for(Supplier c : creators)
            c.install().open();

        out.println("установленные окна:");
        for(Window w : windows)
            out.println(w);

    //абстрактная фабрика
        HouseFactory factory;
        if ( Locale.getDefault().getCountry().equals("RU"))
            factory = new StoneHouseFactory();
        else
            factory = new WoodHouseFactory();

        factory.createWall().build();
        factory.createRoof().cover().waterProtect();
        factory.createWindow().install().open();

    //строитель
        PriceBuilder priceBuilder = new PriceBuilder();
        HouseBuilder houseBuilder = new HouseBuilder();
        DocBuilder docBuilder = new DocBuilder();

        Director salesman = new Director(priceBuilder); // �������
        Director manager = new Director(docBuilder); // ��������
        Director foreman = new Director(houseBuilder); // ������

        salesman.make(true);
        int price = priceBuilder.getResult();
        out.printf("Резултат работы продавца - цена: %d\n\n", price);

        foreman.make(true);
        House house = houseBuilder.getResult();
        out.printf("Резултат работы прораба - дом:\n%s\n", house);

        manager.make(true);
        Documentation doc = docBuilder.getResult();
        out.printf("Резултат работы менеджера - пакет документов:\n%s\n", doc);

        //синглтон

        {
            Singleton3 s1 = Singleton3.getInstance();
            Singleton3 s2 = Singleton3.getInstance();
            out.println(s1);
            out.println(s2);
        }
        {
            Singleton4 s1 = Singleton4.getInstance();
            Singleton4 s2 = Singleton4.getInstance();
            out.println(s1);
            out.println(s2);
        }

        {
            Singleton6 s1 = Singleton6.instance;
            Singleton6 s2 = Singleton6.instance;
            out.println(s1);
            out.println(s2);
        }

    }

}

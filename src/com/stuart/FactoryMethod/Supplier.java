package com.stuart.FactoryMethod;

import com.stuart.FactoryMethod.windows.Window;
import com.stuart.Main;

// Может быть чисто абстрактным (интерфейсом)
// или содержать реализацию
// Фабричные методы могут параметризированы с целью создания
// разных видов продуктов
public class Supplier {
    //полиморфный виртуальный метод вместо конструктора
    public Window createWindow() {
        return new Window() {
            @Override
            public String toString() {
                return "Окно";
            }
            @Override
            public void open() {
                System.out.println("Открыли окно");
            }
        };
    }

    // hook - хуки - прежде чем возвращать созданный объект, можно этот объект передать в какой-то защищенный метод
    //и что-то с ним сделать. Хук метод - onInstall, используем его в методе  install
    protected void onInstall(Window window)
    {
        Main.windows.add(window);
    }

    public Window install()
    {
        Window window = createWindow();
        System.out.printf("Установлено %s\n", window);
        onInstall(window); // hook
        return window;
    }
}


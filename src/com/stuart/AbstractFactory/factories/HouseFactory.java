package com.stuart.AbstractFactory.factories;


import com.stuart.AbstractFactory.roofs.Roof;
import com.stuart.AbstractFactory.walls.Wall;
import com.stuart.AbstractFactory.walls.Wall.*;
import com.stuart.AbstractFactory.windows.Window;


public interface HouseFactory {
	Wall createWall();
	Roof createRoof();
	Window createWindow();
}

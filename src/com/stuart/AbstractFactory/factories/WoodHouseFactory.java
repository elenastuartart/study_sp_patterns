package com.stuart.AbstractFactory.factories;


import com.stuart.AbstractFactory.roofs.Roof;
import com.stuart.AbstractFactory.roofs.WoodRoof;
import com.stuart.AbstractFactory.walls.Wall;
import com.stuart.AbstractFactory.walls.WoodWall;
import com.stuart.AbstractFactory.windows.Window;
import com.stuart.AbstractFactory.windows.WoodFrameWindow;

public class WoodHouseFactory implements HouseFactory {

	@Override
	public Wall createWall() {
		return new WoodWall();
	}

	@Override
	public Roof createRoof() {
		return new WoodRoof();
	}

	@Override
	public Window createWindow() {
		return new WoodFrameWindow();
	}

}

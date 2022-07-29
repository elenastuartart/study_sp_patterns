package com.stuart.AbstractFactory.factories;

import com.stuart.AbstractFactory.roofs.Roof;
import com.stuart.AbstractFactory.roofs.TileRoof;
import com.stuart.AbstractFactory.walls.BrickWall;
import com.stuart.AbstractFactory.walls.Wall;
import com.stuart.AbstractFactory.windows.PlasticFrameWindow;
import com.stuart.AbstractFactory.windows.Window;

public class StoneHouseFactory implements HouseFactory {



	@Override
	public Wall createWall() {
		return new BrickWall();
	}

	@Override
	public Roof createRoof() {
		return new TileRoof();
	}

	@Override
	public Window createWindow() {
		return new PlasticFrameWindow();
	}

}

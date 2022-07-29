package com.stuart.AbstractFactory.roofs;

import static java.lang.System.out;

public class TileRoof implements Roof {

	@Override
	public Roof cover() {
		out.println("покрыли крышу из черепицы");
		return this;
	}

	@Override
	public void waterProtect() {
		out.println("сделали гидроизоляцию черепичной крыши");
	}

}

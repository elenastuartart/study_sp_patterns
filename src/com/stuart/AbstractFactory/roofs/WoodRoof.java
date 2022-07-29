package com.stuart.AbstractFactory.roofs;

import static java.lang.System.out;

public class WoodRoof implements Roof{

	@Override
	public Roof cover() {
		out.println("покрыли крышу из дерева");
		return this;
	}

	@Override
	public void waterProtect() {
		out.println("сделали гидроизоляцию деревянной крыши");
		
	}

}

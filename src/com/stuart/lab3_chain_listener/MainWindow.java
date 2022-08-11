package com.stuart.lab3_chain_listener;

public class MainWindow extends CompositeControl {
	@Override
	public void drawLineFinish() {
		super.drawLineFinish();
		System.out.println();
	}

}

package com.stuart.lab3_chain_listener.handler;

public class EventRequest {
	private boolean handled = false; //флажок обработано

	public boolean isHandled() {
		return handled;
	}

	public void setHandled(boolean handled) {
		this.handled = handled;
	}
	
	public void consume() {
		setHandled(true);
	}
	
	
	
}

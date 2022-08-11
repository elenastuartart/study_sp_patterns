package com.stuart.ChainOfResponsibility;


import com.stuart.ChainOfResponsibility.events.EventRequest;
import com.stuart.ChainOfResponsibility.events.Handler;

// ����� ����� ��c������ � ���� BaseHandler
public abstract class UIComponent implements Handler {
	
	private Handler nextHandler;
	
	public abstract boolean draw(int line);
	public abstract int getHeight();
	public abstract int getWidth();
	
	@Override
	public void setNextHandler(Handler next) {
		nextHandler = next;
	}
	
	@Override
	public void handle(EventRequest request) {
		if (request.isHandled()) return;
		System.out.printf("Handle event in %s\n", this);
		if (nextHandler != null)
			nextHandler.handle(request);
			
	}

}

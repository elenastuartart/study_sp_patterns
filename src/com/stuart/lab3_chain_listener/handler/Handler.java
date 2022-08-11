package com.stuart.lab3_chain_listener.handler;

public interface Handler { //класс обработчика

	void setNextHandler(Handler next); //установить след обработчика
	void handle(EventRequest request); //обработать запрос
}

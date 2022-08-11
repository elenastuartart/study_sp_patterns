package com.stuart.lab3_chain_listener;

import com.stuart.lab3_chain_listener.handler.EventRequest;
import com.stuart.lab3_chain_listener.handler.Handler;
import com.stuart.lab3_chain_listener.handler.PressListener;

import java.util.ArrayList;
import java.util.List;

// ����� ����� ��c������ � ���� BaseHandler
public abstract class UIComponent implements Handler { //класс компоненты реализует обработчика
	
	private Handler nextHandler; //ссылка на следующего обработчика

	private List<PressListener> listeners =
			new ArrayList<PressListener>(); //коллекция подписчиков
	
	public abstract boolean draw(int line);
	public abstract int getHeight();
	public abstract int getWidth();
	
	@Override
	public void setNextHandler(Handler next) { //установим след обработчика
		nextHandler = next;
	}
//
	public void addPressListener(PressListener l) { //добавим слушателя
		listeners.add(l);
	}
//
	public void removePressListener(PressListener l) {
		listeners.remove(l);
	}
//
	@Override
	public void handle(EventRequest request) { //обработка события
		//System.out.printf("Handle event in %s\n", this);


		// raise event
		for(PressListener l : listeners) { //проверяем каждого подписчика из списка
			if (request.isHandled()) return; //если запрос обработан выходим из метода

			l.press(this, request); //обрабатываем запрос
		}

		if (nextHandler != null) //если следующий обработчик существует
			nextHandler.handle(request); //назначаем следующему обработчику выполнить этот запрос

	}

}

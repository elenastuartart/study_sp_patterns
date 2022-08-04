package com.stuart.Decorator.widgets;

import com.stuart.Decorator.*;


public class Program {

	public static void main(String[] args) {
		
		// ���������� ������� ����, ��������� ��� � ���� � �����������
		CompositeControl mainWin = new CompositeTitleDecorator(
				new MainWindow(), "Main Window title") ;
		
		CompositeControl frame1 = new CompositeControl();
		CompositeControl frame2 = new CompositeControl();
		frame1.add(new Label("Login")).add(new Button("OK"));
		frame2.add(new Label("Password")).add(new Button("Verify"));
		
		// ���������� ��������� � ������� Print
		mainWin.add(frame1).add(frame2).
			add(new CompositeTitleDecorator(new CompositeControl(), "CMD").
				add(new Button("Print")));
		
		// ��������� ����
		mainWin.draw();
		
		

	}

}

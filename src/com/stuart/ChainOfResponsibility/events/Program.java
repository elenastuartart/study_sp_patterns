package com.stuart.ChainOfResponsibility.events;


import com.stuart.ChainOfResponsibility.Button;
import com.stuart.ChainOfResponsibility.CompositeControl;
import com.stuart.ChainOfResponsibility.Label;
import com.stuart.ChainOfResponsibility.MainWindow;

public class Program {

	public static void main(String[] args) {
		
		CompositeControl mainWin = new MainWindow();
		CompositeControl frame1 = new CompositeControl();
		CompositeControl frame2 = new CompositeControl();
		frame1.add(new Label("Login")).add(new Button("OK"));
		frame2.add(new Label("Password")).add(new Button("Verify"));
		Button printButton = new Button("Print");
		mainWin.add(frame1).add(frame2).add(new CompositeControl().add(printButton));
		
		// ��������� ����
		mainWin.draw();
		printButton.press();
		
		
		
		

	}

}

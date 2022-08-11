package com.stuart.Visitor;


import com.stuart.Visitor.graph.AbstractGOFactory;
import com.stuart.Visitor.graph.ColorGOFactory;
import com.stuart.Visitor.graph.Scene;

public class Program {

	public static void main(String[] args) {
		AbstractGOFactory gof = new ColorGOFactory();
		gof.createPoint().setColor("red");
		gof.createPoint().setColor("green");
		
		gof.createCircle().setColor("blue");
		
		Scene.instance.draw();
		Scene.instance.exportToXML();
		

	}

}

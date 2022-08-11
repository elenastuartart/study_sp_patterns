package com.stuart.Visitor.graph;


import com.stuart.Visitor.ExportVisitor;
import com.stuart.Visitor.Exportable;
import com.stuart.Visitor.JSONExportVisitor;
import com.stuart.Visitor.XMLExportVisitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Scene {
	private List<GraphObject> objects ;
	public static final Scene instance = new Scene();
	
	private Scene() {
		objects = new ArrayList<GraphObject>();
	}
	
	public void add(GraphObject o) {
		objects.add(o);
	} 
	
	public void clear() {
		objects.clear();
	}
	
	public void draw() {
		for(GraphObject g : objects)
			g.draw();
	}
	
	public void exportToJSON() {
		ExportVisitor visitor = new JSONExportVisitor(); // создаем конкретный тип посетителя - продавец
		Iterator<GraphObject> iter = objects.iterator(); //создаем перебиратель для графической объектов
		System.out.print('[');
		while (iter.hasNext()) {
			GraphObject g = iter.next(); // получаем след объект - жителя
			if (g instanceof Exportable) { // если житель умеет принимать посетителя
				((Exportable)g).accept(visitor); //тогда пусть принимает посетителя. А посетитель взависимости от 
				// типа жителя подберет для него нужный алгоритм (товар)
				if (iter.hasNext()) System.out.println(',');
			}
		}
		System.out.println(']');
	}

	public void exportToXML() {
		ExportVisitor visitor = new XMLExportVisitor(); // создаем конкретный тип посетителя - продавец
		Iterator<GraphObject> iter = objects.iterator(); //создаем перебиратель для графической объектов
		System.out.print('{');
		while (iter.hasNext()) {
			GraphObject g = iter.next(); // получаем след объект - жителя
			if (g instanceof Exportable) { // если житель умеет принимать посетителя
				((Exportable)g).accept(visitor); //тогда пусть принимает посетителя. А посетитель взависимости от
				// типа жителя подберет для него нужный алгоритм (товар)
				if (iter.hasNext()) System.out.println(',');
			}
		}
		System.out.println('}');
	}
	/*
	 * <scene>
	 * 		<Point x=10 y="20" />
	 * </scene>
	 * 
	 * 
	 */
	

}

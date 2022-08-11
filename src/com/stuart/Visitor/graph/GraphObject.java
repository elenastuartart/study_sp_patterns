package com.stuart.Visitor.graph;


import com.stuart.Visitor.ExportVisitor;
import com.stuart.Visitor.Exportable;

// абстрактный житель должен уметь принять любого посетителя (реализовать интерфейс с функционалом)
public abstract class GraphObject implements Cloneable, Exportable {
	
	public static final String DEFAULT_COLOR = "black";
	private String color;
	
	public GraphObject() {
		this(DEFAULT_COLOR);
	}
	public GraphObject(String color) {
		super();
		this.color = color;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract void draw();
	
	public abstract void accept(ExportVisitor v); //предусмотрена возможность принятия посетителя

}

package com.stuart.Prototype;

public class ColorPoint extends Point implements Prototype {
	String color;

	public ColorPoint(int x, int y, String color) {
		super (x,y); //вызываем родительский конструктор
		this.color = color;
		//this.color = new String(color);
	}

	//клонирующий конструктор - передаем готовый объект параметром и для текущего объекта копируем его поля
	public ColorPoint(ColorPoint p) {
		this(p.x, p.y, p.color);
	}

	//в клонирующем методе вызываем клон конструктор с параметром, содерж готовый объект
	@Override
	public ColorPoint Clone() {
		return new ColorPoint(this);
	}

//	@Override
//	public String toString() {
//		return String.format("Color Point (%d,%d) %s", x,y, color);
//	}
	
	

}

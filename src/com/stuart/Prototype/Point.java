package com.stuart.Prototype;

public class Point implements Cloneable {

	int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//копирующий конструктор - передаем в параметры уже готовый объект и копируем его поля для текузего объекта
	public Point(Point p) {
		this(p.x, p.y);
	}

	//в клонирующем методе вызываем клон конструктор с параметром, содерж готовый объект
	@Override
	public Point clone() {
		return new Point(this);
	}
	
//	@Override
//	public String toString() {
//		return String.format("Point (%d,%d)", x,y);
//	}
	

}

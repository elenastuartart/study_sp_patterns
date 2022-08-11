package com.stuart.Visitor;


import com.stuart.Visitor.graph.Circle;
import com.stuart.Visitor.graph.Point;

public interface ExportVisitor {
	void exportPoint(Point p);
	void exportCircle(Circle c);
	//посетитель взаимодействующий с типом жителя (бабушки или дети)

}

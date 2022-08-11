package com.stuart.Visitor;

import com.stuart.Visitor.graph.Circle;
import com.stuart.Visitor.graph.Point;

// ������ Visitor'� ����� ������� ���������,
// �� � ������� ������ ���������� ��� ������ �������� 
// ��� ������� ���������� �����
public class JSONExportVisitor implements ExportVisitor{

	@Override
	public void exportPoint(Point p) {
		System.out.printf("{ x: %d, y: %d, color: \"%s\" }", 
				p.getX(), p.getY(), p.getColor());
	}

	@Override
	public void exportCircle(Circle c) {
		System.out.printf("{ cx: %d, cy: %d, radius: %d, color: \"%s\" }", 
				c.getX(), c.getY(), c.getR(), c.getColor());
	}
//���������� ���������� (��������), ��������� � �������� (������� � ����)
}

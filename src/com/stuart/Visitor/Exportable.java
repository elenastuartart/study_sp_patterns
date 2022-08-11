package com.stuart.Visitor;

public interface Exportable {
	void accept(ExportVisitor v);
} //функционал любого жителя - уметь принять посетителя

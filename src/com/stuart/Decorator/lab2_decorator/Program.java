package com.stuart.Decorator.lab2_decorator;


public class Program {

	public static void main(String[] args) {

//		Scene scene = new Scene(4);
//
//		GraphObjectComponent pointL = new CompressSizeDecorator(new Point(new Coords(1,1)), 23);
//		GraphObjectComponent circleL = new CompressSizeDecorator(new Circle(new Coords(2,3), 5), 44);
//
//		scene.graphObjects.add(pointL);
//		scene.graphObjects.add(circleL);

//		CompressSizeDecorator point = new CompressSizeDecorator(new Point(new Coords(1,1)), 24);
////		point.compressSize(5);
//		point.getFinalSize(5);

		CompressSizeDecorator circle = new CompressSizeDecorator(new Circle(new Coords(2,4), 3), 12);
		circle.getFinalSize(4);

	}

}

package com.stuart.Flyweight;


public class Program {

	static void showMemoryUsage() {
		Runtime rt = Runtime.getRuntime();
	    long usedMB = (rt.totalMemory() - rt.freeMemory()) / 1024 / 1024;
	    System.out.printf("memory usage: %dMB\n" ,usedMB);
		
	}
	
	static void createNature(AnimalFactory factory) {
		for(int i=0; i < 10000; i++) {
			factory.createButterfly();
			factory.createLadybug();
			factory.createSnail();
		}
			
	}
	
	public static void main(String[] args) {
		
		System.gc();
		System.out.print("Without Flyweight ");
		createNature(new AnimalFactory());
		showMemoryUsage();
		
		System.gc();
		System.out.print("With Flyweight ");
		createNature(new AnimalContextFactory());
		showMemoryUsage();
	}

}

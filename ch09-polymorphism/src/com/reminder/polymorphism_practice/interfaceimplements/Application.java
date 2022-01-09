package com.reminder.polymorphism_practice.interfaceimplements;

public class Application {

	public static void main(String[] args) {
		ShapeManager shapeManager = new ShapeManager();
		/* Part 1. Interface */
		shapeManager.calcShape();
		/* Part 2. Down-casting */
		shapeManager.calcShapeArray();

	}

}

package com.reminder.polymorphism_practice.interfaceimplements;

public class ShapeManager {
	
	public void calcShape() {
		IShape[] iShape = {new Rectangle(34.5, 42.7), new Circle(15.5)};
//		Rectangle rect = new Rectangle();
//		Circle circ = new Circle();
		
		for(IShape s : iShape) {
			if(s instanceof Rectangle) {
				System.out.println("Rectangle 면적 : " + s.area());
				System.out.println("Rectangle 둘레 : " + s.perimeter());
			} else if(s instanceof Circle) {
				System.out.println("Circle 면적 : " + s.area());
				System.out.println("Circle 둘레 : " + s.perimeter());
			}
		}
	}
	
	public void calcShapeArray() {
		IShape[] iarr = new IShape[5];
		iarr[0] = new Circle(12.3);
		iarr[1] = new Rectangle(32.6, 45.6);
		iarr[2] = new Rectangle(18.4, 30.9);
		iarr[3] = new Triangle(30.2, 21.3);
		iarr[4] = new Triangle(89.6, 35.9);
		
		for(IShape p : iarr) {
			if(p instanceof Rectangle) {
				System.out.println("Rectangle - 면적 : " + p.area() + ", 둘레 : " + p.perimeter());
			} else if(p instanceof Circle) {
				System.out.println("Circle - 면적 : " + p.area() + ", 둘레 : " + p.perimeter());
			} else if(p instanceof Triangle) {
				System.out.println("Triangle 면적 : " + p.area() + ", 둘레 : " + p.perimeter() + ", 빗변 : " + ((Triangle)p).hypotenuse());
			}
		}
	}

}

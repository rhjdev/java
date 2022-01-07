package com.reminder.polymorphism_practice;

public class ShapeManager {
public void calcShape() {
		
		/* Shape 객체 배열 */
		Shape[] shape = {new Rectangle(34.5, 42.7), new Circle(15.5)};
		
		/* 면적과 둘레 출력 */
		for(Shape s : shape) {
			if(s instanceof Rectangle) {
				System.out.println("Rectangle 면적 : " + s.area());
				System.out.println("Rectangle 둘레 : " + s.perimeter());
			} else if(s instanceof Circle) {				
				System.out.println("Circle 면적 : " + s.area());
				System.out.println("Circle 둘레 : " + s.perimeter());
			}
		}
	}

}

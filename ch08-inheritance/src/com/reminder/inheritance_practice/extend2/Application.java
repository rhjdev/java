package com.reminder.inheritance_practice.extend2;

public class Application {

	public static void main(String[] args) {
		
		/* 크기가 2인 Circle 배열 할당 */
		Circle[] circ = new Circle[2];
		/* 객체 데이터 초기화 */
		circ[0] = new Circle(1, 2, 3);
		circ[1] = new Circle(3, 3, 4);
		
		/* 크기가 2인 Rectangle 배열 할당 */
		Rectangle[] rect = new Rectangle[2];
		/* 객체 데이터 초기화 */
		rect[0] = new Rectangle(-1, -2, 5, 2);
		rect[1] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("===== circle =====");
		for(Circle circle : circ) {
			circle.draw();
		}
		
		System.out.println("===== rectangle =====");
		for(Rectangle rectangle : rect) {
			rectangle.draw();
		}
	}

}

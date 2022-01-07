package com.reminder.polymorphism_practice;

public class Circle extends Shape {
	
	public static double PI = Math.PI;
	private double radius; //반지름
	
	/* 기본 생성자 */
	public Circle() {}
	/* 매개변수 있는 생성자 */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public static double getPI() {
		return PI;
	}
	public static void setPI(double pI) {
		PI = pI;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/* 추상메소드 오버라이딩 */
	/* 원의 면적과 둘레 계산 */
	@Override
	public double area() {
		return PI * radius * radius;
	}
	@Override
	public double perimeter() {
		return 2 * radius * PI;
	}

}

package com.reminder.polymorphism_practice;

public class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	/* 기본 생성자 */
	public Rectangle() {}
	/* 매개변수 있는 생성자 */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	/* 추상메소드 오버라이딩 */
	/* 사각형의 면적과 둘레 계산 */
	@Override
	public double area() {
		return width * height;
	}
	@Override
	public double perimeter() {
		return (width + height) * 2;
	}
}

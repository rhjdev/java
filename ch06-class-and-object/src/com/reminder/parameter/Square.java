package com.reminder.parameter;

public class Square {
	
	private double width;
	private double height;
	
	public Square(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	/* 설정자(setter) */
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	/* 접근자(getter) */
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	
	public void clacArea() {
		double area = width * height;
		System.out.println("사각형 넓이 : " + area);
	}
	public void clacRound() {
		double round = (width + height) * 2;
		System.out.println("사각형 둘레 : " + round);
	}
}

package com.reminder.polymorphism_practice.interfaceimplements;

public class Circle implements IShape {
	
	public static double PI = Math.PI;
	private double radius;
	
	public Circle() {}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	
	@Override
	public double area() {
		return PI * radius * radius;
	}
	@Override
	public double perimeter() {
		return 2 * radius * PI;
	}

}

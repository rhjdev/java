package com.reminder.polymorphism_practice.interfaceimplements;

public class Triangle implements IShape {
	
	private double base;
	private double height;
	
	public Triangle() {}
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}

	@Override
	public double area() {
		return (base * height) / 2;
	}

	@Override
	public double perimeter() {
		return base + height + hypotenuse();
	}
	
	public double hypotenuse() {
		return Math.sqrt(base * base + height + height);
	}

}

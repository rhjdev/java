package com.reminder.polymorphism_practice.interfaceimplements;

public class Rectangle implements IShape {
	
	private double width;
	private double height;
	
	public Rectangle() {}
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	
	@Override
	public double area() {
		return width * height;
	}
	@Override
	public double perimeter() {
		return (width + height) * 2;
	}

}

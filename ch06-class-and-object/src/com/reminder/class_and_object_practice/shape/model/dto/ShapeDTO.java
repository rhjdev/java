package com.reminder.class_and_object_practice.shape.model.dto;

public class ShapeDTO {
	
	private int type;
	private double height;
	private double width;
	private String color;
	
	public ShapeDTO(int type, double height, double width) { //String만 빠짐
		this.type = type;
		this.height = height;
		this.width = width;
		this.color = "white"; //color값 초기화
	}
	
	public void setType(int type) {
		this.type = type;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getType() {
		return type;
	}
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
	public String getColor() {
		return color;
	}

}

package com.reminder.class_and_object_practice.shape.manager;

import com.reminder.class_and_object_practice.shape.model.dto.ShapeDTO;

public class SquareManager {
	
	public void calcPerimeter(ShapeDTO shape) {
		double height = shape.getHeight();
		double width = shape.getWidth();
		double perimeter = (height + width) * 2;
		
		System.out.println("사각형의 둘레는 " + perimeter + "입니다.");
	}
	
	public void calcArea(ShapeDTO shape) {
		double height = shape.getHeight();
		double width = shape.getWidth();
		double area = height * width;
	}
	
	public void printShape(ShapeDTO shape) {
		System.out.println("선택하신 도형 타입 : 사각형");
		System.out.println("높이 : " + shape.getHeight());
		System.out.println("넓이 : " + shape.getWidth());
		System.out.println("색상 : " + shape.getColor());
	}
	
	public void paintColor(ShapeDTO shape, String color) {
		shape.setColor(color);
		System.out.println("선택하신 사각형의 색상을 " + color + "로 반영합니다.");
	}

}

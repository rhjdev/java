package com.reminder.parameter;

public class Application {

	public static void main(String[] args) {
		
		ParameterTest param = new ParameterTest();
		
		Square square = new Square(20.5, 20.5);
		System.out.println(square);
		param.testClassTypeParameter(square);

	}

}

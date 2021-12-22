package com.reminder.package_and_import;

import com.reminder.method.Calculator;

public class Import01 {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		int min = calc.minNumberOf(10, 20);
		System.out.println("10과 20 중 최소값 = " + min);
		
		int max = Calculator.maxNumberOf(10, 20);
		System.out.println("10과 20 중 최대값 = " + max);

	}

}

package com.reminder.package_and_import;

public class Package01 {

	public static void main(String[] args) {
		
		com.reminder.method.Calculator calc = new com.reminder.method.Calculator();
		/* non-static method */
		int min = calc.minNumberOf(0, 10);
		System.out.println("0과 10 중 최소값 = " + min);
		/* static method */
		int max = com.reminder.method.Calculator.maxNumberOf(0, 10);
		System.out.println("0과 10 중 최대값 = " + max);

	}

}

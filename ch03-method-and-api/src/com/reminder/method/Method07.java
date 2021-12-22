package com.reminder.method;

public class Method07 {

	public static void main(String[] args) {
		
		System.out.println("10과 20의 합 = " + Method07.sumNumbers(10, 20));
		System.out.println("10과 20의 합 = " + sumNumbers(10, 20));

	}
	
	public static int sumNumbers(int first, int second) {
		return first + second;
	}

}

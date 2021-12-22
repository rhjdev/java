package com.reminder.method;

public class Method08 {

	public static void main(String[] args) {
		
		int first = 180;
		int second = 200;
		
		/* A. non-static 메소드 호출 */
		Calculator calc = new Calculator();
		int min = calc.minNumberOf(first, second);
		System.out.println("두 수 중 최소값 = " + min);
		
		/* B. static 메소드 호출 */
		int max = Calculator.maxNumberOf(first, second);
		System.out.println("두 수 중 최대값 = " + max);
		
		/* static 메소드를 non-static 메소드처럼 호출한 예
		 * 권장되지 않는다.
		 */
		int max2 = calc.maxNumberOf(first, second);
		System.out.println("두 수 중 최대값 = " + max);

	}

}

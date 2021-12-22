package com.reminder.method;

public class Method06 {

	public static void main(String[] args) {
		
		Method06 mthd = new Method06();
		
		int i = 100;
		int j = 200;
		
		/* 덧셈 - 변수 이용*/
		System.out.println(mthd.plusNumbers(i, j));
		/* 뺄셈 - 변수 이용 */
		System.out.println(mthd.minusNumbers(i, j));
		/* 곱셈 - 출력문에서 별도 값 선언 */
		System.out.println(mthd.multipleNumbers(2, 3));
		/* 나눗셈 - 출력문에서 별도 값 선언 */
		System.out.println(mthd.divideNumbers(10, 2));

	}
	
	public int plusNumbers(int first, int second) {
		return first + second;
	}
	
	public int minusNumbers(int first, int second) {
		return first - second;
	}
	
	public int multipleNumbers(int first, int second) {
		return first * second;
	}
	
	public int divideNumbers(int first, int second) {
		return first / second;
	}

}

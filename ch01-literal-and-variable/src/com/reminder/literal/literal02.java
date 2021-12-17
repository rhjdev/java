package com.reminder.literal;

public class literal02 {

	public static void main(String[] args) {
		
		/* 리터럴 연산 */
		/* 숫자A. 정수와 정수의 연산 */
		System.out.println("============ 숫자A. 정수와 정수의 연산 ============");
		System.out.println(123 + 45);
		System.out.println(123 - 23);
		System.out.println(123 * 10);
		System.out.println(123 / 10);
		System.out.println(123 % 10);
		System.out.println();
		
		/* 숫자B. 실수와 실수의 연산 */
		System.out.println("============ 숫자B. 실수와 실수의 연산 ============");
		System.out.println(1.23 + 1.23);
		System.out.println(1.23 - 0.23);
		System.out.println(1.23 * 10.0);
		System.out.println(1.23 / 10.0);
		System.out.println(1.23 % 1.0);
		System.out.println();
		
		/* 숫자C. 정수와 실수의 연산 */
		System.out.println("============ 숫자C. 정수와 실수의 연산 ============");
		System.out.println(123 + 0.5);
		System.out.println(123 - 0.5);
		System.out.println(123 * 0.5);
		System.out.println(123 / 0.5);
		System.out.println(123 % 0.5);
		System.out.println();
		
		/* 문자A. 문자와 문자의 연산 */
		System.out.println("============ 문자A. 문자와 문자의 연산 ============");
		System.out.println('a' + 'b');
		System.out.println('a' - 'b');
		System.out.println('a' * 'b');
		System.out.println('a' / 'b');
		System.out.println('a' % 'b');
		System.out.println();
		
		/* 문자B. 문자와 정수의 연산 */
		System.out.println("============ 문자B. 문자와 정수의 연산 ============");
		System.out.println('a' + 1);
		System.out.println('a' - 1);
		System.out.println('a' * 2);
		System.out.println('a' / 2);
		System.out.println('a' % 2);
		System.out.println();
		
		/* 문자C. 문자와 실수의 연산 */
		System.out.println("============ 문자C. 문자와 실수의 연산 ============");
		System.out.println('a' + 1.0);
		System.out.println('a' - 1.0);
		System.out.println('a' * 2.0);
		System.out.println('a' / 2.0);
		System.out.println('a' % 2.0);
		System.out.println();
		
		/* 문자열A. 문자열과 문자열의 연산 */
		System.out.println("============ 문자열A. 문자열과 문자열의 연산 ============");
		System.out.println("abc" + "xyz");
//		System.out.println("abc" - "xyz");
//		System.out.println("abc" * "xyz");
//		System.out.println("abc" / "xyz");
//		System.out.println("abc" % "xyz");
		System.out.println();
		
		/* 문자열B. 문자열과 다른 형태의 값 연산 */
		System.out.println("============ 문자열B. 문자열과 다른 형태의 값 연산 ============");
		System.out.println("abc" + 123);
		System.out.println("abc" + 123.45);
		System.out.println("abc" + 'd');
		System.out.println("abc" + true);
		System.out.println(true + "abc");
		System.out.println("123" + "456");
		System.out.println();
		
		/* 문자열C. 문자열 순서에 따른 연산 */
		System.out.println("============ 문자열C. 문자열 순서에 따른 연산 ============");
		System.out.println("50 + 60 = " + 50 + 60);
		System.out.println("50 + 60 = " + (50 + 60));
//		System.out.println("50 - 60 = " + 50 - 60);
		System.out.println("50 - 60 = " + (50 - 60));
		System.out.println("50 * 60 = " + 50 * 60);
		System.out.println("50 * 60 = " + (50 * 60));
		

	}

}

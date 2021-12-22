package com.reminder.method;

public class Method03 {

	public static void main(String[] args) {
		
		/* 전달인자와 매개변수 */
		/* A. 전달인자를 통한 값 전달 */
		Method03 mthd = new Method03();
		mthd.testMethod(2000);
//		mthd.testMethod("2000");
//		mthd.testMethod(2000, 2001, 2002);
//		mthd.testMethod();
		
		/* B. 변수에 저장한 값 전달 */
		int year = 1999;
		mthd.testMethod(year);
		long longYear = 1998L;
		mthd.testMethod((int)longYear);
		
		/* C. 연산 결과를 이용한 값 전달 */
		mthd.testMethod(year / 2 * 2);

	}
	
	public void testMethod(int year) {
//		int year = 1995;
		System.out.println("당신의 출생 연도는 " + year + "년입니다.");
		
	}

}

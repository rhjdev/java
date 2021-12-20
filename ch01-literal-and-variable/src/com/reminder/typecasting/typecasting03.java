package com.reminder.typecasting;

public class typecasting03 {

	public static void main(String[] args) {
		
		/* 다른 자료형간 연산은
		 * 1. 큰 자료형으로 자동 형변환 진행 후
		 * 2. 연산 처리된다.
		 */
		
		int num1 = 10;
		long num2 = 20;
		
		/* 방법1. 연산 결과를 int형으로 강제 형변환하고, int형 변수 통해 반환한다. */
		int sum1 = (int)(num1 + num2);
		
		/* 방법2. long형 값을 int형으로 강제 형변환한다. */
		int sum2 = num1 + (int)num2;
		
		/* 방법3. 결과 값을 long형으로 반환한다.
		 * 자동 형변환에 해당한다.
		 * */
		long sum3 = num1 + num2;
		
		/* 주의사항! int형 미만의 연산 처리 결과는 int로 반환된다. */
		byte bnum1 = 10;
		byte bnum2 = 20;
		short snum1 = 30;
		short snum2 = 40;
		
//		byte result1 = bnum1 + bnum2;
		int result1 = bnum1 + bnum2;
//		short result2 = snum1 + snum2;
		int result2 = snum1 + snum2;

	}

}

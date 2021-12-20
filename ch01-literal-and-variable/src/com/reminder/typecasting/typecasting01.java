package com.reminder.typecasting;

public class typecasting01 {

	public static void main(String[] args) {
		
		/* 1. 정수끼리의 자동 형변환 */
		/* 작은 자료형에서 더 큰 자료형으로 옮겨가는 경우 데이터 손실이 없어 자동 형변환 처리된다. */
		byte bnum = 10;
		short snum = bnum;
		int inum = snum;
		long lnum = inum;
		System.out.println("lnum = " + lnum);
		/* 더 큰 자료형에 맞춰 연산된다. */
		int num1 = 50;
		long num2 = 60L;
//		int sum = num1 + num2;  	// long형에 맞춰 연산됐기 때문에 int형에 담을 수 없다.
		long sum = num1 + num2;
		System.out.println("num1 + num2 = " + sum);
		
		/* 2. 실수끼리의 자동 형변환 */
		float fnum = 4.0f;
		double dnum = fnum;
		System.out.println("dnum = " + dnum);
		/* 정수와 실수간 연산은 실수로 반환된다. */
		long num3 = 4L;
		float num4 = num3;
		float result = num3 + num4;
		System.out.println("num4 = " + num4);
		System.out.println("result = " + result);
		
		/* 3. 문자형의 자동 형변환 */
		/* 문자형은 int형으로 자동 형변환된다. */
		char ch1 = 'A';
		int charNumber = ch1;
		System.out.println("'A'의 유니코드 = " + charNumber);
		
		char ch2 = 97;
		System.out.println("97 to char = " + ch2);
		
		/* 4. 논리형은 형변환 할 수 없다. */
		boolean power = true;
//		byte b = power;
//		short s = power;
//		int i = power;
//		long l = power;
//		float f = power;
//		double d = power;

	}

}

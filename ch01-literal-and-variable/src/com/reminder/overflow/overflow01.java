package com.reminder.overflow;

public class overflow01 {

	public static void main(String[] args) {
		
		/* 오버플로우
		 * 자료형이 가진 값의 최대 범위를 벗어나면 sign bit를 반전시켜 최소값을 만든다.
		 * */
		
		byte num1 = 127;
		System.out.println("byte의 최대 저장 범위 = " + num1);
		
		num1++;
		System.out.println("byte의 최대 저장 범위 + 1 = " + num1);
		
		/* 언더플로우
		 * 최소 범위보다 작은 값을 발생시켰을 때 나타난다. 오버플로우의 반대를 말한다.
		 * */
		
		byte num2 = -128;
		System.out.println("byte의 최소 저장 범위 = " + num2);
		
		num2--;
		System.out.println("byte의 최소 저장 범위 - 1 = " + num2);
		
		/* 논리적 에러 */
		/* 오버플로우, 언더플로우 발생 시 별도의 컴파일 에러나 런타임 에러가 발생하지 않아
		 * 미리 예측하고 더 큰 자료형에 결과값을 받아 처리해야 한다.
		 */
		int num3 = 100_000_000;
		int num4 = 30_000_000;
		
		int intMulti = num3 * num4;
		System.out.println("intMulti = " + intMulti);  		// 논리적 에러의 예. -296517632
				
//		long longMulti = (long)(num3 * num4);  			// int 값끼리 먼저 연산이 일어나므로 값은 여전히 -296517632
		long longMulti = (long)num3 * num4;  			// 정상 출력된 예. 3000000000000000
		System.out.println("longMulti = " + longMulti);

	}

}

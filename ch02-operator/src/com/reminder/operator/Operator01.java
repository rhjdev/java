package com.reminder.operator;

public class Operator01 {

	public static void main(String[] args) {
		
		/* 1. 산술 연산자 */
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 + num2 = " + (num1 + num2));
		int intDiv = num1 / num2;
		System.out.println("num1 / num2 = " + intDiv);
		double doubleDiv = (double)num1 / num2;
		System.out.println("num1 / num2 = " + doubleDiv);
		
		/* 2. 대입 연산자와 산술 복합 대입 연산자 */
		int num3 = 12;
		System.out.println("num3 = " + num3);
		
		num3 += 1;
		System.out.println("num3 = " + num3);
		num3 -= 2;
		System.out.println("num3 = " + num3);
		num3 *= 3;
		System.out.println("num3 = " + num3);
		num3 /= 4;
		System.out.println("num3 = " + num3);
		/* 아래는 대입이 된 예이다.
		 * 산술 복합 대입 연산자 순서에 주의하여야 한다. */
		num3 =- 5;
		System.out.println("num3 = " + num3);
		
		/* 3. 증감 연산자 */
		int num4 = 10;
		
		num4++;
		System.out.println("num4 = " + num4);
		++num4;
		System.out.println("num4 = " + num4);
		num4--;
		System.out.println("num4 = " + num4);
		--num4;
		System.out.println("num4 = " + num4);
		
		/* 다른 연산자와 함께 쓰일 때는 전위, 후위 연산 구분하여 사용하여야 한다. */
		int firstNum = 15;
		int result1 = firstNum++ * 2;
		System.out.println("result1 = " + result1);
		System.out.println("firstNum = " + firstNum);
		
		int secondNum = 30;
		int result2 = ++secondNum * 2;
		System.out.println("result2 = " + result2);
		System.out.println("secondNum = " + secondNum);

	}

}

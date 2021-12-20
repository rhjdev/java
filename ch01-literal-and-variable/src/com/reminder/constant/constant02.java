package com.reminder.constant;

public class constant02 {

	public static void main(String[] args) {
		
		/* 상수 명명 시 특징 */
		/* 1. 영문 대문자 또는 숫자를 사용한다. */
		final int YEAR1 = 2021;
		final int YEAR2 = 2022;
		final int year3 = 2023;  	// 컴파일 에러 대상은 아니다. 변수와의 구분을 위해 대문자 사용된다.
		
		/* 2. 단어 사이 연결은 언더스코어(_)를 사용한다. */
		final int MAX_WIDTH = 2000;
		final int MIN_WIDTH = 1300;
		final int minWidth = 1300; 	// camel case 사용 가능하나, 변수와의 구분을 위해 언더스코어 사용된다.

	}

}

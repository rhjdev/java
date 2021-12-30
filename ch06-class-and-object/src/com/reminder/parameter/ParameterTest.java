package com.reminder.parameter;

public class ParameterTest {

	public void testClassTypeParameter(Square square) {
		System.out.println("매개변수로 전달 받은 값 : " + square);
		
		System.out.println("변경 전 정사각형 넓이와 둘레 ===========");
		square.clacArea();
		square.clacRound();
		
		/* 설정자(setter)로 값 변경 */
		square.setWidth(200);
		square.setHeight(200);
		
		System.out.println("변경 후 정사각형 넓이와 둘레 ===========");
		square.clacArea();
		square.clacRound();
	}

}

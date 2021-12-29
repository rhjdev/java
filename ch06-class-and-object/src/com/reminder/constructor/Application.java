package com.reminder.constructor;

public class Application {

	public static void main(String[] args) {
		
		/* 기본 생성자 호출 */
		Reunion reunionA = new Reunion();
		reunionA.printInformation();
		
		/* 매개변수 있는 생성자 호출 */
		Reunion reunionB = new Reunion(1999, "김자바", true);
		reunionB.printInformation();
		
		Reunion reunionC = new Reunion(1999, "김코딩", true, new java.util.Date());
		reunionC.printInformation();
		
		/* 복사 생성자 호출 */
		Reunion reunionD = new Reunion(reunionC);
		reunionD.printInformation();

	}

}

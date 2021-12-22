package com.reminder.method;

public class Method05 {

	public static void main(String[] args) {
		
		Method05 mthd = new Method05();
//		mthd.testMethod();
		
		/* A. 변수에 담아 출력 */
		String returnText = mthd.testMethod();
		System.out.println(returnText);
		
		/* B. 바로 출력 */
		System.out.println(mthd.testMethod());

	}
	
	public String testMethod() {
		return "Hello, hello!";
	}

}

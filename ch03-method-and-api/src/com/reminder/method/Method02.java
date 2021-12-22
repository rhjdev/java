package com.reminder.method;

public class Method02 {

	public static void main(String[] args) {
		
		/* main메소드에서 순서 제어하기 */
		System.out.println("main() 시작...");
		
		Method02 mthd = new Method02();
		mthd.methodA();
		mthd.methodB();
		mthd.methodC();
		
		System.out.println("main() 종료...");

	}
	
	public void methodA() {
		System.out.println("methodA() 시작...");
		System.out.println("methodA() 종료...");
	}
	
	public void methodB() {
		System.out.println("methodB() 시작...");
		System.out.println("methodB() 종료...");
	}
	
	public void methodC() {
		System.out.println("methodC() 시작...");
		System.out.println("methodC() 종료...");
	}

}

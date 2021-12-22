package com.reminder.method;

public class Method01 {

	public static void main(String[] args) {
		
		System.out.println("main() 시작...");
		
		Method01 mthd = new Method01();
		mthd.methodA();
		
		System.out.println("main() 종료...");

	}
	
	public void methodA( ) {
		System.out.println("methodA() 시작...");
		
		methodB();
		
		System.out.println("methodA() 종료...");
	}
	
	public void methodB() {
		System.out.println("methodB() 시작...");
		System.out.println("methodB() 종료...");
		
	}

}

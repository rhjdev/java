package com.reminder.method;

public class Method04 {

	public static void main(String[] args) {
		
		Method04 mthd = new Method04();
		mthd.testMethod("경제학", 1, 'A');
		
		String name = "철학";
		int year = 3;
		final char grade = 'B';
		mthd.testMethod(name, year, grade);

	}
	
	public void testMethod(String name, int year, final char grade) {
		System.out.println("당신의 학과는 " + name + "과이고, 학년은 " + year + "학년이며, 학점은 " + grade + "입니다.");
	}

}

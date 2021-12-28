package com.reminder.array;

public class ArrayCopy01 {

	public static void main(String[] args) {
		
		String[] students = {"김학생", "이학생", "박학생"};
		System.out.println("students hashCode : " + students.hashCode());
		
		print(students);

	}
	
	public static void print(String[] sarr) {
		
		System.out.println("sarr의 hashCode : " + sarr.hashCode());
		for(int i=0; i < sarr.length; i++) {
			System.out.print(sarr[i] + " ");
		}
		System.out.println();
	}

}

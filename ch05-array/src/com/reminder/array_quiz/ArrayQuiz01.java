package com.reminder.array_quiz;

public class ArrayQuiz01 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		for(int i=0; i < arr.length; i++) {
			arr[i] = 10 + i;
			System.out.println(arr[i]);
		}

	}

}

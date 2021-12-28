package com.reminder.array_quiz;

import java.util.Arrays;

public class ArrayQuiz03 {

	public static void main(String[] args) {
		
		String[] arr = {"red", "orange", "yellow", "green", "blue"};
		String[] arrCopy = new String[arr.length];
		
		/* A. for문 */
		for(int i=0; i < arr.length; i++) {
			arrCopy[i] = arr[i];
		}
		
		/* B. .clone() */
		arrCopy = arr.clone();
		
		/* C. System.arraycopy() */
		System.arraycopy(arr, 0, arrCopy, 0, arr.length);
		
		/* D. Arrays.copyOf() */
		Arrays.copyOf(arr, arr.length);
		
		for(int i=0; i < arr.length; i++) {
			System.out.println(arrCopy[i]);
		}

	}

}

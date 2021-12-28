package com.reminder.array_quiz;

public class ArrayQuiz02 {

	public static void main(String[] args) {
		
		int[][] arr = new int[8][9];
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				arr[i][j] = (i + 2) * (j + 1);
				System.out.println((i + 2) + " * " + (j + 1) + " = " + arr[i][j]);
			}
		}

	}

}

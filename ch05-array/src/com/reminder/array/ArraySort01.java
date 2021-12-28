package com.reminder.array;

public class ArraySort01 {

	public static void main(String[] args) {
		
		int[] arr = {2, 1, 3};

		int tmp;
		tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;

		for(int num : arr) {
			System.out.print(num + " ");
		}

	}

}

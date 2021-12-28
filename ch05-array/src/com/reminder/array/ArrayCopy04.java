package com.reminder.array;

public class ArrayCopy04 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[] {1, 2, 3, 4, 5};
		int[] arr2 = new int[] {1, 2, 3, 4, 5};
		
		/* for문 */
		for(int i=0; i < arr1.length; i++) {
			arr1[i] += 10;
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		/* 향상된 for문 */
		for(int i : arr2) {
			i += 10;
		}
		for(int i : arr2) {
			System.out.print(i + " ");
		}

	}

}

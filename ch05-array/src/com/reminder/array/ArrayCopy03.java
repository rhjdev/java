package com.reminder.array;

import java.util.Arrays;

public class ArrayCopy03 {

	public static void main(String[] args) {
		
		int[] originArr = new int[] {10, 20, 30, 40, 50};
		print(originArr);
		
		/* A. for문 */
		int[] copyArrA = new int[10];
		for(int i=0; i < originArr.length; i++) {
			copyArrA[i] = originArr[i];
		}
		print(copyArrA);
		
		/* B. .clone() */
		int[] copyArrB = originArr.clone();
		print(copyArrB);
		
		/* C. System.arraycopy() */
		int[] copyArrC = new int[10];
		System.arraycopy(originArr, 0, copyArrC, 3, originArr.length);
		print(copyArrC);
		
		/* D. Arrays.copyOf() */
		int[] copyArrD = Arrays.copyOf(originArr, 3);
		print(copyArrD);

	}
	
	public static void print(int[] iarr) {
		System.out.println("iarr hashCode : " + iarr.hashCode());
		
		for(int i=0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
		System.out.println();
	}

}

package com.reminder.array_practice;

public class ArrayEx02 {
	
	public static void main(String[] args) {
		
		/* 여섯 자리 당첨번호 출력 */
		int[] iarr = new int[6];

		for(int i=0; i < iarr.length; i++) {
			int random = (int)(Math.random() * 45) +1;
			iarr[i] = random;

			for(int j=0; i < j; j++) {
				if(iarr[i] == iarr[j]) {
					i--;
				}
			}
		}
		for(int i=0; i < iarr.length; i++) {
			for(int j=0; j < iarr.length; j++) {
				if(iarr[i] < iarr[j]) {
					int tmp;
					tmp = iarr[i];
					iarr[i] = iarr[j];
					iarr[j] = tmp;
				}
			}
		}

		for(int i=0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
		
	}

}

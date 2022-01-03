package com.reminder.array_practice;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		/* 배열 중간까지는 1부터 1씩 증가한 오름차순, 이후로 내림차순 적용하기 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("홀수인 양의 정수를 입력하세요. > ");
		int num = scanner.nextInt();
		
		int[] iarr = new int[num];
		
		if(!(num > 0 && num % 2 != 0)) {
			System.out.println("양수이자 홀수인 값을 입력하세요.");
		} else {
			for(int i=0; i < iarr.length; i++) {
				if(i > iarr.length / 2) {
					iarr[i] = iarr.length - i;
				} else {
					iarr[i] = i + 1;
				}
				System.out.print(iarr[i]);
			}
		}
	}
}

package com.reminder.array;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] scores = new int[5];
		for(int i=0; i < scores.length; i++) {
			System.out.print((i + 1) +"번째 학생의 점수를 입력하세요 : ");
			scores[i] = scanner.nextInt();
		}
		
		double sum = 0.0;
		double avg = 0.0;
		
		for(int i=0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		avg = sum / scores.length;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

	}

}

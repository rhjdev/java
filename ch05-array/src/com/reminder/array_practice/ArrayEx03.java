package com.reminder.array_practice;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {

		/* 숫자야구 게임 */
		/* 랜덤 숫자 배정(중복 체크 포함) */
		int[] number = new int[4];
		for(int i=0; i < number.length; i++) {
			int random = (int)(Math.random() * 10);
			number[i] = random;
			for(int j=0; j < i; j++) {
				if(number[i] == number[j]) {
					i--;
				}
			}
		}
		/* 정답 확인 */
		for(int i=0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		
		/* 변수와 반복문 활용 */
		int countS=0;
		int countB=0;
		int times=10;
		
		int[] user = new int[4];
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("도전 기회가 " + times + "회 남았습니다.");
			
			System.out.print("4자리 숫자를 입력하세요. > ");
			String input = scanner.nextLine();
			
			if(input.length() != 4) {
				System.out.println("4자리 정수를 입력해야 합니다.");
			} else {
				times--;
				
				for(int i=0; i < number.length; i++) {
					user[i] = (int)(input.charAt(i) - '0');
					if(number[i] == user[i]) {
						countS++;
					}
				}
				for(int i=0; i < number.length; i++) {
					for(int j=0; j < number.length; j++) {
						if(number[i] != user[i] && number[i] == user[j]) {
							countB++;
						}
					}
				}
			}
			if(countS == 4) {
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.println("아쉽네요. " + countS + "S " + countB + "B 입니다.");
			}
		
			if(times == 0) {
				System.out.println("10번의 기회를 모두 소진하셨습니다. Game Over!");
				break;
			}
			
		}

	}

}

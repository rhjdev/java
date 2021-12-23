package com.reminder.conditional;

import java.util.Scanner;

public class IfElseStatement {
	
	
	public void oddOrEven() {
	/* 홀짝 확인 */
	Scanner scanner = new Scanner(System.in);
	System.out.print("정수를 하나 입력하세요. > ");
	int num = scanner.nextInt();
	
	if(num % 2 != 0) {
		System.out.println("입력하신 정수는 홀수입니다.");
	} else {
		System.out.println("입력하신 정수는 짝수입니다.");
	}
	System.out.println("프로그램을 종료합니다.");
	}

}
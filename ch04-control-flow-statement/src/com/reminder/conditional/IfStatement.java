package com.reminder.conditional;

import java.util.Scanner;

public class IfStatement {

	public void evenChecker() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 하나를 입력하세요. > ");
		int num = scanner.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
			}
			
			System.out.println("프로그램을 종료합니다.");
			
		}
		
	}

}

package com.reminder.abstraction;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		CarRacer racer = new CarRacer();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("======= 카레이싱 프로그램 =======");
			System.out.println("1. 시동 On");
			System.out.println("2. 전진");
			System.out.println("3. 정지");
			System.out.println("4. 시동 Off");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 > ");
			int num = scanner.nextInt();
			
			switch(num) {
			case 1: racer.startUp(); break;
			case 2: racer.stepAccelator(); break;
			case 3: racer.stepBreak(); break;
			case 4: racer.turnOff(); break;
			case 0: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못된 번호를 입력하셨습니다.");
			}
		}
	}

}

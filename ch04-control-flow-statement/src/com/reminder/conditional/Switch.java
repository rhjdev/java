package com.reminder.conditional;

import java.util.Scanner;

public class Switch {
	
	public void calculator() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 > ");
		int first = scanner.nextInt();
		System.out.print("두 번째 정수 입력 > ");
		int second = scanner.nextInt();
		System.out.print("연산기호 입력 > ");
		char sign = scanner.next().charAt(0);
		int result = 0;
		
		switch(sign) {
		
		case '+' :
			result = first + second;	
			break;
		case '-' :
			result = first - second;
			break;
		case '*' :
			result = first * second;
			break;
		case '/' :
			result = first / second;
			break;
		case '%' :
			result = first % second;
			break;
			/* default문 생략 */
		}
		
		System.out.println(first + " " + sign + " " + second + " = " + result);
		
	}
	
	public void vendingMachine() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("======== vending machine ========");
		System.out.println("콜라   사이다   환타   핫식스   박카스");
		System.out.println("=================================");
		System.out.print("음료를 선택하세요 > ");
		
		String drink = scanner.nextLine();
		
		int price = 0;
		
		switch(drink) {
		case "콜라" :
			price = 500;
			break;
		case "사이다" :
			price = 700;
			break;
		case "환타" :
			price = 1000;
			break;
		case "핫식스" :
			price = 1500;
			break;
		case "박카스" :
			price = 1800;
			break;	
			
		}
		
		System.out.println("선택하신 음료 " + drink + "는 " + price + "원입니다.");
	}

}

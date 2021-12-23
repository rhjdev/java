package com.reminder.conditional;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		/* 차종에 따른 1일간 렌트비 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("차종을 선택하세요 > ");
		String vehicleType = scanner.nextLine();
		
		int result = 0;
		
		switch(vehicleType) {
		case "소형" :
			result = 40000;
			break;
		case "중형" :
			result = 55000;
			break;
		case "대형" :
			result = 80000;
			break;
		case "SUV" :
			result = 100000;
			break;
		case "승합" :
			result = 120000;
			/* default문 생략 */
		}
		
		System.out.println("선택하신 차종은 " + vehicleType + "입니다.");
		System.out.println("1일 렌트비는 " + result + "원입니다.");

	}

}

package com.reminder.loop;

import java.util.Scanner;

public class WhileStatement {
	
	public void printOneTwoTen() {
		int i=1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
	}
	
	public void printStringIndex() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. > ");
		String str = scanner.nextLine();
		
		System.out.println("========= for문 ============");
		for(int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
		}
		
		System.out.println("========= while문 ==========");
		int i=0;
		while(i < str.length()) {
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
			i++;
		}
	}
	
	public void sumOneToRandom() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 1개 입력하세요. > ");
		int random = scanner.nextInt();
		
		int sum=0;
		int i=1; 		// 1부터
		while(i <= random) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 " + random + "까지의 합은 " + sum + "입니다.");
	}
	
	public void printGugudan() {
		
		int dan=2;
//		int num=1;
		while(dan <= 9) {
			System.out.println("====== " + dan + "단 ======");
			int num=1;
			while(num <= 9) {
				System.out.println(dan + " * " + num + " = " + (dan * num));
				num++;
			}
			dan++;
			System.out.println();
		}
	}
	
	public void falseTest() {
		do {
			System.out.println("false;면 한 번 실행 후 종료...");
		} while(false);
	}
	
	public void exitTest() {
		
		Scanner scanner = new Scanner(System.in);
		String str = "";
		do {
			System.out.print("문자열을 입력하세요. > ");
			str = scanner.nextLine();
			System.out.println("입력하신 문자는 " + str + "입니다.");
		} while(!(str.equals("exit")));
		System.out.println("Exit! 프로그램이 종료되었습니다.");
	}

}
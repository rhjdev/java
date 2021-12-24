package com.reminder.loop;

import java.util.Scanner;

public class ForStatement {
	
	public void sumOneToTen() {
		
		int sum = 0;
		for(int i=1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("1부터 10까지의 합 = " + sum);
	}
	
	public void sumRandom() {
		int random = (int)(Math.random() * 6) + 5;
		System.out.println("random number = " + random);
		
		int sum = 0;
		for(int i=1; i <= random; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + random + "까지의 합계는 " + sum + "입니다.");
	}
	
	public void sumRandomTwo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요 > ");
		int first = scanner.nextInt();
		System.out.print("두 번째 정수를 입력하세요 > ");
		int second = scanner.nextInt();
		
		int sum = 0;
		int min = 0;
		int max = 0;
		
		if(first > second) {
			max = first;
			min = second;
		} else {
			max = second;
			min = first;
		}
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		
		System.out.println(first + "에서 " + second + "까지의 합은 " + sum + "입니다.");
	}
	
	public void printGugudan() {
		for(int dan=2; dan <= 9; dan++) {
			System.out.println("======= " + dan + "단 ======");
			for(int num=1; num <= 9; num++) {
				System.out.println(dan + " * " + num + " = " + (dan * num));
			}
			System.out.println();
		}
	}
	
	public void printGugudanTimes() {
		for(int dan=2; dan <= 9; dan++) {
			System.out.println("======= " + dan + "단 ======");
			printGugudanTable(dan);
		}
	}
	
	public void printGugudanTable(int dan) {
		for(int num=1; num <= 9; num++) {
			System.out.println(dan + " * " + num + " = " + (dan * num));
		}
		System.out.println();
	}
	
	public void printStars(int times) {
		for(int i=1; i <= times; i++) {
			System.out.print("*");
		}
	}
	
	public void printTriangle() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("출력할 행의 길이 > ");
		int num = scanner.nextInt();
		
		for(int i=1; i <= num; i++) {
			printStars(i);
			System.out.println();
		}
	}
}
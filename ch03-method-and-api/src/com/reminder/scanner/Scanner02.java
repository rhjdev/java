package com.reminder.scanner;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("문장을 입력하세요. > ");
		String str1 = scanner.next();
		System.out.println("입력하신 문장은 " + str1 + "입니다.");
		
		System.out.println("숫자를 입력하세요. > ");
		int num = scanner.nextInt();
		System.out.println("입력하신 숫자는 " + num + "입니다.");
		
		scanner.nextLine(); // 버퍼 비우는 용도
		
		System.out.print("문장을 입력하세요. > ");
		String str2 = scanner.nextLine();
		System.out.println("입력하신 문장은 " + str2 + "입니다.");

	}

}

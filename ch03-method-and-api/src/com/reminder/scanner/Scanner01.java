package com.reminder.scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("별자리를 입력하세요. > ");
		String sign = scanner.nextLine();
		System.out.println("당신의 별자리는 " + sign + "자리입니다.");
		
		System.out.print("출생연도를 입력하세요. > ");
		int year = scanner.nextInt();
		System.out.println("당신의 출생연도는 " + year + "년입니다.");
		
		System.out.print("희망 연봉을 입력하세요. > ");
		long salary = scanner.nextLong();
		System.out.println("당신의 희망 연봉은 " + salary + "입니다.");
		
		System.out.print("평균 시력을 입력하세요. > ");
		float sight = scanner.nextFloat();
		System.out.println("당신의 평균 시력은 " + sight + "입니다.");
		
		System.out.print("최고 점수를 입력하세요. > ");
		double score = scanner.nextDouble();
		System.out.println("당신의 최고 점수는 " + score + "입니다.");
		
		System.out.print("아침 드셨나요? true or false? > ");
		boolean breakfast = scanner.nextBoolean();
		System.out.println("당신의 아침 식사 여부는 " + breakfast + "입니다.");
		
		scanner.nextLine();
		System.out.print("가장 좋아하는 영단어를 작성하세요. > ");
		char ch = scanner.nextLine().charAt(3);
		System.out.println("가장 좋아하는 영단어의 3번째 문자는 " + ch + "입니다.");

	}

}

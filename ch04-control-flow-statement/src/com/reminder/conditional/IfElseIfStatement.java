package com.reminder.conditional;

import java.util.Scanner;

public class IfElseIfStatement {
	
	public void woodMan() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("산신령이 나타나 물었다. 어느 도끼가 네 도끼냐?");
		System.out.print("1. 금도끼, 2. 은도끼, 3. 쇠도끼? > ");
		int ax = scanner.nextInt();
		
		if(1 <= ax && ax <= 3) {
			if(ax == 1) {
				System.out.println("거짓말! 너에게는 아무 도끼도 줄 수 없다!");
			} else if(ax == 2) {
				System.out.println("거짓말을 하고 있구나. 썩 돌아가거라!");
			} else {
				System.out.println("정직하구나. 너에게 세 가지 도끼를 모두 주마.");
			}
		
			System.out.println("산신령은 다시 연못 속으로 사라졌다...");
		}

	}
	
	public void grader() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생 이름을 입력하세요. > ");
		String name = scanner.nextLine();
		System.out.print("점수를 입력하세요. > ");
		int score = scanner.nextInt();
		
		String grade = "";
		
		if(score >= 90) {
			grade = "A";
		} else if(score >= 80) {
			grade = "B";
		} else if(score >= 70) {
			grade = "C";		
		} else if(score >= 60) {
			grade = "D";	
		} else {
			grade = "F";
		}	
		
		if(score % 10 >= 5 && 60 <= score || score == 100) {
			grade += "+";
		}
		
		System.out.println(name + "학생의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");
	}
	
}

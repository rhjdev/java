package com.reminder.object_array_practice.student.run;

import java.util.Scanner;

import com.reminder.object_array_practice.student.model.dto.StudentDTO;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		StudentDTO[] student = new StudentDTO[10];
		int index=0;
		
		while(true) {
			System.out.print("학년 : ");
			int grade = scanner.nextInt();
			System.out.print("반 : ");
			int classroom = scanner.nextInt();
			System.out.print("이름 : ");
			scanner.nextLine(); //
			String name = scanner.nextLine();
			System.out.print("국어 : ");
			int kor = scanner.nextInt();
			System.out.print("영어 : ");
			int eng = scanner.nextInt();
			System.out.print("수학 : ");
			int math = scanner.nextInt();
			
			student[index++] = new StudentDTO(grade, classroom, name, kor, eng, math);
			
			System.out.print("계속 추가하시겠습니까? (y/n) : ");
			String yesOrNo = scanner.next();
			if(!(yesOrNo.equalsIgnoreCase("y"))) {
				break;
			}
		}
		
		for(int i=0; i < index; i++) {
			int sum = student[i].getKor() + student[i].getEng() + student[i].getMath();
			System.out.println(student[i].getInformation() + ", 평균=" + sum/3);
		}

	}

}

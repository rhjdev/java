package com.reminder.inheritance_practice.extend;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		/* A. Student */
		/* 객체배열 할당 */
		Student[] student = new Student[3];
		/* 객체 생성 */
		student[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		student[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		student[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과");
		
		for(Student students : student) {
			System.out.println(students.getInformation());
		}
		
		/* B. Employee */
		Employee[] employee = new Employee[10];
		
		Scanner scanner = new Scanner(System.in);
		int count=0;
		
		while(true) {
			System.out.print("이름 : ");
			String name = scanner.nextLine();
			System.out.print("나이 : ");
			int age = scanner.nextInt();
			System.out.print("키 : ");
			double height = scanner.nextDouble();
			System.out.print("몸무게 : ");
			double weight = scanner.nextDouble();
			System.out.print("급여 : ");
			int salary = scanner.nextInt();
			System.out.print("부서 : ");
			scanner.nextLine();
			String dept = scanner.nextLine();
			System.out.print("계속 입력하시겠습니까? (y/n) : ");
			String answer = scanner.nextLine();
			
			employee[count++] = new Employee(name, age, height, weight, salary, dept);
			
			if(!(answer.equalsIgnoreCase("y"))) {
				break;
			}
		}
		
		for(int i=0; i < count; i++) {
			System.out.println(employee[i].getInformation());
		}
	}

}

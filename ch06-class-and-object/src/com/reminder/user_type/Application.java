package com.reminder.user_type;

public class Application {

	public static void main(String[] args) {
		
		Member member= new Member();
		
		member.id = "user001";
		member.pw = "pass001";
		member.name = "김자바";
		member.age = 20;
		member.gender = 'F';
		member.hobby = new String[] {"축구", "바둑", "클라이밍"};
		
		System.out.println("member.id = " + member.id);
		System.out.println("member.pw = " + member.pw);
		System.out.println("member.name = " + member.name);
		System.out.println("member.age = " + member.age);
		System.out.println("member.gender = " + member.gender);
//		System.out.println("member.hobby = " + member.hobby);
		System.out.print("member.hobby = ");
		for(int i=0; i < member.hobby.length; i++) {
			System.out.print(member.hobby[i] + " ");
		}

	}

}

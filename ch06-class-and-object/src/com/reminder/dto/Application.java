package com.reminder.dto;

public class Application {

	public static void main(String[] args) {
		
		MemberDTO memberA = new MemberDTO();
		memberA.setNumber(1);
		memberA.setName("김자바");
		memberA.setAge(20);
		memberA.setGender('F');
		memberA.setHeight(187.5);
		memberA.setWeight(70.5);
		memberA.setActivated(true);
		
		System.out.println("회원 번호 : " + memberA.getNumber());
		System.out.println("이름 : " + memberA.getName());
		System.out.println("나이 : " + memberA.getAge());
		System.out.println("성별 : " + memberA.getGender());
		System.out.println("신장 : " + memberA.getHeight());
		System.out.println("체중 : " + memberA.getWeight());
		System.out.println("회원 활성화 여부 : " + memberA.isActivated());

	}

}

package com.reminder.constructor;

public class Reunion {
	
	private int classOf;
	private String name;
	private boolean isOnMembershipList;
	private java.util.Date responseDate;
	
	/* 기본 생성자 */
	public Reunion() {
		
	}
	
	/* 일부 매개변수가 있는 생성자 */
	public Reunion(int classOf, String name, boolean isOnMembershipList) {
		this.classOf = classOf;
		this.name = name;
		this.isOnMembershipList = isOnMembershipList;
	}
	
	/* 모든 매개변수가 있는 생성자 */
	public Reunion(int classOf, String name, boolean isOnMembershipList, java.util.Date responseDate) {
		this(classOf, name, isOnMembershipList);
		this.responseDate = responseDate;
	}
	
	/* 복사 생성자 */
	public Reunion(Reunion otherReunion) {
		this(otherReunion.classOf, otherReunion.name, otherReunion.isOnMembershipList, otherReunion.responseDate);
	}
	
	public void printInformation() {
		System.out.println("졸업 연도 : " + this.classOf);
		System.out.println("이름 : " + this.name);
		System.out.println("멤버십 가입 여부 : " + this.isOnMembershipList);
		System.out.println("회신일 : " + this.responseDate);
	}
}

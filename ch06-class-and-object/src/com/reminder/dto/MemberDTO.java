package com.reminder.dto;

public class MemberDTO {
	
	private int number;
	private String name;
	private int age;
	private char gender;
	private double height;
	private double weight;
	private boolean isActivated;
	
	/* 설정자(setter) 메소드 */
	public void setNumber(int number) {
		this.number = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}
	
	/* 접근자(getter) 메소드 */
	public int getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public boolean isActivated() {
		return isActivated;
	}

}

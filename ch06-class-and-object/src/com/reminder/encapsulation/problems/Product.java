package com.reminder.encapsulation.problems;

public class Product {
	
//	String name;
	String fruit;
	String origin;
	int price;
	
	/**
	 * <pre>
	 * 과일 이름에 해당하는 필드값을 반환하는 메소드
	 * </pre>
	 * @param name 과일 이름 입력
	 * */
	
	public void setName(String name) {
		/* 수정 전 */
//		this.name = name;
		/* 수정 후 */
		this.fruit = name;
	}
	
	/**
	 * <pre>
	 * 과일 원산지에 해당하는 필드값을 반환하는 메소드
	 * </pre> 
	 * @param origin 과일 원산지 입력
	 * */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	/**
	 * <pre>
	 * 신선도 유지 위해 1만원 미만 과일 대상으로 할인을 결정함에 따라 값을 절반가로 변경하는 메소드
	 * </pre>
	 * @param price 과일 가격 입력
	 * */
	public void setPrice(int price) {
		if(price >= 10000) {
			this.price = price;
		} else {
			this.price = price / 2;
		}
	}
	
	public String getInfo() {
	
		return "선택하신 과일은 " + this.origin + "산 " + this.fruit + "이고, 가격은 " + this.price + "원입니다.";
	}

}

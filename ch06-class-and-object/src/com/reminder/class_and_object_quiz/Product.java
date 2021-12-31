package com.reminder.class_and_object_quiz;

public class Product {
	
	/* 필드 */
	private String productName;
	private int productNum;
	private int price;
	private char size;
	
	/* 생성자 */
	public Product() {
		
	}
	
	public Product(String productName, int productNum, int price, char size) {
		this.productName = productName;
		this.productNum = productNum;
		this.price = price;
		this.size = size;
	}
	
	/* 설정자와 접근자 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setSize(char size) {
		this.size = size;
	}
	
	public String getProductName() {
		return productName;
	}
	public int getProductNum() {
		return productNum;
	}
	public int getPrice() {
		return price;
	}
	public char getSize() {
		return size;
	}
	
	/* 출력 메소드 */
	public void printInformation() {
		System.out.println("제품명 : " + productName);
		System.out.println("제품번호 : " + productNum);
		System.out.println("가격 : " + price);
		System.out.println("사이즈 : " + size);
	}
	
}

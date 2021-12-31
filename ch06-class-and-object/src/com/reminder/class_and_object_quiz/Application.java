package com.reminder.class_and_object_quiz;

public class Application {

	public static void main(String[] args) {
		
		/* Destination */
		/* 초기화A. 매개변수 있는 생성자 */
		System.out.println("=== Destination A ===");
		Destination desA = new Destination("Seoul", 140.5, 2, new String[] {"car", "taxi", "subway", "train", "bus"});
		desA.printInformation();
		
		/* 초기화B. 기본 생성자 + 설정자 */
		System.out.println("=== Destination B ===");
		Destination desB = new Destination();
		desB.setDesName("Hawaii");
		desB.setDistance(7617.5);
		desB.setSpendTime(8);
		desB.setTrans(new String[] {"plane", "tram"});
		desB.printInformation();
		
		/* Product */
		/* 초기화A. 매개변수 있는 생성자 */
		System.out.println("===== Product A =====");
		Product prodA = new Product("Sweatshirts", 99, 25000, 'M');
		prodA.printInformation();
		
		/* 초기화B. 기본생성자 + 설정자 */
		System.out.println("===== Product B =====");
		Product prodB = new Product();
		prodB.setProductName("Sweatpants");
		prodB.setProductNum(100);
		prodB.setPrice(30000);
		prodB.setSize('M');
		prodB.printInformation();

	}

}

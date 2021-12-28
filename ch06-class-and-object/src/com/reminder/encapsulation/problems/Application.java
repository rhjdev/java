package com.reminder.encapsulation.problems;

public class Application {

	public static void main(String[] args) {
		
		Product prod1 = new Product();
		prod1.setName("샤인머스캣");
		prod1.setOrigin("국내");
		prod1.setPrice(15000);
		
		Product prod2 = new Product();
		prod2.setName("골드키위");
		prod2.setOrigin("뉴질랜드");
		prod2.setPrice(12000);
		
		Product prod3 = new Product();
		prod3.setName("블루베리");
		prod3.setOrigin("칠레");
		prod3.setPrice(10000);
		
		Product prod4 = new Product();
		prod4.setName("레몬");
		prod4.setOrigin("미국");
		prod4.setPrice(8000);
		
		System.out.println(prod1.getInfo());
		System.out.println(prod2.getInfo());
		System.out.println(prod3.getInfo());
		System.out.println(prod4.getInfo());

	}

}

package com.reminder.array;

public class Array02 {

	public static void main(String[] args) {
		
		String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
		String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};
		
		int randomShapesIndex = (int)(Math.random() * shapes.length);
		int randomNumbersIndex = (int)(Math.random() * numbers.length);
		
		System.out.println("당신이 뽑은 카드는 " + shapes[randomShapesIndex] + " " + numbers[randomNumbersIndex] + "입니다.");

	}

}

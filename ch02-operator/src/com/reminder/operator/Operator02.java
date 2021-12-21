package com.reminder.operator;

public class Operator02 {

	public static void main(String[] args) {
		
		/* 비교 연산자 */
		/* 1. 정수값, 실수값, 문자값 비교 */
		char ch = 'a';
		int inum = 97;
		double dnum = 98.0;
		System.out.println("ch가 inum과 같은지 = " + (ch == inum));
		System.out.println("ch가 inum과 다른지 = " + (ch != inum));
		System.out.println("inum이 dnum보다 크거나 같은지 = " + (inum >= dnum));
		System.out.println("inum이 dnum보다 작거나 같은지 = " + (inum <= dnum));
		
		
		/* 2. 논리값 비교 */
		boolean usb = true;
		boolean hdmi = false;
		System.out.println("usb와 hdmi 상태가 같은지 = " + (usb == hdmi));
		System.out.println("usb와 hdmi 상태가 다른지 = " + (usb != hdmi));
		
		/* 3. 문자열값 비교 */
		String greeting1 = "Hello";
		String greeting2 = "Hi";
		System.out.println("greeting1과 greeting2가 같은지 = " + (greeting1 == greeting2));
		System.out.println("greeting1과 greeting2가 다른지 = " + (greeting1 != greeting2));
		

	}

}

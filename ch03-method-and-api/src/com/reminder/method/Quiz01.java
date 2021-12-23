package com.reminder.method;

public class Quiz01 {

	public static void main(String[] args) {
		
		/* 0 ~ 19 범위의 난수 */
		System.out.println((int)(Math.random() * 20));
		/* 1 ~ 5 범위의 난수 */
		System.out.println((int)(Math.random() * 5) + 1);
		/* 3 ~ 12 범위의 난수 */
		System.out.println((int)(Math.random() * (12 - 3 + 1) + 3));
		/* 8 ~ 23 범위의 난수 */
		System.out.println((int)(Math.random() * (23 - 8 + 1) + 8));

	}

}

package com.reminder.api;

public class Math01 {

	public static void main(String[] args) {
		
		/* 절대값 출력 */
		System.out.println(java.lang.Math.abs(-7));
		System.out.println(Math.abs(-10.25));
		
		/* 최대값과 최소값 */
		System.out.println(Math.max(10, 20));
		System.out.println(Math.min(10, 20));
		
		/* 원주율 */
		System.out.println(Math.PI);
		
		/* 난수 */
		System.out.println(Math.random());
		/* 0 ~ 9 사이 난수 */
		System.out.println((int)(Math.random() * 10));
		/* 1 ~ 10 사이 난수 */
		System.out.println((int)(Math.random() * 10) + 1);
		/* 10 ~ 15 사이 난수 */
		System.out.println((int)(Math.random() * 6) + 10);
		/* byte 범위 난수 */
		System.out.println((int)(Math.random() * 256) - 128);

	}

}

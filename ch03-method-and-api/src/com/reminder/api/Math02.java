package com.reminder.api;

import java.util.Random;

public class Math02 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		/* 0 ~ 9까지의 난수 */
		int ranNumber1 = random.nextInt(10) + 0;
		System.out.println("0부터 9까지의 난수 = " + ranNumber1);
		/* 1 ~ 10까지의 난수 */
		int ranNumber2 = random.nextInt(10) + 1;
		System.out.println("1부터 10까지의 난수 = " + ranNumber2);
		/* 20 ~ 45까지의 난수 */
		int ranNumber3 = random.nextInt(45 - 20 + 1) + 20;
		System.out.println("20부터 45까지의 난수 = " + ranNumber3);
		/* byte 범위 난수 */
		int ranNumber4 = random.nextInt(256) - 128;
		System.out.println("byte 범위의 난수 = " + ranNumber4);
		int ranNumber5 = new Random().nextInt(256) - 128;
		System.out.println("byte 범위의 난수 = " + ranNumber5);

	}

}

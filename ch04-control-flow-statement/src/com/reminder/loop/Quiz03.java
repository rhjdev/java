package com.reminder.loop;

public class Quiz03 {

	public static void main(String[] args) {
		
		/* while, do~while문 */
		System.out.println("==== while문 ====");
		int hour=1;
		while(hour <= 12) {
			System.out.println(hour + "시");
			hour++;
		}
		System.out.println("==== do~while문 ====");
		int time=1;
		do {
			System.out.println(time + "시");
			time++;
		} while(time <= 12);

	}

}

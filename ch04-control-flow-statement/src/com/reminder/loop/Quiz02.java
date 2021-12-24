package com.reminder.loop;

public class Quiz02 {

	public static void main(String[] args) {
		
		/* 중첩 for문 */
		for(int hour=0; hour <= 23; hour++) {
			for(int minute=0; minute <= 59; minute++) {
				System.out.println(hour + "시 " + minute + "분");
			}
		}

	}

}

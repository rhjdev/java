package com.reminder.loop;

public class Quiz01 {

	public static void main(String[] args) {
		
		/* for문 사용 */
		System.out.println("==== 1시부터 12시 ====");
		for(int i=1; i <= 12; i++) {
			System.out.println(i + "시");
		}
		
		System.out.println("==== 20 이하 짝수 A. ====");
		for(int i=2; i <= 20; i += 2) {
			System.out.println(i);
		}
		
		System.out.println("==== 20 이하 짝수 B. ====");
		for(int i=2; i <= 20; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}

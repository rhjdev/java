package com.reminder.branching;

public class Quiz01 {

	public static void main(String[] args) {
		
		int num=1;
		while(true) {
			num++;
			if(!(num % 3 == 0)) {
				continue;
			}
			System.out.println(num + "출력");
			if(num == 30) {
				break;
			}
		}

	}

}

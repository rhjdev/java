package com.reminder.branching;

public class BreakStatement {
	
	public void sumOneToAHundred() {
		int sum=0;
		int i=1;
		while(true) {
			sum += i;
			if(i == 100) {
				break;
			}
			i++;
		}
		System.out.println("1부터 100까지의 합은 " + sum + "입니다.");
	}
	
	public void jumpBreak() {
		label:
		for(;;) {
			for(int i=0; i < 10; i++) {
				System.out.println(i);
				if(i == 3) {
					break label;
				}
			}
		}
	}

}
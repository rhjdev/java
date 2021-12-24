package com.reminder.branching;

public class Continue {
	
	public void printFromOneToAhundred() {
		
		for(int i=1; i <= 100; i++) {
		
			if(!(i % 4 == 0 && i % 5 == 0)) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	public void printGugudan() {
		for(int dan=2; dan <= 9; dan++) {
			for(int num=1; num <= 9; num++) {
				if(num % 2 == 0) {
					continue;
				}
				
				System.out.println(dan + " * " + num + " = " + (dan * num));
			}
		}
	}
	
	public void printLabel() {
		label:
		for(int dan=2; dan <= 9; dan++) {
			for(int num=1; num <= 9; num++) {
				if(num % 2 == 0) {
					continue label;
				}

				System.out.println(dan + " * " + num + " = " + (dan * num));
			}

		}
	}
}

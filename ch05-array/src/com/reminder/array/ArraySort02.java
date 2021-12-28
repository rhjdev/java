package com.reminder.array;

import java.util.Arrays;

public class ArraySort02 {

	public static void main(String[] args) {
		
		char[] carr = {'d', 'e', 'a', 'f', 'b', 'c', 'g'};
		
		for(int i=1; i < carr.length; i++) {
			for(int j=0; j < i; j++) {
				if(carr[i] < carr[j]) {
					char tmp;
					
					tmp = carr[i];
					carr[i] = carr[j];
					carr[j] = tmp;
				}
			}
		}
		
		for(int i=0; i < carr.length; i++) {
			System.out.print(carr[i] + " ");
		}
		System.out.println();
		
		/* Arrays.sort() */
		char[] copy = carr.clone();
		Arrays.sort(copy);
		System.out.println("carr copy : " + Arrays.toString(copy));

	}

}

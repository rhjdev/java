package com.reminder.array;

public class ArrayCopy02 {

	public static void main(String[] args) {
		
		String[] fourSeasons = getSeasons();
		System.out.println();
		
		System.out.println("리턴 받은 fourSeasons의 hashCode : " + fourSeasons.hashCode());
		
	}
	
	public static String[] getSeasons() {
		
		String[] seasons = new String[] {"봄", "여름", "가을", "겨울"};
		System.out.println("seasons hasshCode : " + seasons.hashCode());
		for(int i=0; i < seasons.length; i++) {
			System.out.print(seasons[i] + " ");
		}
		
		return seasons;
	}

}

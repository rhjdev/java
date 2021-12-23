package com.reminder.conditional;

public class Quiz01 {

	public static void main(String[] args) {
		
		/* 9세 이상이면서 110cm 이상인 사람만 놀이기구를 탑승 */
		int age = 9;
		double height = 110;
		
		if(age >= 9 && height >= 110) {
			System.out.println("놀이기구 탑승 가능!");
		} else {
			System.out.println("다음 기회에...");
		}
		
		/* 두 과목의 평균이 60점이면 합격
		 * 한 과목이라도 40점 미만이면 불합격
		 * */
		
		int englishScore = 30;
		int mathScore = 90;
		int sum = englishScore + mathScore;
		double average = sum / 2.0;
		
		if(average < 60) {
			System.out.println("불합격");
		} else if(englishScore < 40 || mathScore < 40) {
			System.out.println("한 과목 과락으로 인한 불합격");
		} else {
			System.out.println("합격");
		}
		
		/* 1차 작성 코드 */
//		if(average >= 60) {
//			if(englishScore >= 40 || mathScore >= 40) {
//				System.out.println("합격");
//			} else {
//				System.out.println("불합격");
//			}
//		}
		
		/* 답안 */
//		if(average < 60) {
//			System.out.println("불합격");
//		} else if(englishScore < 40 || mathScore < 40) {
//			System.out.println("한 과목 과락으로 인한 불합격");
//		} else {
//			System.out.println("시험 합격");
//		}

	}

}

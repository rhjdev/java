package com.reminder.operator;

public class Operator03 {

	public static void main(String[] args) {
		
		/* 논리 연산자 */
		/* Dead code */
		System.out.println("true-true간 OR 연산 = " + (true || true));
		System.out.println("true-false간 OR 연산 = " + (true || false));
		System.out.println("false-true간 AND 연산 = " + (false && true));
		System.out.println("false-false간 AND 연산 = " + (false && false));
		
		/* 1. 값이 1~100 사이 숫자인지 */
		int inum = 108;
		System.out.println("값이 1~100 사이 숫자인지 = " + (1 <= inum && inum <= 100));
		
		/* 2. 영문자인지 */
		/* 2-1. 소문자 또는 대문자 */
		char ch1 = 'R';
		System.out.println("값이 영문자인지 = " + (('a' <= ch1 && ch1 <= 'z') || ('A' <= ch1 && ch1 <= 'Z')));
		/* 2-2. 소문자 */
		System.out.println("값이 소문자인지 = " + ('a' <= ch1 && ch1 <= 'z'));
		/* 2-3. 대문자 */
		System.out.println("값이 대문자인지 = " + ('A' <= ch1 && ch1 <= 'Z'));
		
		/* 삼항연산자 활용한 논리식 */
		char ch2 = 'y';
		String result = ('y' == ch2 || ch2 == 'Y') ? "YES" : "NO";
		System.out.println("YES OR NO = " + result);
		
		int score1 = 98;
		String pass1 = (score1 >= 80) ? "합격입니다." : ((1 <= score1 && score1 < 80) ? "불합격입니다." : "잘못 입력하셨습니다. 점수를 입력해 주세요.");
		System.out.println("합격 여부 = " + pass1);
		int score2 = 34;
		String pass2 = (score2 >= 80) ? "합격입니다." : ((1 <= score2 && score2 < 80) ? "불합격입니다." : "잘못 입력하셨습니다. 점수를 입력해 주세요.");
		System.out.println("합격 여부 = " + pass2);
		int score3 = 0;
		String pass3 = (score3 >= 80) ? "합격입니다." : ((1 <= score3 && score3 < 80) ? "불합격입니다." : "잘못 입력하셨습니다. 점수를 입력해 주세요.");
		System.out.println("합격 여부 = " + pass3);
		
	}

}

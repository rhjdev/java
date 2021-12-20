package com.reminder.variable;

public class variable03 {

	public static void main(String[] args) {
		
		/* 변수 명명 규칙 */
		/* 1. 컴파일 에러를 발생시키는 규칙 */
		/* 1-1. 같은 범위 안에서는 동일한 변수명을 가질 수 없다. */
		int year = 2021;
//		int year = 2021;
		
		/* 1-2. 예약어는 사용할 수 없다. */
//		int int = 1;
//		byte byte = 1;
		
		/* 1-3. 대소문자를 구분한다. */
		int num = 1;
		int Num = 2;
		
		/* 1-4. 숫자로 시작할 수 없다. */
//		int 1size = 5;
		int size1 = 5;
		
		/* 1-5. 특수기호는 '_'와 '$'만 사용 가능하다.
		 * 변수명의 시작, 중간, 끝 어디에도 쓰일 수 있다.
		 * */
//		int ye@ar = 2021;
		int year_ = 2021;
		int $harp = 20;
		
		/* 2. 컴파일 에러에는 해당되지 않지만 개발자간 암묵적 사용 규칙 */
		/* 2-1. 길이 제한은 없다. 하지만 적당한 길이를 고수하는 것이 좋다. */
		int abcdefghijklmnopqrsehkdsnddsjhasjsadsaeurrklejrjkhdsd;
		
		/* 2-2. 합성어의 경우 첫 단어는 소문자, 두 번째 단어는 그 시작을 대문자로 쓴다.
		 * 단어 사이 구분을 위해 사용하는 camel case이다.
		 * */
		int maxHeight = 200;
		int minHeight = 130;
		
		/* 2-3. 단어 사이를 연결할 때 언더스코어(_)를 쓰지 않는다.
		 * camel case를 사용한다.
		 * */
		String user_mail;
		String userMail;
		
		/* 2-4. 한글도 쓰일 수는 있으나 통용되기 어려운 환경을 고려하여 권장되지는 않는다. */
		int 자음;
		int 모음;
		
		/* 2-5. 값의 의미를 명확히 표현하도록 한다. */
		String s;
		String userName;
		
		/* 2-6. 전형적으로 사용하는 이름이 있다면 그것으로 쓴다. */
		int sum = 0;
		int max = 10;
		int min = 0;
		int count = 10;
		
		/* 2-7. 명사형으로 작성하도록 한다. */
		String eat;
		String menu;
		
		/* 2-8. boolean형은 가급적 긍정형으로 네이밍한다. */
		boolean isOn = true;
		boolean isOff = false;

	}

}

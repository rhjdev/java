package com.reminder.variable;

public class variable01 {

	public static void main(String[] args) {
		
		System.out.println("============ 변수를 사용해 값에 의미를 부여 ============");
		/* 변수를 적용하지 않은 예시 */
		System.out.println("온오프라인 총매출액 : " + (10_000_000 + 5_000_000) + "원");
		
		/* 변수를 사용하여 온라인 매출액과 오프라인 매출액을 구분한다. */
		int online = 10000000;
		int offline = 5000000;
		System.out.println("온오프라인 총매출액 : " + (online + offline) + "원");
		System.out.println();
		
		System.out.println("============ 변수에 저장한 값 재사용 ============");
		/* 변수를 적용하지 않은 예시 */
		System.out.println("A고객님, 2022년에도 새해 복 많이 받으세요!");
		System.out.println("B고객님, 2022년에도 새해 복 많이 받으세요!");
		System.out.println("C고객님, 2022년에도 새해 복 많이 받으세요!");
		System.out.println("D고객님, 2022년에도 새해 복 많이 받으세요!");
		System.out.println("E고객님, 2022년에도 새해 복 많이 받으세요!");
		System.out.println();
		/* 변수를 사용하여 반복되는 값을 대체하고 코드를 개선한다. */
		int year = 2022;
		System.out.println("A고객님, " + year + "년에도 새해 복 많이 받으세요!");
		System.out.println("B고객님, " + year + "년에도 새해 복 많이 받으세요!");
		System.out.println("C고객님, " + year + "년에도 새해 복 많이 받으세요!");
		System.out.println("D고객님, " + year + "년에도 새해 복 많이 받으세요!");
		System.out.println("E고객님, " + year + "년에도 새해 복 많이 받으세요!");
		System.out.println();
		
		System.out.println("============ 변수에 저장된 값 변경 ============");
		/* 같은 변수에 변경된 값을 저장하고 사용한다. */
		int meteor = 6;
		System.out.println("지난 1분 동안 " + meteor + "개의 유성우가 관측되었습니다.");
		meteor = meteor + 12;
		System.out.println("지난 10분 동안 " + meteor + "개의 유성우가 관측되었습니다.");
		

	}

}

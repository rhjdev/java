package com.reminder.constant;

public class constant01 {

	public static void main(String[] args) {
		
		/* 1. 상수 선언 */
		final double PI;
		
		/* 2. 상수 초기화 
		 * 한 번 초기화한 이후에는 변경이 불가하다.
		 * */
		PI = 3.141592;
//		PI = 3.14;
		
		/* 3. 상수 호출하여 사용 */
		/* 3-1. 출력 구문에서 사용하는 예 */
		System.out.println("PI의 값=" + PI);
		
		/* 3-2. 연산식에서 사용하는 예 */
		System.out.println("PI의 2배=" + (PI * 2));
		
		/* 3-3. 대입 연산에서 사용하는 예 */
		double dnum = PI;
		System.out.println("dnum=" + dnum);

	}

}

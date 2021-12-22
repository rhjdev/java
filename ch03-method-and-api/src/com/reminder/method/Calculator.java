package com.reminder.method;

public class Calculator {

	/** 
	 * <pre>
	 * 매개변수로 전달 받은 두 수를 비교하여 더 작은 값을 가진 정수를 반환
	 * 값이 같은 경우에 대해서는 처리하지 않는다
	 * </pre>
	 * @param first 최소값 비교를 위한 첫 번째 정수
	 * @param second 최소값 비교를 위한 두 번째 정수
	 * @return 두 수 중 작은 값을 정수형으로 반환
	 * */
	public int minNumberOf(int first, int second) {
		return first > second ? second : first;
	}
	
	/** 
	 * <pre>
	 * 매개변수로 전달 받은 두 수를 비교하여 더 큰 값을 가진 정수를 반환
	 * 값이 같은 경우에 대해서는 처리하지 않는다
	 * </pre>
	 * @param first 최대값 비교를 위한 첫 번째 정수
	 * @param second 최대값 비교를 위한 두 번째 정수
	 * @return 두 수 중 큰 값을 정수형으로 반환
	 * */
	public static int maxNumberOf(int first, int second) {
		return first > second ? first : second;
	}

}

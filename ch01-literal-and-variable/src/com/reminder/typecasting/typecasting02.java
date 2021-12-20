package com.reminder.typecasting;

public class typecasting02 {

	public static void main(String[] args) {
		
		/* 강제 형변환 */
		
		/* 1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환 */
		/* 1-1. 정수간 강제 형변환 */
		long lnum = 8L;
		int inum = (int)lnum;
		short snum = (short)inum;
		byte bnum = (byte)snum;
		
		/* 1-2. 실수간 강제 형변환 */
		double dnum = 8.0;
		float fnum = (float)dnum;
		
		/* 2. 실수에서 정수로 변경 시 강제 형변환 */
		float width1 = 234.56f;
		int width2 = (int)width1;
		
		/* 3. 문자형이 int보다 작은 크기의 자료형에 저장될 때 강제 형변환 */
		char ch = 'a';
		short num1 = (short)ch;
		byte num2 = (byte)ch;
		
		/* 4. 논리형은 강제 형변환도 할 수 없다. */
		
		/* 주의사항! 데이터 손실에 유의하여 사용하도록 한다. */
		/* A. 의도치 않은 데이터 손실 */
		int intNum = 400;
		byte byteNum = (byte)intNum;
		System.out.println("intNum = " + intNum);
		System.out.println("byteNum = " + byteNum);
		
		/* B. 의도한 데이터 손실 */
		double height1 = 78.9;
		int height2 = (int)height1;
		System.out.println("height1 = " + height1);
		System.out.println("height2 = " + height2);

	}

}

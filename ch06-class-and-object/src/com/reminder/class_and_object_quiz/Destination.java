package com.reminder.class_and_object_quiz;

public class Destination {
	
	/* 필드 */
	private String desName;
	private double distance;
	private int spendTime;
	private String[] trans;
	
	/* 생성자 */
	public Destination() {
		
	}
	
	public Destination(String desName, double distance, int spendTime, String[] trans) {
		this.desName = desName;
		this.distance = distance;
		this.spendTime = spendTime;
		this.trans = trans;
	}
	
	/* 설정자와 접근자 */
	public void setDesName(String desName) {
		this.desName = desName;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public void setSpendTime(int spendTime) {
		this.spendTime = spendTime;
	}
	public void setTrans(String[] trans) {
		this.trans = trans;
	}
	
	public String getDesName() {
		return desName;
	}
	public double getDistance() {
		return distance;
	}
	public int getSpendTime() {
		return spendTime;
	}
	public String[] getTrans() {
		return trans;
	}
	
	/* 출력 메소드 */
	public void printInformation() {
		System.out.println("목적지 : " + desName);
		System.out.println("거리 : " + distance + "km");
		System.out.println("소요시간 : " + spendTime + "hr");
		System.out.print("이동수단 : ");
		for(int i=0; i < trans.length; i++) {
			System.out.print(trans[i] + " ");
		}
		System.out.println();
	}

}

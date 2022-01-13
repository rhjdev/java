package com.reminder.collection_practice.exhibition.model.dto;
 
public class ExhibitDTO {
	
	private String title;
	private int category;
	private int takingPlaceIn;
	
	public ExhibitDTO() {}
	
	public ExhibitDTO(String title, int category, int takingPlaceIn) {
		super();
		this.title = title;
		this.category = category;
		this.takingPlaceIn = takingPlaceIn;
	}
 
	public String getTitle() {
		return title;
	}
 
	public void setTitle(String title) {
		this.title = title;
	}
 
	public int getCategory() {
		return category;
	}
 
	public void setCategory(int category) {
		this.category = category;
	}
 
	public int getTakingPlaceIn() {
		return takingPlaceIn;
	}
 
	public void setTakingPlaceIn(int takingPlaceIn) {
		this.takingPlaceIn = takingPlaceIn;
	}
 
	@Override
	public String toString() {
		String categoryName = "";
		if(category == 1) {
			categoryName = "전시";
		} else if(category == 2) {
			categoryName = "체험";
		} else if(category == 3) {
			categoryName = "박람회";
		}
		
		String place = "";
		if(takingPlaceIn == 1) {
			place = "서울";
		} else if(takingPlaceIn == 2) {
			place = "강원";
		} else if(takingPlaceIn == 3) {
			place = "부산";
		}
		return "분류 : " + categoryName + ", 전시회명 : " + title + ", 개최 지역 : " + place;
	}
 
}
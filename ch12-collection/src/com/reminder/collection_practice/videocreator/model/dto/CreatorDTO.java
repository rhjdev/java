package com.reminder.collection_practice.videocreator.model.dto;

import java.util.Arrays;

public class CreatorDTO {
	
	/* 제목, 화질, 길이, 자막 종류 */
	private String title;
	private int length;
	private int[] quality;
	private String[] sub;
	
	public CreatorDTO() {}

	public CreatorDTO(String title, int length, int[] quality, String[] sub) {
		super();
		this.title = title;
		this.length = length;
		this.quality = quality;
		this.sub = sub;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int[] getQuality() {
		return quality;
	}

	public void setQuality(int[] quality) {
		this.quality = quality;
	}

	public String[] getSub() {
		return sub;
	}

	public void setSub(String[] sub) {
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "CreatorDTO [title=" + title + ", length=" + length + ", quality=" + Arrays.toString(quality) + ", sub="
				+ Arrays.toString(sub) + "]";
	}

}

package com.reminder.collection_practice.videocreator.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.reminder.collection_practice.videocreator.model.dto.CreatorDTO;

public class CreatorController {
	
	/* 업로드 영상 리스트 저장 */
	private List<CreatorDTO> vidList = new ArrayList<>();
	
	/* 영상 추가 */
	public void addList(CreatorDTO vid) {
		vidList.add(vid);
	}
	
	/* 영상 목록 전체 조회 */
	public List<CreatorDTO> selectList() {
		return vidList;
	}
	
	/* 제목 검색 - String contains */
	public List<CreatorDTO> searchTitle(String title) {
		/* 검색 키워드가 포함된 영상들만 리턴 받기 위한 메소드 */
		List<CreatorDTO> searchList = new ArrayList<>();
		for(CreatorDTO vid : vidList) {
			if(vid.getTitle().contains(title)) {
				searchList.add(vid);
			}
		}
		return searchList;
	}
	
	/* 영상 수정 - title 기준으로 조회 */
	public int updateVid(String title, CreatorDTO updateVid) {
		CreatorDTO old = null;
		for(int i=0; i < vidList.size(); i++) {
			if(vidList.get(i).getTitle().equals(title)) {
				old = vidList.set(i, updateVid);
			}
		}
		return old != null ? 1 : 0;
	}
	
	/* 영상 삭제 */
	public int removeVid(String title) {
		CreatorDTO old = null;
		for(int i=0; i < vidList.size(); i++) {
			if(vidList.get(i).getTitle().equals(title)) {
				old = vidList.remove(i);
			}
		}
		return old != null ? 1 : 0;
	}

}
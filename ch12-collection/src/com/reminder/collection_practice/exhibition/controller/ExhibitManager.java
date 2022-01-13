package com.reminder.collection_practice.exhibition.controller;
 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
 
import com.reminder.collection_practice.exhibition.model.dto.ExhibitDTO;
 
public class ExhibitManager {
	
	private HashMap<Integer, ExhibitDTO> exhibitMap = new HashMap<>();
	
	public void insertExhibit(ExhibitDTO exh) {
		int lastNo = 0;
		
		Iterator<Integer> it = exhibitMap.keySet().iterator();
		while(it.hasNext()) {
			lastNo = it.next();
		}
		exhibitMap.put(lastNo + 1, exh);
	}
	
	public Map<Integer, ExhibitDTO> searchExhibit(String title) {
		Map<Integer, ExhibitDTO> searchMap = new HashMap<>();
		Iterator<Entry<Integer, ExhibitDTO>> it = exhibitMap.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Integer, ExhibitDTO> entry = it.next();
			if(entry.getValue().getTitle().contains(title)) {
				searchMap.put(entry.getKey(), entry.getValue());
			}
		}
		return searchMap;
	}
	
	public Map<Integer, ExhibitDTO> selectMap() {
		return exhibitMap;
	}
	
	public int deleteExhibit(int exhibitNo) {
		ExhibitDTO old = null;
		
		Iterator<Integer> it = exhibitMap.keySet().iterator();
		while(it.hasNext()) {
			if(it.next() == exhibitNo) {
				old = exhibitMap.remove(exhibitNo);
				break;
			}
		}
		return old != null ? 1 : 0;
	}
 
}
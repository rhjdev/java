package com.reminder.collection_practice.videocreator.model.comparator;

import java.util.Comparator;

import com.reminder.collection_practice.videocreator.model.dto.CreatorDTO;

public class AscLength implements Comparator<CreatorDTO> {

	@Override
	public int compare(CreatorDTO o1, CreatorDTO o2) {
		return o1.getLength() - o2.getLength();
	}

}

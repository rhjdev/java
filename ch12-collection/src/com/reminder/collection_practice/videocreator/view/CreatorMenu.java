package com.reminder.collection_practice.videocreator.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.reminder.collection_practice.videocreator.controller.CreatorController;
import com.reminder.collection_practice.videocreator.model.comparator.AscLength;
import com.reminder.collection_practice.videocreator.model.comparator.DescLength;
import com.reminder.collection_practice.videocreator.model.comparator.DescTitle;
import com.reminder.collection_practice.videocreator.model.dto.CreatorDTO;

public class CreatorMenu {
	
	private CreatorController creatorController = new CreatorController();
	Scanner scan = new Scanner(System.in);
	
	public void mainMenu() {
		
		
		mainMenu : 
		while(true) {
			System.out.println("============ 메뉴 ============");
			System.out.println("1. 영상 추가");
			System.out.println("2. 영상 목록 전체 조회");
			System.out.println("3. 정렬하여 조회"); //제목, 길이 오름차순 내림차순
			System.out.println("4. 제목 검색");
			System.out.println("5. 자막별 검색");
			System.out.println("6. 화질별 검색");
			System.out.println("7. 영상 정보 수정");
			System.out.println("8. 영상 삭제");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 선택 : ");
			int menu = scan.nextInt();
			scan.nextLine();
			
			switch(menu) {
			case 1 : addList(); break;
			case 2 : selectList(); break;
			case 3 : sortMenu(); break;
			case 4 : searchTitle(); break;
			case 5 : searchSub(); break;
			case 6 : searchQlty(); break;
			case 7 : updateVid(); break;
			case 8 : removeVid(); break;
			case 0 : System.out.println("프로그램을 종료합니다."); break mainMenu;
			default : System.out.println("잘못 선택하셨습니다. 번호를 다시 입력해 주세요."); break;
			}
		}
	}
	
	public void addList() {
		System.out.println("======== 영상 추가 ========");
		/* A. 제목 */
		System.out.print("제목 입력 : ");
		String title = scan.nextLine();
		
		/* B. 길이
		 * 초 단위로 입력 받고 x분 y초로 출력 */
		System.out.print("길이 입력(초) : ");
		int length = scan.nextInt();
		
		/* C. 화질
		 * 사용자가 화질 개수와 종류 선택
		 * 최대 4가지 화질 제공 */
		System.out.println("# 화질 구분(2160, 1080, 720, 480)");
		System.out.print("화질 개수 : ");
		int qltyCount = scan.nextInt();
		int[] quality = new int[qltyCount];
		for(int i=0; i < qltyCount; i++) {
			System.out.print((i + 1) + "번째 화질 입력 : ");
			quality[i] = scan.nextInt();
		}
		
		/* D. 자막
		 * 사용자가 자막 개수와 종류 선택
		 * 최대 4가지 자막 제공 */
		System.out.println("# 자막 구분(KOR, ENG, IDN, SPN)");
		System.out.print("자막 개수 : ");
		int subCount = scan.nextInt();
		String[] sub = new String[subCount];
		for(int i=0; i < subCount; i++) {			
			System.out.print((i+1) + "번째 자막 입력 : ");
			sub[i] = scan.next();
		}
		
		
		creatorController.addList(new CreatorDTO(title, length, quality, sub));
	}
	
	public void selectList() {
		System.out.println("======== 영상 목록 전체 조회 ========");
		List<CreatorDTO> vidList = creatorController.selectList();
		
		if(!vidList.isEmpty()) {
			for(CreatorDTO vid : vidList) {
				System.out.println(vid);
			}
		} else {
			System.out.println("목록이 존재하지 않습니다.");
		}
	}
	
	public void sortMenu() {
		System.out.println("======== 정렬 메뉴 ========");
		System.out.println("A. 제목 오름차순 정렬");
		System.out.println("B. 제목 내림차순 정렬");
		System.out.println("C. 길이 오름차순 정렬");
		System.out.println("D. 길이 내림차순 정렬");
		System.out.print("메뉴 선택 : ");
		char menu = scan.next().charAt(0);
		
		ascDesc(menu);
	}
	
	public void ascDesc(char menu) {
		System.out.println("======== 정렬하여 조회 ========");
		List<CreatorDTO> vidList = creatorController.selectList();
		/* 사본에 정렬 반영 */
		List<CreatorDTO> sortList = new ArrayList<>();
		sortList.addAll(vidList);
		
		if(menu == 'A') {
			/* 익명클래스 사용 */
			sortList.sort(new Comparator<CreatorDTO>() {
				@Override
				public int compare(CreatorDTO o1, CreatorDTO o2) {
					return o1.getTitle().compareTo(o2.getTitle());
				}	
			});
		} else if(menu == 'B') {
			/* Comparator 상속 클래스 사용 */
			sortList.sort(new DescTitle());
		} else if(menu == 'C') {
			sortList.sort(new AscLength());
		} else {
			sortList.sort(new DescLength());
		}
		
		for(int i=0; i < sortList.size(); i++) {
			System.out.println(sortList.get(i));
		}
	}
	
	public void searchTitle() {
		System.out.println("======== 제목 검색 ========");
		System.out.print("제목 입력 : ");
		String title = scan.nextLine();
		List<CreatorDTO> searchList = creatorController.searchTitle(title);
		
		if(!searchList.isEmpty()) {
			for(int i=0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		} else {
			System.out.println("검색 결과가 없습니다.");
		}
	}
	
	public void searchSub() {
		System.out.println("======== 자막 검색 ========");
		System.out.println("# 자막 구분(KOR, ENG, IDN, SPN)");
		System.out.print("자막 입력(택 1) : ");
		String sub = scan.nextLine();
		
		List<CreatorDTO> vidList = creatorController.selectList();

		for(CreatorDTO vid : vidList) {
			if(!vidList.isEmpty()) {
				if(Arrays.toString(vid.getSub()).contains(sub)) {
					System.out.println(vid);
				} else {
				System.out.println("검색 결과가 없습니다.");
				}
			}
		}
	}

	public void searchQlty() {
		System.out.println("======== 화질 검색 ========");
		System.out.println("# 화질 구분(2160, 1080, 720, 480)");
		System.out.print("화질 입력(택 1) : ");
		String quality = scan.nextLine();
		
		List<CreatorDTO> vidList = creatorController.selectList();

		for(CreatorDTO vid : vidList) {
			if(!vidList.isEmpty()) {
				if(Arrays.toString(vid.getQuality()).contains(quality)) {
					System.out.println(vid);
				} else {
				System.out.println("검색 결과가 없습니다.");
				}
			}
		}
	}
	public void updateVid() {
		System.out.println("======== 영상 정보 수정 ========");
		System.out.print("기존 영상 제목 검색 : ");
		String title = scan.nextLine();
		
		System.out.print("수정할 영상 제목 : ");
		String updateTitle = scan.nextLine();
		System.out.print("수정할 길이 입력(초) : ");
		int updateLength = scan.nextInt();
		System.out.println("# 화질 구분(2160, 1080, 720, 480)");
		System.out.print("수정할 화질 개수 : ");
		int qltyCount = scan.nextInt();
		int[] updateQuality = new int[qltyCount];
		for(int i=0; i < qltyCount; i++) {
			System.out.print((i + 1) + "번째 화질 입력 : ");
			updateQuality[i] = scan.nextInt();
		}
		System.out.println("# 자막 구분(KOR, ENG, IDN, SPN)");
		System.out.print("수정할 자막 개수 : ");
		int subCount = scan.nextInt();
		String[] updateSub = new String[subCount];
		for(int i=0; i < subCount; i++) {			
			System.out.print((i+1) + "번째 자막 입력 : ");
			updateSub[i] = scan.next();
		}
		
		CreatorDTO updateVid = new CreatorDTO(updateTitle, updateLength, updateQuality, updateSub);
		int result = creatorController.updateVid(title, updateVid);
	}
	public void removeVid() {
		System.out.println("======== 영상 삭제 ========");
		System.out.print("삭제할 영상 제목 : ");
		int result = creatorController.removeVid(scan.nextLine());
		
		if(result > 0) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 영상을 찾지 못했습니다.");
		}
	}

}
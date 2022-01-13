package com.reminder.collection_practice.exhibition.view;
 
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
 
import com.reminder.collection_practice.exhibition.controller.ExhibitManager;
import com.reminder.collection_practice.exhibition.model.dto.ExhibitDTO;
 
public class ExhibitMenu {
	
	Scanner scan = new Scanner(System.in);
	private ExhibitManager exhManager = new ExhibitManager(); 
	
	public ExhibitMenu() {}
	
	public void mainMenu() {
		
		mainMenu:
		while(true) {
			System.out.println("===== 이벤트 상품 관리 프로그램 =====");
			System.out.println("1. 새 이벤트 추가");
			System.out.println("2. 이벤트 조회");
			System.out.println("3. 전체 이벤트 조회");
			System.out.println("4. 이벤트 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = scan.nextInt();
			scan.nextLine();
			
			switch(menu) {
			case 1 : insertExhibit(); break;
			case 2 : searchExhibit(); break;
			case 3 : selectMap(); break;
			case 4 : deleteExhibit(); break;
			case 0 : System.out.println("프로그램을 종료합니다."); break mainMenu;
			}
		}
	}
	
	public void insertExhibit() {
		System.out.print("이벤트명 : ");
		String title = scan.nextLine();
		
		System.out.println("# 카테고리(1. 전시 | 2. 체험 | 3. 박람회)");
		System.out.print("카테고리 : ");
		int category = scan.nextInt();
		scan.nextLine();
		
		System.out.println("# 지역 구분(1. 서울 | 2. 강원 | 3. 부산)");
		System.out.print("개최 지역 : ");
		int takingPlaceIn = scan.nextInt();
		scan.nextLine();
		
		exhManager.insertExhibit(new ExhibitDTO(title, category, takingPlaceIn));
	}
	
	public void searchExhibit() {
		System.out.print("이벤트명 검색 : ");
		Map<Integer, ExhibitDTO> searchMap = exhManager.searchExhibit(scan.nextLine());
		
		if(searchMap.isEmpty()) {
			System.out.println("조회한 전시·체험·박람회 이벤트가 존재하지 않습니다.");
		} else {
			Iterator<Integer> it = searchMap.keySet().iterator();
			while(it.hasNext()) {
				int key = it.next();
				System.out.println("이벤트 No. : " + key + ", " + searchMap.get(key));
			}
		}
	}
	
	public void selectMap() {
		Map<Integer, ExhibitDTO> exhibitMap = exhManager.selectMap();
		
		if(exhibitMap.isEmpty()) {
			System.out.println("이벤트가 없습니다.");
		} else {
			Iterator<Integer> it = exhibitMap.keySet().iterator();
			while(it.hasNext()) {
				Integer key = it.next();
				System.out.println("이벤트 No. : " + key + ", " + exhibitMap.get(key));
			}
		}
	}
	
	public void deleteExhibit() {
		System.out.print("이벤트 No. : ");
		int result = exhManager.deleteExhibit(scan.nextInt());
		
		if(result > 0) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 이벤트가 존재하지 않습니다.");
		}
	}
 
}
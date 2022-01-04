package com.reminder.object_array_practice.product.manager;

import java.util.Scanner;

import com.reminder.object_array_practice.product.model.dto.ProductDTO;

public class ProductManager {
	
	private ProductDTO[] pro = null;
	public static int count;
	
	Scanner scanner = new Scanner(System.in);
	
	{
		pro = new ProductDTO[10];
	}
	
	public void mainMenu() {
		int menu=0;
		
		do {
			System.out.println("===== 제품 관리 메뉴 =====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			menu = scanner.nextInt();
			
			switch(menu) {
			case 1 : productInput(); break;
			case 2 : productPrint(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못된 번호를 입력하셨습니다. 메뉴를 다시 선택하세요."); break;
			}
			
		} while(menu != 9);
	}
	
	public void productInput() {
		System.out.print("제품 번호 : ");
		int pId = scanner.nextInt();
		System.out.print("제품명 : ");
		scanner.nextLine();
		String pName = scanner.nextLine();
		System.out.print("제품 가격 : ");
		int price = scanner.nextInt();
		System.out.print("제품 세금 : ");
		double tax = scanner.nextDouble();
		
		pro[count] = new ProductDTO(pId, pName, price, tax);
	}
	
	public void productPrint() {
		for(int i=0; i < count; i++) {
			System.out.println(pro[i].getInformation());
		}
	}
}

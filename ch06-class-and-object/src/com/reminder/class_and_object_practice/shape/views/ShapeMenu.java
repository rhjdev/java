package com.reminder.class_and_object_practice.shape.views;

import java.util.Scanner;

import com.reminder.class_and_object_practice.shape.manager.SquareManager;
import com.reminder.class_and_object_practice.shape.manager.TriangleManager;
import com.reminder.class_and_object_practice.shape.model.dto.ShapeDTO;

public class ShapeMenu {

	Scanner scanner = new Scanner(System.in);

	public void mainMenu() {

		double height=0;
		double width=0;
		int choice=0;

		while(true) {
			System.out.println("========== 도형 계산기 ==========");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.println("==============================");
			System.out.print("계산하려는 도형을 선택하세요. > ");
			choice = scanner.nextInt();

			if(choice != 3 && choice != 4 && choice != 9) {
				System.out.println("계산할 수 없는 도형입니다. 다시 입력하세요.");
				continue;
			} else if(choice == 9) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			System.out.print("도형의 높이를 입력하세요. > ");
			height = scanner.nextDouble();
			System.out.print("도형의 너비를 입력하세요. > ");
			width = scanner.nextDouble();

			ShapeDTO shape = new ShapeDTO(choice, width, width); //type자리가 choice로 자동 변환됨

			switch(shape.getType()) {
			case 3: triangleMenu(shape); break;
			case 4: squareMenu(shape); break;
			}
		}
	}

	private void triangleMenu(ShapeDTO shape) {
		
		TriangleManager triangleManager = new TriangleManager();
		
		while(true) { //반복문에 넣어야 변경한 color 값이 반영됨
			System.out.println("========= 삼각형 계산기 =========");
			System.out.println("1. 삼각형 둘레 구하기");
			System.out.println("2. 삼각형 면적 구하기");
			System.out.println("3. 선택한 도형 정보 출력하기");
			System.out.println("4. 도형 색상 칠하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴를 선택하세요. > ");
			int choice = scanner.nextInt();

			switch(choice) {
				case 1: triangleManager.calcPerimeter(shape); break;
				case 2: triangleManager.calcArea(shape); break;
				case 3: triangleManager.printShape(shape); break;
				case 4: triangleManager.paintColor(shape, inputColor()); break; //color 대신 하단 inputColor() 메소드로 변경해야 컴파일 에러 사라짐
				case 9: System.out.println("메인으로 돌아갑니다."); return; //mainMenu 호출 아닌 return;
				default: System.out.println("잘못된 번호입니다. 메뉴를 다시 선택해 주세요."); break;
			}
		}
	}
	private void squareMenu(ShapeDTO shape) {
		
		SquareManager squareManager = new SquareManager();
		
		while(true) {
			System.out.println("========= 사각형 계산기 =========");
			System.out.println("1. 사각형 둘레 구하기");
			System.out.println("2. 사각형 면적 구하기");
			System.out.println("3. 선택한 도형 정보 출력하기");
			System.out.println("4. 도형 색상 칠하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴를 선택하세요. > ");
			int choice = scanner.nextInt();
			
			switch(choice) {
				case 1: squareManager.calcPerimeter(shape); break;
				case 2: squareManager.calcArea(shape); break;
				case 3: squareManager.printShape(shape); break;
				case 4: squareManager.paintColor(shape, inputColor()); break; //color 대신 하단 inputColor() 메소드로 변경해야 컴파일 에러 사라짐
				case 9: System.out.println("메인으로 돌아갑니다."); return; //mainMenu 호출 아닌 return;
				default: System.out.println("잘못된 번호입니다. 메뉴를 다시 선택해 주세요."); break;
			}
		}
	}
	
	private String inputColor() {
		System.out.print("어떤 색으로 도형을 칠할까요? > ");
		scanner.nextLine(); //개행
		String color = scanner.nextLine();
		return color;
	}

}

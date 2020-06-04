package com.kh.practice.point.view;
// 출력화면을 보여주는 곳.

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	//필드//
	private Scanner sc = new Scanner(System.in);
	private CircleController cc= new CircleController();
	private RectangleController rc= new RectangleController();
	
	//생성자 - 기본생성자
	//public PointMenu(){}
	
	//메소드//
	public void mainMenu() {
		int menu;
		do {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호: ");
			menu=Integer.parseInt(sc.nextLine());
			switch(menu) {
				case 1:
					circleMenu();//circleMenu()를 호출
					break;
				
				case 2:
					rectangleMenu(); //rectangleMenu()를 호출
					break;
				
				case 9:
					System.out.println("종료합니다.");
					return; //현재 함수를 종료하고, mainMenu()함수를 호출한 곳으로 되돌아간다.
				
				default:
					// 잘못입력시 다시 받도록 반복.
					System.out.println("1,2,9 중 숫자 하나로 다시 입력해주세요!");
			}
			System.out.println();
		}while(true);
	}
	
	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호: ");
		int menu=Integer.parseInt(sc.nextLine());
		switch(menu) {
			case 1:
				//원 둘레 함수를 호출
				calcCircum();
				break;
			case 2:
				//원 넓이 함수를 호출
				calcCircleArea();
				break;
				
			case 9:
			default:
				//원메뉴 종료 -> 함수 호출한 곳으로 돌아감.
				// 잘못입력했을때도 메인메뉴로 돌아감.
				return;
		}

	}
	
	public void rectangleMenu() {
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호: ");
		int menu=Integer.parseInt(sc.nextLine());
		switch(menu) {
			case 1:
				//사각형 둘레함수 호출
				calcPerimeter();
				break;
			case 2:
				//사각형 넓이 함수 호출
				calcRectArea();
				break;
				
			case 9:
			default:
				//잘못입력 -> 메인메뉴로 돌아감.
				//사각형 메뉴 종료-> 함수 호출한 곳으로 돌아감.
				return;
		}
	}
	
	//오버로딩: 이름이 같다 + (매개변수 개수 / 매개변수 타입 / 매개변수 순서 -> 오버로딩이 가능)
	//오버라이딩: 상속관계 + 이름이 같다 + (매개변수 개수/ 매개변수 타입/ 매개변수 순서) 모두 같음 + 리턴타입 같아야함
	//      -> 오버라이딩하려면 접근제한자는 접근범위가 더 넓은 쪽으로 변경은 가능하다. 
	
	//원의 둘레
	public void calcCircum() {
		// x좌표, y좌표, 반지름
		System.out.print("x좌표: ");
		int x=Integer.parseInt(sc.nextLine());
		
		System.out.print("y좌표: ");
		int y=Integer.parseInt(sc.nextLine());
		
		System.out.print("반지름: ");
		int radius=Integer.parseInt(sc.nextLine());
		
		//원의 둘레 결과 출력
		System.out.println(cc.calcCircum(x,y,radius));
	}
	
	//원의 넓이
	public void calcCircleArea() {
		//x좌표, y좌표 , 반지름
		System.out.print("x좌표: ");
		int x=Integer.parseInt(sc.nextLine());
		
		System.out.print("y좌표: ");
		int y=Integer.parseInt(sc.nextLine());
		
		System.out.print("반지름: ");
		int radius=Integer.parseInt(sc.nextLine());
		
		//원의 넓이 결과 출력
		System.out.println(cc.calcArea(x, y, radius));
		
	}
	
	//사각형둘레
	public void calcPerimeter() {
		System.out.print("x좌표: ");
		int x=Integer.parseInt(sc.nextLine());
		
		System.out.print("y좌표: ");
		int y=Integer.parseInt(sc.nextLine());
		
		System.out.print("높이: ");
		int height=Integer.parseInt(sc.nextLine());
		
		System.out.print("너비: ");
		int width=Integer.parseInt(sc.nextLine());
		
		//사각형 둘레 결과 출력
		System.out.println(rc.calcPerimeter(x, y, height, width));
		
	}
	
	//사각형 넓이
	public void calcRectArea() {
		System.out.print("x좌표: ");
		int x=Integer.parseInt(sc.nextLine());
		
		System.out.print("y좌표: ");
		int y=Integer.parseInt(sc.nextLine());
		
		System.out.print("높이: ");
		int height=Integer.parseInt(sc.nextLine());
		
		System.out.print("너비: ");
		int width=Integer.parseInt(sc.nextLine());
		
		//사각형 넓이 결과 출력
		System.out.println(rc.calcArea(x, y, height, width));
		
	}
}

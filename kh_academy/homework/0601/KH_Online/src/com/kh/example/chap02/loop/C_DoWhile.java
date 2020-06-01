package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	public void method1() {
		// 키보드로 영어 문자열 값을 입력받아 출력 반복 실행
		Scanner sc = new Scanner(System.in);

		// exit문자열이 들어오면 반복문 종료
		String str=null;
		while(!str.equals("exit")) {
			System.out.print("문자열 입력: ");
			str=sc.nextLine();
			
			System.out.println("현재 입력 문자열: "+ str);
		}
		System.out.println("종료합니다.");

		// do -while
//		String str = null;
		do {
			System.out.print("문자열 입력: ");
			str = sc.nextLine(); // 이제 str은 사용자가 입력한 문자열을 가리키게된다.
			System.out.println("현재 입력한 문자열: " + str);
		} while (!str.equals("exit"));
		System.out.println("시스템을 종료합니다.");
	}

	public void method2() {
		// 메뉴 반복실행
		Scanner sc = new Scanner(System.in);

//		System.out.print("메뉴 입력: ");
//		int menuNum = sc.nextInt();
		// 자동 줄바꿈 ctrl+shift+f
		int menuNum;
		menuNum = 0;
		do {
			System.out.println();
			System.out.println("1. 테스트1");
			System.out.println("2. 테스트2");
			System.out.println("3. 테스트3");
			System.out.println("9.  종료  ");
			System.out.print("메뉴 입력: ");
			menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:
				System.out.println("1출력");
				break;
			case 2:
				System.out.println("2출력");
				break;
			case 3:
				System.out.println("3출력");
				break;
			case 9:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못 입력했습니다.");
			}
		} while (menuNum != 9); // 종료인 9가 아니면 계속실행.
		// menuNum cannot be resolved to a variable
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);
		int menuNum;
		menuNum = 0;
		do {
			System.out.println();
			System.out.println("1. 테스트1");
			System.out.println("2. 테스트2");
			System.out.println("3. 테스트3");
			System.out.println("9.  종료  ");
			System.out.print("메뉴 입력: ");
			menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:
				System.out.println("1출력");
				break;
			case 2:
				System.out.println("2출력");
				break;
			case 3:
				System.out.println("3출력");
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
				/*
				 * return : 
				 * */
				
			default:
				System.out.println("잘못 입력했습니다.");
			}
		} while (true); // 종료인 9가 아니면 계속실행.
//		System.out.println("terminated"); 
		//Unreachable code - 무한루프여서 도달할수 없는 코드
	}
}

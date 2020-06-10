package com.kh.practice.token.view;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	// 필드
	private Scanner sc= new Scanner(System.in);
	private TokenController tc=new TokenController();

	//메소드
	public void mainMenu() {
		//메인메뉴 출력
		//1. 지정 문자열
		//2. 입력 문자열
		//9. 프로그램 끝내기
		int menu;
		do {
			System.out.println("===== 메인 메뉴 =====");
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴번호 : ");
			menu=Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				tokenMenu();
				break; //지정문자열 
			case 2:
				inputMenu();
				break; //입력문자열
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return; //프로그램종료
			default:
				System.out.println("잘못 입력하셨습니다! 다시 입력해주세요!");
			}
			System.out.println();
		}while(true);
	}
	
	public void tokenMenu() {
		//StringTokenizer
		//토큰 처리전, 토큰 처리후 출력
		
		String str="J a v a P, r ## o g r - a m !";
		
		//토큰 처리 전 글자 출력
		System.out.println("토큰 처리 전 글자: "+ str);
		
		//토큰 처리전 개수(문자열길이) 출력
		System.out.println("토큰 처리전 개수 : "+ str.length());
		
		
		//TokenController(tc)의 afterToken()반환값을 가지고
		//토큰처리 후 글자, 토큰 처리후 개수, 모두 대문자로 변환한 것을 출력
		System.out.println("모두 대문자로 변환: "+tc.afterToken(str));
		
	}
	
	public void inputMenu() {
		//첫글자 대문자와
		//찾을문자 몇개 있는 지 출력
		
		System.out.print("문자열을 입력하세요: ");
		String inputStr= sc.nextLine();
		
		//tc에 firstCap()을 입력받은 문자열을 넘기고 반환값 출력
		inputStr=tc.firstCap(inputStr);
		
		System.out.print("찾을 문자 하나를 입력하세요: ");
		char targetChar= sc.nextLine().charAt(0);
		
		// tc에 findChar()로 위에 입력받은 문자열과
		// 방금 받은 문자를 인자로 넘겨 반환값 출력
		System.out.printf("%c 문자가 들어간 개수: %d\n", targetChar, tc.findChar(inputStr, targetChar));
	}
}

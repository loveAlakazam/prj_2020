package com.kh.practice.snack.run;

// 외부패키지이므로 import
import com.kh.practice.snack.view.SnackMenu;

public class Run {
	// 실행을 담당한다.
	// view 패키지 안의  SnackMenu 클래스를 불러온다.
	public static void main(String [] args) {
		// snackMenu 객체를 생성한다. 
		SnackMenu snackMenu= new SnackMenu();
		
		// menu() 메소드를 실행한다.
		snackMenu.menu();
	}
}

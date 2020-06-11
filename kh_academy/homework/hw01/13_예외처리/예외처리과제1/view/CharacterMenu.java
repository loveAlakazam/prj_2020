package com.kh.practice.charCheck.view;

import java.util.Scanner;
import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	private CharacterController cc=null;
	private Scanner sc= new Scanner(System.in);
	
	public void menu() {
		try {
			//사용자에게 문자열을 입력받아서 CharacterController의 countAlpha()에
			// 매개변수를 넘겨주어 반환값을 출력한다.
			System.out.print("문자열: ");
			String str=sc.nextLine();
			
			//사용자에게 받은 값에 있는 영문자 개수 출력
			cc=new CharacterController();
			
			int cnt=cc.countAlpha(str); 
			// countAlpha()를 호출. 
			// countAlpha에서 발생한 예외를 여기서 처리해야한다.
			System.out.printf("'%s'에 포함된 영문자 개수: %d\n",str, cnt);
			
		}catch(CharCheckException e) {
			// 예외 CharCheckException 이 발생했다면
			// try구문을 중단하고 catch블록으로 진입.
			e.printStackTrace();
		}
	}
}

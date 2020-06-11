package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {}
	
	public boolean isAlpha(char ch) {
		if((ch>=65 && ch<91) || (ch>=97 && ch<123))
			return true;
		return false;
	}
	
	public int countAlpha(String str) throws CharCheckException {
		// throws: 예외를 위임한다.
		// countAlpha()를 호출한 곳에서 CharCheckException을 처리.
		
		//매개변수로 들어온 값에 영문자 몇개가 들어있는지 반환.
		int result=0;
		char current;
		
		// ' '빈칸이 발견되면, 예외를 발생시킨다.(throw)
		for(int i=0; i<str.length(); i++) {
			current=str.charAt(i);
			
			// 현재 문자가 빈문자라면.
			if(current==' ') 
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어있습니다!");
			
			// 만일 현재문자가 영어문자라면
			if(isAlpha(current))
				result++;
		}

		return result;
	}
}

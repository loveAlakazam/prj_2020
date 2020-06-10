package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	//생성자
	public TokenController(){}
	
	public String afterToken(String str) {
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		// 구분문자를 없앤 문자열로 반환
		StringBuffer buffer= new StringBuffer();
		
		// 모든 문자를 대문자로 변환시킨다.
		StringTokenizer st= new StringTokenizer(str.toUpperCase(), " ,!#-?./*&^@$()`~-;");
		
		// 토큰처리후 문자열 개수
		int cnt=st.countTokens();
		System.out.println("토큰처리후  개수: "+ cnt);
		
		String result;
		while(st.hasMoreTokens()) {
			// 다음 토큰이 아직 존재한다면
			// 반복문 블록실행
			buffer.append(st.nextToken());
		}
		return buffer.toString();
	}
	
	public String firstCap(String input) {
		// 매개변수로 받아온 input의 첫번째 글자만 대문자로 바꾼 문자열로 반환
		StringBuffer sb= new StringBuffer(input.substring(1));
		sb.insert(0,input.toUpperCase().charAt(0));
		return sb.toString();
	}
	
	public int findChar(String input, char one) {
		int cnt=0; //개수
		for(int i=0; i<input.length(); i++) {
			char current=input.charAt(i);
			if(current==one)
				cnt++;
		}
		return cnt;
	}
}

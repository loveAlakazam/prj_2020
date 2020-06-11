package com.kh.practice.charCheck.exception;

// 사용자 정의 예외
// 모든 예외들의 조상은 Exception이다.
// 사용자 정의 예외를 만들때는 extends Exception 키워드를 넣어야한다.
public class CharCheckException extends Exception {
	public CharCheckException() {}
	public CharCheckException(String msg) {
		//매개변수로 받은 값을 부모 생성자로 넘기는 생성자.
		super(msg);
	}
}

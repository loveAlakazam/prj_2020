package com.kh.example.chap02_class.defaultClass.controller;

// default 클래스는 앞에 접근제한자를 붙이지 않는다.
// default class DefaultClassTest{...}
// => Syntax error발생: Syntax error on token "default", delete this token
class DefaultClassTest {
	public void test() {
		System.out.println("default 클래스 안의 메소드 test() 실행했습니다.");
	}
}

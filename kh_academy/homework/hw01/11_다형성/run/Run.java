package com.kh.practice.chap01_poly.run;

import com.kh.practice.chap01_poly.view.LibraryMenu;

// run패키지 => 실행부분.
// 다형성 실습 숙제
/*
 * 다형성(polymorphism) 이란
 * => 객체지향 프로그래밍 특징(캡슐화/상속/다형성/추상화) 중 하나
 * => 상속 관계가 성립해야한다.
 * => 다형성= up-casting :부모클래스 타입의 래퍼런스 변수는 
 * 						자식클래스를 담을 수 있는 기능을 의미한다.
 * 
 * => 여러 자식객체를 부모클래스에 타입으로 다룰 수 있는 것
 * 
 * => 다형성은 메소드의 오버로딩을 줄일 수있다.
 *    오버로딩: 매개변수의 개수/순서/타입에 의해 여러개의 메소드를 만들 수 있는 것
 * */
public class Run {
	// 접근제한자: public(+): 패키지 외부 등 외부로부터 호출 가능.
	// static: 밑줄
	public static void main(String[] args) {
		//LibraryMenu의 mainMenu 호출
		new LibraryMenu().mainMenu();
	}
}

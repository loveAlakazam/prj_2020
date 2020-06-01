package com.kh.example.practice3.model.vo;

//필드 실습 예제 2
public class Circle {
	
	// 필드 //
	// 상수: final => 한 번 초기화 이후 더이상 값을 변경할 수 없다.
	// 클래스 변수 이기도 하다. 
	private static final double PI=3.14;
	
	
	// 클래스 변수 - static이 붙어있다.
	// static 변수 -> 메모리의 static 영역에 저장되어있다.
	// 공유해서 사용할 수있고
	// 객체 생성 없이, 외부에서 직접 사용할 수 있다 => Circle.radius 로 사용.
	// 그런데 접근제한자가 private이기 때문에 외부에 접근을 할 수 없다. 
	private static int radius=1;
	
	
	//생성자 //
	
	// 기본생성
	public Circle() {
	}
	
	
	//methods//
	//반지름 길이 출력하기
	//객체를 만든 후에 메소드 출력.
	public void printRadius() {
		System.out.println("현재 반지름 길이: "+ radius);
	}
	
	// 반지름 길이를 1로 변경 한다.
	public void reverseRadius() {
		radius=1;
	}
	
	
	public void incrementRadius() {
		//원의 반지름 을 1씩 증가하고, 반지름 길이를 출력 한다.
		radius+=1;
	}
	
	public void getAreaOfCircle() {
		// 원의 넓이를 구한다.
		double area=radius*radius*PI;
		System.out.println("원의 넓이 : "+ area);
	}
	
	
	public void getSizeOfCircle() {
		// 원의 둘레를 구한다.
		double circonference= 2*PI*radius;
		System.out.println("원의 둘레: "+circonference);
	}
	
}

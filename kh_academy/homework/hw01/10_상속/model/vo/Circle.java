package com.kh.practice.point.model.vo;

public class Circle extends Point {
	//필드//
	private int radius;
	public static final double PI=3.14; //클래스 변수 
	
	//생성자//
	public Circle() {
		//기본생성자
	}
	
	public Circle(int x, int y, int radius) {
		// 매개변수가 있는 생성자는
		// 객체의 필드값을 초기화 시킬 수 있다.
		
		super(x,y); //부모객체 Point 생성
		this.radius=radius; 
	}
	
	//메소드//
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius=radius;
	}
	
	// 오버라이딩 = 메소드 재정의 
	//- 부모클래스(Point)로부터 물려받은 메소드를 재정의
	@Override
	public String toString() {
		// 점의 좌표값 정보 , 반지름 길이 /
		return super.toString()+", "+radius+" / ";
	}
}

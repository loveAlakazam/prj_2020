package com.kh.practice.point.model.vo;


// Point 클래스의 자식클래스
public class Rectangle extends Point{
	//필드//
	private int width;
	private int height;
	
	// 생성자 //
	public Rectangle() {
		//기본생성자
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y); //부모객체 Point생성
		this.width=width;
		this.height=height;
	}
	
	
	//메소드 //
	//width
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	
	//height
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	
	
	// 오버라이딩 - 부모클래스로부터 상속받은 메소드를 재정의
	@Override
	public String toString() {
		// 점의좌표 출력 +
		return super.toString()+" 높이: "+height+", 너비: "+width+" / ";
	}
}

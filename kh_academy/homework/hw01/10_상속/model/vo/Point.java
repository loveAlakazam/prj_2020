package com.kh.practice.point.model.vo;

// Circle클래스와 Rectangle클래스의 부모클래스
public class Point {
	// 필드 //
	private int x;
	private int y;
	
	// 생성자 //
	Point(){
		//기본생성자
		//매개변수가 있는 생성자를 정의하지않았다면 
		//  -> JVM에 의해서 자동으로 기본생성자를 생성하게 된다.
	}
	
	Point(int x, int y){
		//매개변수가 있는 생성자
		this.x=x;
		this.y=y;
	}
	
	//메소드//
	public void setX(int x) {
		this.x=x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public int getY() {
		return y;
	}
	
	//Object클래스의 toString(): 주소값을 문자열형식으로 리턴.
	//오버라이딩을 함. => toString()메소드 재정의
	//재정의한 메소드를 사용하면, 부모에게 물려받은 메소드는 사용할 수없으며
	// 부모클래스가 가지고있는 메소드를 사용하고싶다면 super.메소드이름() 형식으로 호출.
	@Override
	public String toString() {
		//부모클래스인 Object객체의 toString()메소드 호출
		//return super.toString();
		
		//재정의한 메소드는, 필드에 담긴 데이터를 반환하는 메소드
		return x+", "+y; // 점의 좌표값 정보
	}
}

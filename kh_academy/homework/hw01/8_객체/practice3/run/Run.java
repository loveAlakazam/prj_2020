package com.kh.example.practice3.run;

//Circle클래스 임포트
import com.kh.example.practice3.model.vo.Circle;


public class Run {
	public static void main(String [] args) {
		// 객체를 생성하기전에 클래스 변수를 출력해본다.
		// 그런데 radius는 접근제한자가 private이기 때문에
		// Circle 클래스 바깥에서 데이터를 조회할 수 없다.(캡슐화) 
//		System.out.println("클래스변수 radius: "+ Circle.radius);
		
		System.out.println("원 객체 생성 1 ");
		// Circle 객체를 생성한다
		Circle circle = new Circle();
		
		
		//반지름 길이를 출력해보자 
		circle.printRadius();
		
		// 원의 둘레
		circle.getSizeOfCircle();
		
		// 원의 넓이 
		circle.getAreaOfCircle();
		
	
		// incrementRadius() 메소드를 통해서
		// 반지름을 1씩 증가 시킨후 다시 원의둘레와 넓이 값 출력 
		circle.incrementRadius();
		
		circle.printRadius(); //반지름 길이 출력 
		
		circle.getSizeOfCircle(); //반지름 길이 증가 후 둘레 출력 
		circle.getAreaOfCircle(); //반지름 길이 증가 후 넓이 출력 
		
		
		System.out.println();
		System.out.println("원 객체 생성 2");
		
		// 새로운 객체를 만들어본다.
		Circle circle2= new Circle();
		circle2.printRadius(); //반지름 길이 출력 
		circle2.getAreaOfCircle(); //원의 넓이 출력 
		circle2.getSizeOfCircle();// 원의 둘레 출력 
		
		
		// 원의 반지름 길이를  다시 1로 복구시켜본다 
		circle2.reverseRadius();
		
		System.out.println("원 객체 2에서의 반지름 길이");
		circle2.printRadius();
		
		System.out.println("원 객체 1에서의 반지름 길이");
		circle.printRadius(); 
		
		// 객체를 여러개 생성하더라도 클래스변수는 객체마다 생성되는게 아니라
		// 모든 클래스에 해당하는 객체가 하나의 클래스 변수를 공유한다. 
	}

}

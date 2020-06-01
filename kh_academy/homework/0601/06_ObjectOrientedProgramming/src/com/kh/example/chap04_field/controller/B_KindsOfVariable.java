package com.kh.example.chap04_field.controller;

public class B_KindsOfVariable { //클래스 영역 시작
	//클래스 영역에 작성하는 변수: 필드=전역변수=멤버필드=멤버변수
	
	private int globalNum; //전역변수: 선언이후(6번라인~클래스영역 끝에 해당하는 라인까지는 전역변수가 관여할수 있다)+(메소드 안에도 관여할 수 있다.)
	
	public void method1(int num) { //메소드 영역 시작
		// 지역변수: 메소드 영역에서 작성하는 변수
		// 메소드의 선언부에서 소괄호 안에 있는 선언하는 변수들: 매개변수 = 파라미터
		// 매개변수도 메소드 안에 있으므로,"지역변수" 이다.
		
//		int localNum; //지역변수
//		System.out.println("localNum: "+ localNum);
		//The local variable localNum may not have been initialized
		//초기화가 안되면 에러가 발생한다.
		//지역변수는 초기화가 필요하다.
		
		System.out.println("num: "+num); //함수를 호출한 곳으로부터 num에 값을 받기때문에. 
		System.out.println("globalNum: "+globalNum);
	}//메소드 영역 끝

	
	public void method2() {
		//지역변수 localNum에 메소드 method1()에서만 해당하기 때문에, 다른 곳에서는 해당하지 않는다.
		System.out.println(globalNum);
//		System.out.println(localNum);
//		System.out.println(num); //num을 매개변수로 받지 않는다.
	}
	
	
}//클래스 영역끝
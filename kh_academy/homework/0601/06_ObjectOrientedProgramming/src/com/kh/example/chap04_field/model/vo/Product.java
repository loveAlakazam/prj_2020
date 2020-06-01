package com.kh.example.chap04_field.model.vo;

public class Product {
	

	
	//jvm에 의한 초기화
//	private String name;
//	private String brand;
//	private int price;
//	private static int num;

	
	//명시적 초기화
	//인스턴스 변수
	private String name="초코파이";
	private String brand="오리온";
	private int price=1500;
	
	private static int num=100; //클래스변수
	
	
	//인스턴스 초기화
	{
		name="칸초";
		price=1000;
		brand="롯데";
		num-=10;
	}
	
	
	
	//프로그램 시작하면서 딱 한번 일어난다.
	static{//static은 객체없이 static에 할당하고, 객체없이 바로 사용할 수있다.
		
		//그런데 name, price, brand는 객체가 필요한 인스턴스 변수이다.
		//인스턴스 변수가 static안에서 초기화 되는건 불가능하다.
		
		//static은 인스턴스(객체)가 있든 없든 상관없이 불러서 사용할 수있다.
		//그래서 클래스 안에 static변수가 있어도 상관없다.-> 클래스이름.(클래스변수/클래스메소드)를 부르면 되니까.
		//바로 사용할 수있으니까 static은.
//			name="칸초";
//			price=1000;
//			brand="롯데";
			num=150;
			num--;
	}	
	
	
	
	
	//명시적 초기화- 직적 집어넣음
	public void inform() {
		System.out.println(name+", "+brand+", "+ price+", "+ num);
	}
	
}

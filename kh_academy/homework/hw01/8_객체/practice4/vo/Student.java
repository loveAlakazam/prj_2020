package com.kh.example.practice4.model.vo;

// 필드 실습예제 3
public class Student {
	// 필드 = 전역변수 = 멤버필드 = 멤버 변수 //
	// 캡슐화 - 현재 Student 클래스 밖에서는 접근할 수 없다.
	// 클래스 변수 -  ( 모든 인스턴스가 )공유한다. / 객체 생성없이 직접 사용할 수 있지만, 접근제한자가 private이다.
	private static int grade;
	
	// 인스턴스 변수 - 객체를 생성해야 필드를 사용할 수 있다. 
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	
	//초기화 블록을 이용해서 각 필드를 초기화 한다. //
	//static 초기화 블록 - 객체가 생성하기 전에 또는 첫번째 실행일때 
	static {
		// static 블록에는 클래스 변수만 초기화 가능.
		grade=0; //5로 초기화 
		
	}
	
	//인스턴스 블록으로 초기화 - 객체가 생성한 후에 초기화 한다.
	{
		classroom=432;
		name="최은강";
		height=160.8;
		gender='M';
		
		// 객체를 생성한다해도 어차피 공유하고 있으므로
		// 호출할때마다 grade가 10씩 올라간다.
		grade+=10;
	}
	
	
	// 생성자 //
	public Student() {
		// 기본 생성자 
		// 매개변수가 있는 생성자를 생성하면, JVM에서 자동으로 만들어주는 기본생성자를 불러올 수 없다.
	}
	
	// 생성자 오버로딩 
	public Student(String name) {
		this(); //위의 기본생성자를 호출한다.
		this.name=name; // 생성자로 인한 초기값 -> 인스턴스 변수는 생성자로 인한 초기값 설정이 가장 나중에 일어난다.
		this.classroom-=100;
	}
	
	public Student(String name, int classroom) {
		this(name);
		this.classroom=classroom;
		this.height-=10;
	}
	
	
	// 메소드 //
	public void information() {
		//학생의 정보를 출력하는 메소드
		System.out.println("name : "+name);
		System.out.println("classroom: "+ classroom);
		System.out.println("gender: "+ gender);
		System.out.println("height: "+ height);
		System.out.println("grade: "+grade);
		
	}
}

package com.kh.example.practice1.model.vo;


// 클래스 실습예제 1
public class Member {

	//필드 = 전역변수 = 멤버필드 = 멤버변수
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	// 생성자 - 기본 생성자 : public Member(){}
	// 매개변수가 있는 생성자를 정의하지 않았다면
	// 기본생성자를 굳이 정의하지 않더라도
	// JVM에 의해서 자동으로 기본생성자를 생성.
	public Member() {
		// this는 참조형변수가 가리키는 객체의 주소값을 가지고 있다.
		// 만들어진 객체의 주소를 출력시켜보자.
		System.out.println("현재 객체주소: "+ this);
		System.out.println("객체 생성완료!\n");
	}
	
	// 메소드 오버로딩 //
	// 하나의 클래스 내에서 같은 이름의 메소드를 여러개 만들 수 있다.
	// 1. 매개변수의 타입이 다르거나
	// 2. 매개변수의 개수가 다르거나
	// 3. 매개변수의 순서가 다르면
	// 메소드 오버로딩이 가능하다.
	
	// 반면, 위의 3가지가 같은데
	// 메소드 매개변수의 이름이 다르거나
	// 메소드의 리턴타입이 다르면
	// 메소드 오버로딩이 안된다는거 주의하자.
	
	// 생성자 오버로딩 //
	// 사용자 정의 생성자 1- 매개변수가 있는 생성자
	public Member(String memberName) { // 괄호안에 있는 매개변수 memberName은 지역변수
		this(); //기본생성자 호출
		this.memberName= memberName; //필드에 매개변수값을 대입한다.
	}
	
	// 사용자 정의 생성자 2- 매개변수가 있는 생성자
	// this() 를 이용하여 메소드를 오버로딩 해보자.
	// this()는 코드의 중복을 막기 위해서 만들어졌다.
	public Member(String memberName, String memberId, String memberPwd) {
		this(memberName); // 사용자 정의 생성자 1 호출
		this.memberId=memberId;
		this.memberPwd=memberPwd;
	}
	
	// 사용자 정의 생성자 3
	public Member(String memberName, String memberId, String memberPwd, int age) {
		this(memberName, memberId, memberPwd); //사용자정의 생성자 2 호출
		this.age=age;
	}
	
	// 사용자 정의 생성자 4
	public Member(String memberName, String memberId, String memberPwd, int age, char gender) {
		this(memberName, memberId, memberPwd, age);
		this.gender=gender;
	}
	
	// 사용자 정의 생성자 5
	public Member(String memberName, String memberId, String memberPwd, 
			int age, char gender, String phone, String email ) {
		this(memberName, memberId, memberPwd, age, gender);
		this.phone=phone;
		this.email=email;
	}
	
	// this()를 이용하여 메소드를 또 한번더 
	public void changeName(String memberName) { //<- 매개변수 memberName은 지역변수이다.
		// 필드와 지역변수 이름이 서로 같을 때
		// 메소드 내에서 우선순위가 높은 것은 지역변수이다.
		
		//(덧) 전역변수= 필드 는 클래스안 ~ 메소드 밖에 위치하고 있고
		//    지역변수는 메소드 안이기때문이다.
		
		// 그러면 필드와 매개변수(지역변수)이름이 서로 같을 때
		// 매개변수에 저장된 값을 필드에 할당시키려면
		// 필드와 메소드를 구분하려면 this가 필요하다.
		String olderName= this.memberName; // 초기 필드값에 저장된 이름.
		
		this.memberName= memberName;
		System.out.printf("(변경전)%s -> (변경후)%s\n", olderName, this.memberName);
		
		
	}
	
	public void printName() {
		// memberName 필드에 해당하는 이름을 출력
		System.out.println("이름: "+this.memberName);
	}
}

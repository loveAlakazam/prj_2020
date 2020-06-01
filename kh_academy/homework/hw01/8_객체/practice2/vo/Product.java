package com.kh.example.practice2.model.vo;

//필드 실습 예제 1
public class Product {
	// 필드
	private String pName;
	private int price;
	private String brand;
	
	// 생성자
	// 생성자1 - 기본생성자
	public Product(){
	}
	
	// 생성자2 - 매개변수가 있는 생성자 1
	public Product(String pName) {
		this.pName= pName;
	}
	
	// 생성자3 - 오버로딩 될수 없는 생성자
	// 매개변수 1개이고, 타입이 String이므로
	// 오버로딩이 될 수 없다. 생성자 2에서 이미 정의함.
//	public Product(String brand) {
//		this.brand= brand;
//	}
	
	// 생성자 4
	public Product(int price) {
		this.price=price;
	}
	
	// 생성자5
	public Product(int price, String pName) {
		this(price);
		this.pName=pName;
	}
	
	// 생성자6
	public Product(String brand, String pName) {
		this(pName);
		this.brand=brand;
	}
	
	// 생성자 7
	// this() 생성자로 생성자 오버로딩
	public Product(String pName, String brand, int price) {
		this(price, pName); // 생성자5 호출.
		this.brand= brand;
		this.price= price;
	}
	
	// 메소드
	public void information() {
		//필드를 출력해보자.
		System.out.println("상품이름: "+ this.pName);
		System.out.println("상품 브랜드: "+ this.brand);
		System.out.println("상품가격: "+ this.price);
	}
	
	// 메소드도 오버로딩 할수 있다.
	// 리턴 타입이 달라서가 아니다.
	// 매개변수에 들어있는 인자(parameter)가 1개 이고, 그 타입은 int형이다.
	public int information(int price) {
		return price/1000;
	}
	
	// 그냥 메소드
	public void changePrice(int finance) {
		//가격 변경하기.
		this.price=this.price * finance;
		
	}
	
	
	// 메소드 오버로딩
	public void changeInfo(String pName, String brand,int price) {
//		this.pName=pName;
		changeInfo(pName);
		this.brand=brand;
		this.price=price;
	}
	
	//그냥 메소드에서 코드의 중복이 일어난다면 어떡하지?
	// 생성자는 this()로 해결했지만
	// 메소드는 메소드이름(매개변수); 로 호출을 한뒤에 -> 부족한 필드를 채워넣는다.
	public void changeInfo(String pName) {
		this.pName=pName;
	}
}

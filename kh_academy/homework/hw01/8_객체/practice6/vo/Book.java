package com.kh.example.practice6.model.vo;

public class Book {
	// 필드 //
	// 캡슐화 - private : 현재 Book 클래스 내에서만 가능하다.
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	// 생성자 //
	// 1. 기본 생성자
	public Book() {
		
	}
	
	// 2. 매개변수가 있는 생성자 - 오버로딩
	public Book(String title, String publisher, String author) {
		this();
		
		// this는 객체를 그자체이며, this에는 객체의 주소값이 저장되어있다.
		this.title=title;
		this.publisher= publisher;
		this.author=author;
	}
	
	
	// 3. 매개변수가 있는 생성자 2 - 오버로딩
	public Book(String title, String publisher, String author,
			int price, double discount) {
		this(title, publisher, author); // this() 생성자 -> 위의 오버로딩 생성자를 호출
		this.price= price;
		this.author= author;
	}
	
	
	// 메소드 //
	public void inform() {
		System.out.println("제목 : "+ this.title);
		System.out.println("출판사: "+ this.publisher);
		System.out.println("작가: "+this.author);
		System.out.println("가격:  "+this.price);
		System.out.println("할인율 : "+ this.discountRate);
	}
}
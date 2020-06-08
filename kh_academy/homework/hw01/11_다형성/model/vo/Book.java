package com.kh.practice.chap01_poly.model.vo;

public class Book {
	// 클래스 AniBook과 CookBoot의 부모클래스이다.
	// 상속-클래스다이어그램 표현: 자식클래스 -> 부모클래스

	//필드//
	private String title;
	private String author;
	private String publisher;
	
	//생성자//
	public Book() {}
	public Book(String title, String author, String publisher) {
		this.title=title;
		this.author=author;
		this.publisher=publisher;
	}
	
	//메소드//
	//Getter Setter
	public String getTitle() {return title;}
	public String getAuthor() {return author;}
	public String getPublisher() {return publisher;}
	
	public void setTitle(String title) {this.title=title;}
	public void setAuthor(String author) {this.author=author;}
	public void setPublisher(String publisher) {this.publisher=publisher;}
	
	@Override
	public String toString() {
		return "[Book [title="+title+", author="+author+" ,publisher="+publisher+"]";
	}
}

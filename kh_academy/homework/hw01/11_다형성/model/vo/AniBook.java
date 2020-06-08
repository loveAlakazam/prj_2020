package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book{
	// 필드 //
	private int accessAge; //제한나이
	
	// 생성자 //
	public AniBook() {}
	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge=accessAge;
	}
	
	public void setAccessAge(int accessAge) {
		this.accessAge=accessAge;
	}
	
	public int getAccessAge() {
		return accessAge;
	}
	
	@Override
	public String toString() {
		return "AniBook "+super.toString()+", accessAge="+accessAge+"]";
	}

}

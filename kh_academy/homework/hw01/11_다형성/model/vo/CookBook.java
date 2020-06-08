package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book{
	// 클래스 CookBook은 Book의 자식클래스이다.
	
	// 필드//
	private boolean coupon;

	//생성자//
	public CookBook() {}
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon=coupon;
	}
	
	//setter / getter
	public void setCoupon(boolean coupon) {this.coupon=coupon;}
	public boolean getCoupon() {return coupon;}
	
	// 오버라이드.
	@Override
	public String toString() {
		return "CookBook "+super.toString()+", coupon="+coupon+"]";
	}
}

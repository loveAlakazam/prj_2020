package com.kh.practice.chap01_poly.model.vo;

public class Member {
	//필드//
	private String name;
	private int age;
	private char gender;
	private int couponCount;
	
	//생성자//
	public Member(){} //기본생성자
	
	// 매개변수가 있는 생성자
	public Member(String name, int age, char gender){
		this.name=name;
		this.age= age;
		this.gender=gender;
		this.couponCount=0; //0으로 초기화
	}
	
	// 메소드 //
	// getter/setter
	public String getName() { return name;}
	public int getAge() {return age;}
	public char getGender() {return gender;}
	public int getCouponCount() {return couponCount;}
	
	public void setName(String name) {this.name=name;}
	public void setAge(int age) {this.age=age;}
	public void setGender(char gender) {this.gender=gender;}
	public void setCouponCount(int couponCount) {this.couponCount=couponCount;}
	
	//Obejct 클래스의 메소드 toString을 오버라이드
	@Override
	public String toString() {
		return "Member [name="+name+ ", age="+age+" ,gender="+gender+", couponCount="+getCouponCount()+"]";
	}
	
}

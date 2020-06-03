package com.kh.practice.student.model.vo;

public class Student {
	// model의 vo패키지:  추상화를 거치지 않은 클래스를 저장한다.
	
	// 필드 //
	private String name;
	private String subject;
	private int score;
	
	// 생성자  //
	public Student() {
		// 기본생성자
	} 
	
	public Student(String name, String subject, int score) {
		// 매개변수가 있는 생성자.
		this.name= name;
		this.subject= subject;
		this.score=score;
	}
	
	// 메소드   //
	// setter& getter 메소드
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public void setSubject(String subject) {
		this.subject=subject;
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	
	public void setScore(int score) {
		this.score=score;
	}
	
	public int getScore() {
		return this.score;
	}
	
	// inform 메소드
	public String inform() {
		// Student 클래스의 모든 필드값들을 합쳐서 반환
		return "이름: "+this.name+" / 과목: "+this.subject+" / 점수: "+this.score;
	}
}

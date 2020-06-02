package com.kh.practice.snack.model.vo;
import java.util.StringJoiner;

public class Snack {
	// model: 데이터 처리를 담당한다.
	// model>vo : 추상화를 거친 클래스 를 저장하는 패키지이다.
	
	
	// 필드 //
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	
	// Constructors //
	// 기본 생성자
	public Snack(){
		
	}
	
	// 매개변수가 있는 생성자
	// 생성자 오버로딩. - 매개변수의 개수/ 매개변수의 타입/ 매개변수 순서가 다르면 
	//				- 이름이 같은 생성자를 정의할 수 있다.
	public Snack(String kind, String name, String flavor, int numOf, int price ) {
		// this는 현재 객체의 주소값을 저장하는 참조형 변수이다.
		this.kind=kind;
		this.name= name;
		this.flavor= flavor;
		this.numOf= numOf;
		this.price= price;
	}
	
	// methods //
	public String information() {
		// 각 필드에 해당하는 데이터를 문자열 형태로 리턴해준다.
		// 담긴 데이터를 문자열형태로 리턴한다 -> model을 호출한 곳으로 돌아간다.
		String result=this.getKind(); //초기
		
		StringJoiner sj= new StringJoiner(" - ", "(", ")");
		sj.add(this.getName()).add(this.getFlavor());
		result+=sj.toString();
		result+=this.getNumOf()+"개 "+this.getPrice()+"원";
		//결과를 리턴한다.
		return result;
	}
	
	// getter & setter //
	// 초기화된 필드값의 변경이 필요할 때
	// 그 필드의 값을 출력하고 싶을 때 사용한다.
	
	//kind
	public void setKind(String kind) { // kind필드 값 변경 
		this.kind=kind;
	}
	
	public String getKind() { //kind 필드값을 리턴
		return this.kind;
	}
	
	
	//name
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	//flavor
	public void setFlavor(String flavor) {
		this.flavor=flavor;
	}
	
	public String getFlavor() {
		return this.flavor;
	}
	
	
	//numOf
	public void setNumOf(int numOf) {
		this.numOf= numOf;
	}
	
	public int getNumOf() {
		return this.numOf;
	}
	
	
	//price
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
}

package com.kh.example.chap01_encapsulation;

public class Account {
	//필드 //
	//필드 =전역변수 = 멤버변수 = 멤버필드 
	//클래스 안 / 메소드 밖에 있다.
	
	//밖에서 보이지 않도록 하는 것= 캡슐화 = private
	//Account 내에서만 된다.
	private String name="최은강";//이름
	private String phone="010-7168-5268";;//전화번호
	private String password="aaa";//비밀번호
	private int bankCode=3030;//은행번호
	private int balance=0; //잔액
	
	public void showInfo() {
		System.out.println("이름: "+ name);
		System.out.println("전화번호 : "+ phone);
		System.out.println("은행 번호 : "+bankCode);
	}
	
	
	// 메소드 : 데이터를 가공하는 기능 //
	//입금을 위한 메소드
	public void deposit(int money) {
		if(money >0) {
			//원래있는 잔액에 돈을 더한다.
			balance += money;
			System.out.println(name+"님의 계좌의 "+money+"가 입금되었습니다.");
		}else {
			System.out.println("잘못된 금액이 입력되었습니다.");
		}
	}
	
	//출금을 위한 메소드
	public void withdraw(int money) {
		if(money<=balance) {
			balance-=money;
			System.out.println(name+"님의계좌에 "+money+"가 출금 되었습니다.");
		}else {
			System.out.println("잔액이 부족합니다. 잔액을 확인해주세요.");
		}
	}
	
	//조회
	public void displayBalance() {
		System.out.println(name+"님의 잔액은 "+balance+"원 입니다.");
	}
	
	
}

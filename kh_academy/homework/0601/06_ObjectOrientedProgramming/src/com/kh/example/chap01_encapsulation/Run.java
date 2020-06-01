package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		Account a= new Account();
		
		a.displayBalance(); //현재 잔액 조회
		
		a.deposit(1000000); //100만원 입금
		a.displayBalance(); //현재 잔액 조회

		a.deposit(1500000); //150만원 입금
		a.displayBalance();
		
		a.withdraw(500000); //50만원 출금
		a.displayBalance();
		
		
		System.out.println();
		
//		a.balance-=2000000; //외부에서 접근.
		//balance를 private한 경우.
		// The field Account.balance is not visible
		
		a.withdraw(500000);
		
		a.displayBalance();
		a.showInfo();
		
	}
}

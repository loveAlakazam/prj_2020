package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		Account a= new Account();
		
		a.displayBalance(); //���� �ܾ� ��ȸ
		
		a.deposit(1000000); //100���� �Ա�
		a.displayBalance(); //���� �ܾ� ��ȸ

		a.deposit(1500000); //150���� �Ա�
		a.displayBalance();
		
		a.withdraw(500000); //50���� ���
		a.displayBalance();
		
		
		System.out.println();
		
//		a.balance-=2000000; //�ܺο��� ����.
		//balance�� private�� ���.
		// The field Account.balance is not visible
		
		a.withdraw(500000);
		
		a.displayBalance();
		a.showInfo();
		
	}
}

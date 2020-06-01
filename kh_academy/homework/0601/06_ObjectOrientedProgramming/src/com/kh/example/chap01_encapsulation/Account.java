package com.kh.example.chap01_encapsulation;

public class Account {
	//�ʵ� //
	//�ʵ� =�������� = ������� = ����ʵ� 
	//Ŭ���� �� / �޼ҵ� �ۿ� �ִ�.
	
	//�ۿ��� ������ �ʵ��� �ϴ� ��= ĸ��ȭ = private
	//Account �������� �ȴ�.
	private String name="������";//�̸�
	private String phone="010-7168-5268";;//��ȭ��ȣ
	private String password="aaa";//��й�ȣ
	private int bankCode=3030;//�����ȣ
	private int balance=0; //�ܾ�
	
	public void showInfo() {
		System.out.println("�̸�: "+ name);
		System.out.println("��ȭ��ȣ : "+ phone);
		System.out.println("���� ��ȣ : "+bankCode);
	}
	
	
	// �޼ҵ� : �����͸� �����ϴ� ��� //
	//�Ա��� ���� �޼ҵ�
	public void deposit(int money) {
		if(money >0) {
			//�����ִ� �ܾ׿� ���� ���Ѵ�.
			balance += money;
			System.out.println(name+"���� ������ "+money+"�� �ԱݵǾ����ϴ�.");
		}else {
			System.out.println("�߸��� �ݾ��� �ԷµǾ����ϴ�.");
		}
	}
	
	//����� ���� �޼ҵ�
	public void withdraw(int money) {
		if(money<=balance) {
			balance-=money;
			System.out.println(name+"���ǰ��¿� "+money+"�� ��� �Ǿ����ϴ�.");
		}else {
			System.out.println("�ܾ��� �����մϴ�. �ܾ��� Ȯ�����ּ���.");
		}
	}
	
	//��ȸ
	public void displayBalance() {
		System.out.println(name+"���� �ܾ��� "+balance+"�� �Դϴ�.");
	}
	
	
}

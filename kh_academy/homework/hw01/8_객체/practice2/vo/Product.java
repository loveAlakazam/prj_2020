package com.kh.example.practice2.model.vo;

//�ʵ� �ǽ� ���� 1
public class Product {
	// �ʵ�
	private String pName;
	private int price;
	private String brand;
	
	// ������
	// ������1 - �⺻������
	public Product(){
	}
	
	// ������2 - �Ű������� �ִ� ������ 1
	public Product(String pName) {
		this.pName= pName;
	}
	
	// ������3 - �����ε� �ɼ� ���� ������
	// �Ű����� 1���̰�, Ÿ���� String�̹Ƿ�
	// �����ε��� �� �� ����. ������ 2���� �̹� ������.
//	public Product(String brand) {
//		this.brand= brand;
//	}
	
	// ������ 4
	public Product(int price) {
		this.price=price;
	}
	
	// ������5
	public Product(int price, String pName) {
		this(price);
		this.pName=pName;
	}
	
	// ������6
	public Product(String brand, String pName) {
		this(pName);
		this.brand=brand;
	}
	
	// ������ 7
	// this() �����ڷ� ������ �����ε�
	public Product(String pName, String brand, int price) {
		this(price, pName); // ������5 ȣ��.
		this.brand= brand;
		this.price= price;
	}
	
	// �޼ҵ�
	public void information() {
		//�ʵ带 ����غ���.
		System.out.println("��ǰ�̸�: "+ this.pName);
		System.out.println("��ǰ �귣��: "+ this.brand);
		System.out.println("��ǰ����: "+ this.price);
	}
	
	// �޼ҵ嵵 �����ε� �Ҽ� �ִ�.
	// ���� Ÿ���� �޶󼭰� �ƴϴ�.
	// �Ű������� ����ִ� ����(parameter)�� 1�� �̰�, �� Ÿ���� int���̴�.
	public int information(int price) {
		return price/1000;
	}
	
	// �׳� �޼ҵ�
	public void changePrice(int finance) {
		//���� �����ϱ�.
		this.price=this.price * finance;
		
	}
	
	
	// �޼ҵ� �����ε�
	public void changeInfo(String pName, String brand,int price) {
//		this.pName=pName;
		changeInfo(pName);
		this.brand=brand;
		this.price=price;
	}
	
	//�׳� �޼ҵ忡�� �ڵ��� �ߺ��� �Ͼ�ٸ� �����?
	// �����ڴ� this()�� �ذ�������
	// �޼ҵ�� �޼ҵ��̸�(�Ű�����); �� ȣ���� �ѵڿ� -> ������ �ʵ带 ä���ִ´�.
	public void changeInfo(String pName) {
		this.pName=pName;
	}
}

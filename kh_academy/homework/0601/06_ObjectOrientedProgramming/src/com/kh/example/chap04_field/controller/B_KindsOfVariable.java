package com.kh.example.chap04_field.controller;

public class B_KindsOfVariable { //Ŭ���� ���� ����
	//Ŭ���� ������ �ۼ��ϴ� ����: �ʵ�=��������=����ʵ�=�������
	
	private int globalNum; //��������: ��������(6������~Ŭ�������� ���� �ش��ϴ� ���α����� ���������� �����Ҽ� �ִ�)+(�޼ҵ� �ȿ��� ������ �� �ִ�.)
	
	public void method1(int num) { //�޼ҵ� ���� ����
		// ��������: �޼ҵ� �������� �ۼ��ϴ� ����
		// �޼ҵ��� ����ο��� �Ұ�ȣ �ȿ� �ִ� �����ϴ� ������: �Ű����� = �Ķ����
		// �Ű������� �޼ҵ� �ȿ� �����Ƿ�,"��������" �̴�.
		
//		int localNum; //��������
//		System.out.println("localNum: "+ localNum);
		//The local variable localNum may not have been initialized
		//�ʱ�ȭ�� �ȵǸ� ������ �߻��Ѵ�.
		//���������� �ʱ�ȭ�� �ʿ��ϴ�.
		
		System.out.println("num: "+num); //�Լ��� ȣ���� �����κ��� num�� ���� �ޱ⶧����. 
		System.out.println("globalNum: "+globalNum);
	}//�޼ҵ� ���� ��

	
	public void method2() {
		//�������� localNum�� �޼ҵ� method1()������ �ش��ϱ� ������, �ٸ� �������� �ش����� �ʴ´�.
		System.out.println(globalNum);
//		System.out.println(localNum);
//		System.out.println(num); //num�� �Ű������� ���� �ʴ´�.
	}
	
	
}//Ŭ���� ������
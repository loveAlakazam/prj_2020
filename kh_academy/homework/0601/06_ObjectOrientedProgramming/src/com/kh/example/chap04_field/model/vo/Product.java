package com.kh.example.chap04_field.model.vo;

public class Product {
	

	
	//jvm�� ���� �ʱ�ȭ
//	private String name;
//	private String brand;
//	private int price;
//	private static int num;

	
	//����� �ʱ�ȭ
	//�ν��Ͻ� ����
	private String name="��������";
	private String brand="������";
	private int price=1500;
	
	private static int num=100; //Ŭ��������
	
	
	//�ν��Ͻ� �ʱ�ȭ
	{
		name="ĭ��";
		price=1000;
		brand="�Ե�";
		num-=10;
	}
	
	
	
	//���α׷� �����ϸ鼭 �� �ѹ� �Ͼ��.
	static{//static�� ��ü���� static�� �Ҵ��ϰ�, ��ü���� �ٷ� ����� ���ִ�.
		
		//�׷��� name, price, brand�� ��ü�� �ʿ��� �ν��Ͻ� �����̴�.
		//�ν��Ͻ� ������ static�ȿ��� �ʱ�ȭ �Ǵ°� �Ұ����ϴ�.
		
		//static�� �ν��Ͻ�(��ü)�� �ֵ� ���� ������� �ҷ��� ����� ���ִ�.
		//�׷��� Ŭ���� �ȿ� static������ �־ �������.-> Ŭ�����̸�.(Ŭ��������/Ŭ�����޼ҵ�)�� �θ��� �Ǵϱ�.
		//�ٷ� ����� �������ϱ� static��.
//			name="ĭ��";
//			price=1000;
//			brand="�Ե�";
			num=150;
			num--;
	}	
	
	
	
	
	//����� �ʱ�ȭ- ���� �������
	public void inform() {
		System.out.println(name+", "+brand+", "+ price+", "+ num);
	}
	
}

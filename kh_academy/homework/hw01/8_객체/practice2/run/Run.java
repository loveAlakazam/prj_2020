package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;
public class Run {
	
	public static void main(String [] args) {
		// ��ü�� ����
		
		// �⺻ ������ ȣ�� 
		Product product1= new Product();
		product1.information(); 
		
		// ������2 ȣ��
		Product product2= new Product("�Ƹ޸�ī��");
		product2.information();
		
		// �����ε��� �޼ҵ� information ȣ��
		int dollarPrice=product2.information(2800);
		System.out.println("�޷�����: "+ dollarPrice);
		
		// ������4 ȣ��
		Product product3= new Product(2800);
		product3.information();
		
		// ������6 ȣ��
		Product product4= new Product("7gram", "�Ƹ޸�ī��");
		product4.information();
		
		//������7 ȣ��
		Product product5= new Product("��Ÿ����","�ݵ���",4100);
		product5.information();
		
		
	}
}

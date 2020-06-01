package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.controller.A_KindsOfVariable;
import com.kh.example.chap04_field.controller.B_KindsOfVariable;
import com.kh.example.chap04_field.model.vo.Product;

public class Run {
	public static void main(String [] args) {
//		A_KindsOfVariable ak= new A_KindsOfVariable();
//		int insNum=ak.instanceNum; //��ü�� (�ʵ�)�ν��Ͻ� ����ȣ��
//		
//		int staticNumWrong=ak.staticNum; //����
//		//(warning message) The value of the local variable staticNumWrong is not used
//		//�ǹ̾��� ������ ������ٴ� ��� �޽���
//		//���°��� ���ٸ�..
//		
//		//staticNum�� ���޽���
//		//The static field A_KindsOfVariable.staticNumWrong should be accessed in a static way
//		// static�ʵ��  (Ŭ�����̸�).(Ŭ��������) �� ����ϴ°� ����.
//		System.out.println(staticNumWrong); //����ߴ�.
//		
//		//static �ʵ��� �ùٸ� ���
//		//(Ŭ�����̸�).(Ŭ��������)
//		int staticNumRight=A_KindsOfVariable.staticNum;
//		System.out.println(staticNumRight);
//		
//		B_KindsOfVariable bkv= new B_KindsOfVariable();
////		bkv.method1(10);
		
		
		Product p=new Product();
		p.inform();
		//jvm�� ���� �ʱ�ȭ null, null, 0, 0
		//������ʱ�ȭ (���� ���� ���� �ʱ�ȭ) => ��������, ������, 1500, 100
		
		//�ʱ�ȭ ��� (�ν��Ͻ� �ʱ�ȭ) => ĭ��, �Ե�, 1000, 90
		
		Product p1=new Product();
		p1.inform();
		//���ѹ� �ν��Ͻ� �ʱ�ȭ => ĭ��, �Ե�, 1000, 80 (���α׷� �������������� ������� ����)
		
		
		Product p2=new Product();
		p2.inform();//ĭ��, �Ե�, 1000, 80 (���α׷� �������������� ������� ����)
		
		
		
		
		
	}
}

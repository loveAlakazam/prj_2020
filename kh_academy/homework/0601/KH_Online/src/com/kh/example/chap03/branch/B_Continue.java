package com.kh.example.chap03.branch;

public class B_Continue {
	//continue���� �Ʒ��� �ִ� �ڵ带 �������� �ʰ�
	//�ٷ� �����ĶǴ� ���ǽ����� �ǳʶڴ�.
	
	public void method1() {
		//1~100������ ���� �հ����
		//4�� ��� ���� ���
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%4==0)
				continue;
			System.out.println("i: "+i);
			sum+=i;
		}
		System.out.println("4�ǹ���� ������ ������ ���ڵ�����: "+sum);
	}
}

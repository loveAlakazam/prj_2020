package com.kh.example.chap03.branch;

import java.util.Scanner;

public class A_Break {
	//break���� ���尡��� �ݺ����� ����������.
	public void method1() {
		//���ڿ��� �Է¹޾Ƽ� ���ڰ����� ����Ѵ�.
		//��, end�Է��ϸ� �ݺ��� ����
		//do while���
		
		//���ڿ��� �Է¹޴´�.
		Scanner sc= new Scanner(System.in);
		String str=null;
		do {
			System.out.print("���ڿ� �Է�: ");
			str= sc.nextLine();
			
			//�Է��� ���ڰ� end�϶� ������.
			//���尡��� �ݺ�������������
			if(str.equals("end"))
				break;
			
			//���ڰ��� �Է�
			System.out.println(str+"���ڰ���: "+ str.length());
		}while(true);
	}

}

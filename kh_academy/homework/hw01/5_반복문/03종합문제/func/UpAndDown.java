package com.kh.practice.comp.func;
import java.util.Scanner;

public class UpAndDown {
	//���ǹ�-�ݺ��� ���չ���
	//�ǽ����� 5
	public void upDown() {
		//1���� 100������ ������ ������ ������ ��������
		//����ڴ� ������ ������ ���ߴµ� ������� ������� ����ϼ���.
		
		/*
		 * Math.random()
		 * ��ȯŸ��: double
		 * 0�̻� ~1�̸��� ���� ������.
		 * 
		 * 
		 * Math.random()*100+1
		 * 1�̻� ~101�̸��� ���� ����
		*/
		//�������� (��)
		int randomNumber=(int)(Math.random()*100+1);
		
		//����� �Է¼���
		Scanner sc=new Scanner(System.in);
		int userNumber;
		int correctCnt=0; //����Ƚ��
		do {
			//����� �Է� ����
			System.out.print("1~100������ ������ ������ ���纸����: ");
			userNumber=sc.nextInt();
			
			//����� �Է¼��ڰ� 1���� �۰ų� 100���� ũ�ٸ�
			if(userNumber<1 || userNumber>100) {
				System.out.println("1~100������ ���ڸ� �Է����ּ���.");
				continue; //�Ʒ��ڵ�� �������� �ʰ� �������� �Ѿ.
			}
			
			//1�̻��̶��
			if(userNumber>randomNumber) {//����� �Է¼��ڰ� �������ں��� �۴ٸ�
				System.out.println("DOWN !");
			}else if(userNumber<randomNumber) {//����� �Է¼��ڰ� �������ں��� ũ�ٸ�
				System.out.println("UP !");
			}
			//ī��Ʈ
			correctCnt++;
		}while(userNumber!=randomNumber);
		//������Է¼��ڿ� ������ڰ� ���� ������ �ݺ�
		//������ ����������.
		System.out.println("�����Դϴ�!");
		System.out.println(correctCnt+"ȸ���� ���߼̽��ϴ�!");
	}
}

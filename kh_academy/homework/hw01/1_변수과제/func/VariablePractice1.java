package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public void introduceMe() {
		
		//����ڷκ��� �Է��� �޴´�.
		//�Է��� �������� Scanner ��ü�� ȣ���ؾ��Ѵ�.
		//Scanner��ü�� java���� > util���� �ȿ� ����ִ�.
		// java.util.Scanner �� import�ؾ� ����� �� �ִ�.
		
		Scanner sc = new Scanner(System.in); //����ڷκ��� �����͸� �Է��� ��������, ǥ���Է� System.in�� �ʿ�.
		
		
		//���ڿ� �Է��� sc.next()�� sc.nextLine()�� �����Ѵ�.
		//sc.next()�� ����, \n�� ���� white-space�� ������ ���ڿ��� �Է¹��� �� �ִ�.
		//��, ���Ը����ڸ� ���� �Է��� ���ڿ��� "����� ������ ��ȣ��"�̶�� �ϸ�,  sc.next()�� ���� "�����"�� �Է¹޴� ���̴�.
		
		//�ݸ�, sc.nextLine()�� ���⸦ ������ ���ڿ��� �Է¹��� �� ������
		// \n�� ���� �Է��� �޴´�.
		// \n�� ��쿡�� �ι���(\0)�޾Ƶ鿩��, \n�� ���������� �Ѵ�.
		//�̸�
		System.out.print("�̸��� �Է��ϼ���: "); // System.out.print()�� ����ִ� ���ڿ��� �� �� ������, ������ "���"�� �Ѵ�.
		String name= sc.nextLine();
		
		//����
		// ���� ���ڿ��� ��ü�� �Է¹����ڿ�, 
		// ���ڿ� String ��ü�� ����� �޼ҵ��� �ϳ��� charAt(�ε�����ȣ) �� �̿��Ѵ�.
		// charAt�� ()��ȣ �ȿ��� zero-index����� ���ڿ��� ����.
		// zero-index��� ���ڿ��̶�, ���ڿ��� �ε����� 0���� �����Ѵٴ� ���� �ǹ��Ѵ�.
		System.out.print("������ �Է��ϼ���(��/��): ");
		char gender= sc.nextLine().charAt(0); // �Է¹��� ���ڿ� sc.nextLine()�� 0��° �ε����� �ش��ϴ� ���ڸ� ����.
		
		//����
		// sc.nextInt()�� ��쿡�� \n�� �޾Ƶ����� �ʴ´�.
		System.out.print("���̸� �Է��ϼ���: ");
		int age= sc.nextInt();
		
		//age�Է¿��� nextInt()�� �޾Ƶ����� ���ؼ� ���� \n���ڿ���  ���ۿ� �����ִ�.
		//���ۿ� �����ִ� \n�� ����.
		sc.nextLine();
		
		//Ű
		System.out.print("Ű�� �Է��ϼ���.(cm): ");
		double height= sc.nextDouble();
		
		//nextDouble()�Լ����� ���޾Ƶ��� \n�� ���ۿ� �����Ƿ�
		//���۸� ����.
		sc.nextLine();
		
		//�Է¹��������� ���
		System.out.printf("Ű %.1fcm�� %d���� %c�� %s�� �ݰ����ϴ�^^",height, age, gender, name);
	}
}

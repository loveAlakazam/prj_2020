package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	public void method1() {
		// Ű����� ���� ���ڿ� ���� �Է¹޾� ��� �ݺ� ����
		Scanner sc = new Scanner(System.in);

		// exit���ڿ��� ������ �ݺ��� ����
		String str=null;
		while(!str.equals("exit")) {
			System.out.print("���ڿ� �Է�: ");
			str=sc.nextLine();
			
			System.out.println("���� �Է� ���ڿ�: "+ str);
		}
		System.out.println("�����մϴ�.");

		// do -while
//		String str = null;
		do {
			System.out.print("���ڿ� �Է�: ");
			str = sc.nextLine(); // ���� str�� ����ڰ� �Է��� ���ڿ��� ����Ű�Եȴ�.
			System.out.println("���� �Է��� ���ڿ�: " + str);
		} while (!str.equals("exit"));
		System.out.println("�ý����� �����մϴ�.");
	}

	public void method2() {
		// �޴� �ݺ�����
		Scanner sc = new Scanner(System.in);

//		System.out.print("�޴� �Է�: ");
//		int menuNum = sc.nextInt();
		// �ڵ� �ٹٲ� ctrl+shift+f
		int menuNum;
		menuNum = 0;
		do {
			System.out.println();
			System.out.println("1. �׽�Ʈ1");
			System.out.println("2. �׽�Ʈ2");
			System.out.println("3. �׽�Ʈ3");
			System.out.println("9.  ����  ");
			System.out.print("�޴� �Է�: ");
			menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:
				System.out.println("1���");
				break;
			case 2:
				System.out.println("2���");
				break;
			case 3:
				System.out.println("3���");
				break;
			case 9:
				System.out.println("�����մϴ�.");
				break;
			default:
				System.out.println("�߸� �Է��߽��ϴ�.");
			}
		} while (menuNum != 9); // ������ 9�� �ƴϸ� ��ӽ���.
		// menuNum cannot be resolved to a variable
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);
		int menuNum;
		menuNum = 0;
		do {
			System.out.println();
			System.out.println("1. �׽�Ʈ1");
			System.out.println("2. �׽�Ʈ2");
			System.out.println("3. �׽�Ʈ3");
			System.out.println("9.  ����  ");
			System.out.print("�޴� �Է�: ");
			menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:
				System.out.println("1���");
				break;
			case 2:
				System.out.println("2���");
				break;
			case 3:
				System.out.println("3���");
				break;
			case 9:
				System.out.println("�����մϴ�.");
				return;
				/*
				 * return : 
				 * */
				
			default:
				System.out.println("�߸� �Է��߽��ϴ�.");
			}
		} while (true); // ������ 9�� �ƴϸ� ��ӽ���.
//		System.out.println("terminated"); 
		//Unreachable code - ���ѷ������� �����Ҽ� ���� �ڵ�
	}
}

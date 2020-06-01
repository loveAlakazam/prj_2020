package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 * for(�ʱ��;���ǽ�; ������){ �����ڵ�; }
	 * 
	 * ���ǽ� ����� false�� �ɶ����� �ݺ��Ѵ�.
	 * 
	 * �ʱ�� , ���ǽ�, ������ -> �������� for(;;){} �ʱ��, ���ǽ�, �������� �����ϴ��� for���� ���� �ȿ� ������ �κ���
	 * ����Ͽ� ��Ÿ�������. �ᱹ for()�ȿ����� �����ɻ� ��� �ʿ��� ���
	 */
	public void method() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("i: " + i);
		}
	}

	public void method1_1() {
		// �ڱ� �Ұ� 5���ϱ�
		for (int i = 0; i < 5; i++) {
			System.out.println("���̸��� �������̾�.");
		}
	}

	public void method2() {
		for (int i = 5; i > 0; i--) {
			System.out.println("i: " + i);
		}
	}

	public void method2_1() {
		for (int i = 8; i >= 3; i--) {
			System.out.println("i: " + i);
		}
	}

	public void method3() {
		// 1~10������ Ȧ���� ����ϱ�
		for (int i = 1; i <= 10; i += 2) {
			System.out.println("Ȧ��: " + i);
		}
	}

	public void method3_1() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println("Ȧ��: " + i);
			}
		}
	}

	// ����2���� �޾Ƽ� �� ������ ���ڸ� �޴´�.
	public void method4() {
		// �ΰ����� 3, 6 => 3,4,5,6
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ����: ");
		int start = sc.nextInt();

		System.out.print("�ι�° ����: ");
		int end = sc.nextInt();

		int max; // �μ����� ū ��
		int min; // �μ����� ������
		if (start > end) {
			max = start;
			min = end;
		} else {
			max = end;
			min = start;
		}
		for (int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}

//		//�ʱ���� �����Ѵ�.
//		for(;start<=end; start++) {
//			System.out.println("start: "+ start);
//		}

//		int min=(start<=end)?start: end;
//		int max=(start>end)?start: end;
//		
//		for(int i=min; i<=max; i++) {
//			System.out.print(i+" ");
//		}
	}

	public void method4_1() {
		// �����ϳ��� �Է¹޾� �� ���� 1~9������ ���϶���
		// �� ���� ������ ���
		// ������ ���� ������ 1~9 ������ ����� �Է��ؾ��մϴٶ�� ���
		// ex.3 �Է� 3�����

		Scanner sc = new Scanner(System.in);
		System.out.print("1~9������ ����� �Է�: ");
		int dan = sc.nextInt();
		if (dan >= 1 && dan <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " x " + i + " = " + dan * i);
			}
		} else {
			System.out.println("1~9������ ��� �Է����ּ���.");
		}
	}

	public void method5() {
		// 1~10 ������ ������ ������ ���� 1���� ���������� ���� �հ�

		// random(): 0.0~1.0 ������ �Ǽ��� ����.
		// 0�ܰ� : 0.0<=Math.random()<1.0
		// 0.0�� ���� ~ 1.0(������) double���� �����Ѵ�.
//		double random=Math.random();
//		System.out.println(random);

		// 1�ܰ�: 0*10 <=Math.random()*10 <1*10
//		double random=Math.random()*10;
//		System.out.println(random);
//		
		// 1�� 10������ �������ڸ� ����Ѵ�.
		// �׸��� �� �������ڴ� int��
		// random()�� double������ ��ȯ
		// 2�ܰ�
		// 1<= Math.random()*10+1 <11
//		double random=(int)Math.random()*10+1;

		// 3�ܰ� : int�� ��ȯ
		// 1~10������ ������ ����
		int random = (int) (Math.random() * 10 + 1);
//		System.out.println("random Number: "+ random);
		int sum = 0;
		for (int i = 1; i <= random; i++) {
			sum += i;
		}

		System.out.printf("1~%d���� �����հ�: %d", random, sum);
	}

	// ������
	public void method6() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
			System.out.println();
		}
	}

	public void method6_1() {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%2d x%2d=%2d  ", j, i, (j * i));
			}
			System.out.println();
		}
	}

	public void method7() {
		// �Ƴ��α� �ð� 0��0�� ~23�� 59��
		for (int si = 0; si < 24; si++) {
			for (int bun = 0; bun < 60; bun++) {
				System.out.println(si + "�� " + bun + "�� �Դϴ�.");
			}
			System.out.println();
		}
	}

	// ���� 8
	public void method8() {
		// ���ٿ� ��ǥ(*)�� 5�� ���
		// �� ���� ����ڰ� �Է��� ����ŭ ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���� ��: ");
		int inputNum = sc.nextInt();

		for (int i = 0; i < inputNum; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// ����9
	public void method9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� �Է�: ");
		int jul = sc.nextInt();

		System.out.print("ĭ �� �Է�: ");
		int kan = sc.nextInt();

		for (int row = 0; row < jul; row++) {
			for (int col = 0; col < kan; col++) {
				if (row == col) {
					System.out.print(col + 1);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}

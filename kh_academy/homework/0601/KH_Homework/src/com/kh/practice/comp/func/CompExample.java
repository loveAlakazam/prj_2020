package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	// ���ǹ� & �ݺ��� ���չ���

	// �ǽ�����1
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int num = sc.nextInt();

		// ������
		String result = "";
		if (num > 0) {
			// 1~num���� ��/�� ���
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 0) {
					// i�� ¦����� ->"��"
					result += "��";
				} else {
					// i�� Ȧ�����->"��"
					result += "��";
				}
			}
			// ����� ���
			System.out.println(result);

		} else {
			System.out.println("����� �ƴմϴ�.");
		}
	}

	// �ǽ�����2
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		int num;
		String result = "";
		do {
			// �����Է�
			System.out.print("����: ");
			num = sc.nextInt();

			if (num >= 1) {
				// 1�̻��� �����Է�
				for (int i = 1; i <= num; i++) {
					if (i % 2 == 0) {
						// ¦�� -> ��
						result += "��";
					} else {
						// Ȧ��->��
						result += "��";
					}
				}
				System.out.println(result);
				break;// ������Ŀ��� ���ѹݺ��� ����������.
			} else {
				// 1�̸��� �����Է�
				System.out.println("����� �ƴմϴ�.");
			}
		} while (true);
	}

	// �ǽ�����3
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ�: ");
		String str = sc.nextLine();

		System.out.print("����: ");
		char alphabet = sc.nextLine().charAt(0);

		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == alphabet)
				cnt++;
		}
		System.out.println(str + " �ȿ� ���Ե� " + alphabet + "�� ����: " + cnt);
	}

	// �ǽ�����4
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		// ��� �����Ұ���
		char isContinue;
		String isContinueStr;

		// �Է¹��ڿ�
		String str;

		// ���ĺ�
		String alphabetStr;
		char alphabet;

		// �Է��� ���ڿ� str�� alphabet�� ��ִ��� ī��Ʈ
		int cnt;
		do {
			System.out.print("���ڿ�: ");
			str = sc.nextLine();

			System.out.print("����: ");
			alphabetStr = sc.nextLine();
			alphabet = alphabetStr.charAt(0);

			// ���ڿ��� ���ڰ� ���Ե� ����
			// ���࿡ str: Application�̰�, ���ĺ��� A�϶�, A�ǰ����� ���Ϸ���..?
			// a�� A�� ������ ī��Ʈ�ϵ��� �Ѵ�.
			cnt = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.toLowerCase().charAt(i) == alphabetStr.toLowerCase().charAt(0))
					cnt++;
			}
			System.out.println("���� " + alphabet + "�� ���Ե� ����: " + cnt);

			// ���Ͻðڽ��ϱ�?
			do {
				System.out.print("�� �Ͻðڽ��ϱ�?(y/n): ");
				isContinueStr = sc.nextLine().toLowerCase(); // ���ڿ��Է¹޴´�->�ҹ��ڷ� ����
				isContinue = isContinueStr.charAt(0); // �Ǿձ��� �����͸� �����´�.

				switch (isContinue) {
				case 'n':
					return; // practice4()�� ȣ���Ѱ����� ���ư���, �����Լ� ����
				case 'y':
					break; // ����ġ���� ����������.
				default:
					System.out.println("�߸��� ����Դϴ�. �ٽ� �Է����ּ���.");
					continue;
				}
			} while (isContinue != 'y'); // Y,y �̿��� ���ڴ� ����do-while���� �������ü� ����.
		} while (true);
	}
}

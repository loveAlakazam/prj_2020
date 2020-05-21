package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice1 {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();

		String result = (num > 0) ? "����̴�." : "����� �ƴϴ�.";
		System.out.println(result);
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();

		String result = (num > 0) ? "�����." : ((num == 0) ? "0�̴�" : "������");
		System.out.println(result);
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();

		String result = (num % 2 == 0) ? "¦����" : "Ȧ����";
		System.out.println(result);
	}

	public void practice4() {
		// �ο����� ������ ������ Ű����� �Է¹ް�
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� ��: ");
		int personNum = Integer.parseInt(sc.nextLine());

		System.out.print("���� ����: ");
		int candyNum = Integer.parseInt(sc.nextLine());

		// 1�δ� �����ϰ� �������� ������ ������
		// �����ְ� ���� ������ ������ ����ϱ�
		int getCandy = candyNum / personNum;
		int restCandy = candyNum % personNum;

		System.out.println("1�δ� ���� ����: " + getCandy);
		System.out.println("���� ���� ����  : " + restCandy);
	}

	public void practice5() {
		// Ű����� �Է¹��� ������ ������ ���
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸�: ");
		String name = sc.nextLine();

		System.out.print("�г�(����): ");
		int grade = Integer.parseInt(sc.nextLine());

		System.out.print("��(����): ");
		int classNum = Integer.parseInt(sc.nextLine());

		System.out.print("��ȣ(����): ");
		int stdNum = Integer.parseInt(sc.nextLine());

		System.out.print("����(M/F)");
		// �����Է�
		char gender = sc.nextLine().toUpperCase().charAt(0);
		gender = (gender == 'M') ? '��' : '��';

		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����): ");
		double score = Double.parseDouble(sc.nextLine());

		// ����� �������� ȭ�����
		System.out.printf("%d�г� %d�� %d�� %s %c�л��� ������ %.2f�̴�.", grade, classNum, stdNum, name, gender, score);
	}

	public void practice6() {
		// ���̸� Ű����� �Է¹޴´�
		System.out.print("����: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		// 13�� �����ΰ�? "���": ( (19�������ΰ�?) "û�ҳ�":"����")
		String isStudent = (age <= 13) ? "���" : ((age <= 19) ? "û�ҳ�" : "����");
		System.out.println(isStudent);
	}

	public void practice7() {
		// ���� ���� ���� ������ Ű����� �Է��Ѵ�.(�����Է�)
		int kor, eng, mat;
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		kor = Integer.parseInt(sc.nextLine());

		System.out.print("����: ");
		eng = Integer.parseInt(sc.nextLine());

		System.out.print("����: ");
		mat = Integer.parseInt(sc.nextLine());

		System.out.println();
		// ������ ���� �հ�� ����� ���Ѵ�.
		double avg = kor + eng + mat;
		System.out.println("�հ�: " + avg);
		avg /= 3;

		System.out.printf("���: %.2f\n", avg);

		String isPass = ((kor >= 40 && eng >= 40 && mat >= 40) && (avg >= 60)) ? "�հ�" : "���հ�";
		System.out.println("���: "+isPass);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		// �ֹε�Ϲ�ȣ�� �Է�.
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����):");
		char genderNum = sc.nextLine().charAt(7);
		String getGender = (genderNum == '2') ? "����" : "����";
		System.out.println(getGender);
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		// �ΰ��� ������ �Է¹޴´�.
		System.out.print("����1: ");
		int num1 = sc.nextInt();

		System.out.print("����2: ");
		int num2 = sc.nextInt();

		System.out.print("�Է�: ");
		int inputNum = sc.nextInt();

		// ���� 1: inputNum<=num1
		// ����2: inputNum>num2
		// (����1) || (����2)
		boolean result = ((inputNum <= num1) || (inputNum > num2)) ? true : false;
		System.out.println("���: " + result);
	}

	public void practice10() {
		// 3���� ���� Ű����� �Է¹޴´�.
		Scanner sc = new Scanner(System.in);

		// �迭�� ������.
		int nums[] = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("�Է�"+(i+1)+": ");
			nums[i] = Integer.parseInt(sc.nextLine());
		}
		// �Է¹��� �� ��ΰ� ������?
		boolean isSame = (nums[0] == nums[1]) && (nums[0] == nums[2]) && (nums[1] == nums[2]);
		boolean result = (isSame) ? true : false;
		System.out.println("���� ��� ������? :" + result);
	}

	// ������ 3000���� �̻����� Ȯ���ϴ� �Լ�
	public String overThirtyThousand(double money) {
		String result = (money >= 3000) ? "3000 �̻�" : "3000 �̸�";
		return result;
	}

	public void practice11() {
		// a,b,c ����� ������ �Է¹޴´�.
		Scanner sc = new Scanner(System.in);
		System.out.print("A����� ����: ");
		int aMoney = Integer.parseInt(sc.nextLine());
		double aInst = aMoney * 1.4;

		System.out.print("B����� ����: ");
		int bMoney = Integer.parseInt(sc.nextLine());
		double bInst= bMoney;
		
		System.out.print("C����� ����: ");
		int cMoney = Integer.parseInt(sc.nextLine());
		double cInst= cMoney*1.15;
		
		
		// �� ����� �μ�Ƽ�긦 ������ ������ ����Ѵ�.
		System.out.printf("A��� ����/����+a: %d/%.1f\n", aMoney, aInst);
		// �μ�Ƽ�� ���Ա޿��� 3000���� �̻��̸� "3000�̻�", �ƴ϶�� "3000�̸�"���
		System.out.println(overThirtyThousand(aInst));

		// B���
		System.out.printf("A��� ����/����+a: %d/%.1f\n", bMoney, bInst);
		System.out.println(overThirtyThousand(cInst));

		// C���
		System.out.printf("A��� ����/����+a: %d/%.1f\n", cMoney, cInst);
		System.out.println(overThirtyThousand(cInst));

		
	}
}

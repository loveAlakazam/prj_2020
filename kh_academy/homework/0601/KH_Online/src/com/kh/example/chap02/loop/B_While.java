package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*
	 * while(���ǽ�){ ���๮��; [���ǽ� or �б⹮]; }
	 * 
	 * ���ǽ�-> (���ǽ� true�϶�) -> ���๮��-> ������ (�ݺ�) ���ǽ��� false�� �ɶ����� �ݺ��� �ݺ�.
	 */

	public void method1() {
//		for(int i=1; i<=5; i++) {
//			System.out.println("i: "+i);
//		}

		int i = 1;
		while (i <= 5) {
			System.out.println("i��° �ݺ��� ����: " + i);
			i++;
		}
	}

	public void method2() {
		int i = 5;
		while (i > 0) {
			System.out.println("i: " + i);
			i--;
		}
	}

	public void method3() {
		int i = 0;
		while (i <= 10) {
			if (i % 2 != 0)
				System.out.println("Ȧ��: " + i);
			i++;
		}

		i = 1;
		while (i <= 10) {
			System.out.println("Ȧ��: " + i);
			i += 2;
		}
	}

	public void method4() {
		// ���� �ΰ��� �Է¹޾Ƽ� �� ���� ���ڸ� ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("����1: ");
		int start = sc.nextInt();

		System.out.print("����2: ");
		int end = sc.nextInt();
		int max, min;
		if (start > end) {
			max = start;
			min = end;
		} else {// start<=end
			max = end;
			min = start;
		}

		while (min <= max) {
			System.out.print(min + " ");
			min++;
		}
	}

	public void method4_1() {
		// ���� �ϳ��� �Է¹޾� �� ���� 1~9 ������ ���϶��� ������ ���
		// ������ ���� ������ 1~9������ ����� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9 ������ ���� �Է�: ");
		int num = sc.nextInt();

		if (num >= 1 && num <= 9) {
			int i = 1;
			while (i < 10) {
				System.out.println(i + "*" + num + "=" + (i * num));
				i++;
			}
		} else {
			System.out.println("1~9 ������ ����� �Է����ּ���.");
		}

	}

	public void method5() {
		// 1~10���� ������ ������ ���ؼ� 1���� ������ ���� �հ�
		Scanner sc = new Scanner(System.in);
		int randNum = (int) (Math.random() * 10 + 1);
		int sum = 0;
		int i=0;
		while(i<=randNum) {
			sum += i;
			i++;
		}
		System.out.println("result: " + sum);
	}

	public void method6() {
		// ���ڿ��� �Է¹޾Ƽ� �ε������� �������
		// apple
		// 0: a
		// 1: p
		// 2: p
		// 3: l
		// 4: e
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		for (int i = 0; i < inputString.length(); i++) {
			System.out.println(i + ": " + inputString.charAt(i));
		}

		int i = 0;
		while (i < inputString.length()) {
			System.out.println(i + ": " + inputString.charAt(i));
			i++;
		}
	}

	public void method7() {
		// ��ø while�� : while�� �ȿ� while��
		int dan = 2;
		while (dan < 10) {
			int i = 1;
			while (i < 10) {
				System.out.printf("%d * %d = %d\n", dan, i, i * dan);
				i++;
			}
			System.out.println();
			dan++;
		}
	}

	public void method8() {
		// �Ƴ��α� �ð�
		int si = 0;
		int bun;
		while (si < 24) {
			bun = 0;
			while (bun < 60) {
				System.out.println(si + "��" + bun + "��");
				bun++;
			}
			si++;
			System.out.println();
		}
	}

	public void method9() {
		// ���ٿ� ��ǥ(*)�� 5�� ���
		// �� ���� ����ڰ� �Է��� ����ŭ ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���� ��: ");
		int inputNum = sc.nextInt();
		
		int i=0;
		int j;
		while(i<inputNum) {
			j=0;
			while(j<5) {
				System.out.print("*");
				j++;
			}
			i++;
		}
	}

	public void method10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� �Է�: ");
		int jul = sc.nextInt();

		System.out.print("ĭ �� �Է�: ");
		int kan = sc.nextInt();
		
		int row, col;
		row=0;
		while(row<jul) {
			col=0;
			while(col<kan) {
				if(row==col)
					System.out.print(col + 1);
				else
					System.out.print("*");
				col++;
			}
			row++;
		}

	}
}

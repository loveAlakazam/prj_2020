package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	// �ǽ����� 1
	public void practice1() {
		// ����ڷκ��� �Ѱ��� ���� �Է¹޾�
		// �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
		Scanner sc = new Scanner(System.in);

		System.out.print("1 �̻��� ���ڸ� �Է��ϼ���: ");
		int inputNum = sc.nextInt();
		// ��, �Է��� ���� 1���� ũ�ų� ���ƾ��մϴ�.
		if (inputNum >= 1) {
			for (int i = 1; i <= inputNum; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		}
		System.out.println();
	}

	// ����2
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		int inputNum;

		// 1�̸��� ���� �Է��Ѵٸ�
		// �ٽ� �Է��ش޶�� �Ѵ�.
		while (true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ���: ");
			inputNum = sc.nextInt();

			// 1�̻��� ���ڸ� �Է��ϸ�-> �ݺ����� ����������.
			if (inputNum >= 1) {
				for (int i = 1; i <= inputNum; i++) {
					System.out.print(i + " ");
				}
				break;
			}
			// 1�̸��̸� ��� ���ѷ���
		}
	}

	// �ǽ�����3
	public void practice3() {
		// ����ڷκ��� �Ѱ��� ���� �޾� 1���� �� ���ڱ�����
		// ��� ���ڸ� �Ųٷ� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ���: ");

		int inputNum = sc.nextInt(); // �ʱ��
		while (inputNum >= 1) {// ���ǽ�
			System.out.print(inputNum + " ");
			inputNum--; // ������
		}
	}

	// �ǽ�����4
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		int inputNum;
		do {
			// ���� �Է�
			System.out.print("1�̻��� ���ڸ� �Է��ϼ���: ");
			inputNum = sc.nextInt();

			// 1�̻� ���ڸ� �Է��ϸ� -> �Ųٷ���� and break
			if (inputNum >= 1) {
				for (int i = inputNum; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			}
		} while (true);
	}

	// �ǽ�����5
	public void practice5() {
		// 1���� ����ڷκ��� �Է¹��� �������� �������� ���� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��ϼ���: ");
		int userNum = sc.nextInt(); // 1���� ���� ���ڰ� ���ü� �����Ƿ�

		int start, end;
		start = (userNum > 1) ? 1 : userNum;
		end = (userNum > 1) ? userNum : 1;

		int sum = 0;
		String equation = "";
		while (start <= end) {
			sum += start;

			if (start < 0) { // start�� �������
				equation += "(" + start + ") + ";
			} else {// start�� 0�̻� ������
					// end�� start�� ���ٸ�
				if (start == end)
					equation += (start + " + = ") + sum;

				// end�� start�� ���� �ʴٸ�
				else
					equation += start + " + ";
			}
			start++;
		}
		System.out.println(equation);
	}

	// �ǽ�����6
	public void practice6() {
		// ����ڷκ��� 2���� ���� �Է¹޾Ƽ�
		// �� ������ ���ڸ� ��� ����ϼ���.
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ����: ");
		int num1 = sc.nextInt();

		// ù��° ���ڰ� 1�̸��ΰ�?
		if (num1 < 1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���!");
		} else {
			System.out.print("�ι�° ����: ");
			int num2 = sc.nextInt();

			// 2��° ���ڰ� 1�̸��ΰ�?
			if (num2 < 1) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���!");
			} else {

				// ù��°����~�ι�°���� ���
				// num1�� num2�� �������� start�� �Ѵ�.
				int start = Math.min(num1, num2);

				// num1�� num2�� ū���� end���Ѵ�.
				int end = Math.max(num1, num2);

				for (int i = start; i <= end; i++) {
					System.out.print(i + " ");
				}
			}
		}
	}

	// �ǽ�����7
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		while (true) {
			// ù��° ����, �ι�° ���� �Է��� �Ѵ�.
			System.out.print("ù��° ����: ");
			num1 = sc.nextInt();

			System.out.print("�ι�° ����: ");
			num2 = sc.nextInt();

			// ���� �ΰ� ��� 1�̻��� ���ڶ�� -> ����ϰ� -> break
			if (num1 >= 1 && num2 >= 1) {
				int start = (num1 < num2) ? num1 : num2;
				int end = (num1 > num2) ? num1 : num2;
				for (int i = start; i <= end; i++)
					System.out.print(i + " ");
				break;
			}

			// �����ϳ��� 1�̻��� ���ڰ� �ƴ϶��
			System.out.println("1�̻��� ���ڸ� �Է����ּ���!");
		}
	}

	// �ǽ�����8
	public void practice8() {
		// ���ڸ� �Է¹޴´�.
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int num = sc.nextInt();

		// �Է¹��� ������ ���� ��� �Ѵ�.
		System.out.printf("===== %d�� =====\n", num);
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + "= " + (num * i));
		}
	}

	// �ǽ�����9
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		// �����Է�
		System.out.print("����: ");
		int num = sc.nextInt();
		// num�� ���� 9�����̸�, ���
		if (num <= 9) {
			for (int dan = num; dan <= 9; dan++) {
				System.out.printf("===== %d�� =====\n", dan);

				for (int i = 1; i <= 9; i++)
					System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
			}
		} else {
			System.out.println("9������ ���ڸ� �Է��ϼ���.");
		}
	}

	// �ǽ�����10
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			// ���ڸ� �Է¹޴´�.
			System.out.print("����: ");
			num = sc.nextInt();

			if (num <= 9)
				break;
			else {
				// 9���� ũ��.
				// �ٽ� �Է¹޴´�.
				System.out.println("9������ ���ڸ� �Է����ּ���.");
			}
		} while (true);

		for (int dan = num; dan <= 9; dan++) {
			System.out.printf("===== %d�� =====\n", dan);
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
			}
		}
	}

	// �ǽ�����11
	public void practice11() {
		// ����ڷκ��� ���ۼ��ڿ� ������ �Է¹޾�
		// ������ ������ ���ڰ� Ŀ���ų� �۾����� ���α׷��� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ����: ");
		int startNum = sc.nextInt();

		System.out.print("����: ");
		int diff = sc.nextInt();

		// ���ۼ��ڰ����� sum�ʱ�ȭ.
		int sum = startNum;
		for (int i = 1; i <= 10; i++) {
			System.out.print(sum + " ");
			sum += diff; // ������ŭ ��� ���س�����.
		}
	}

	// �ǽ�����12
	public void practice12() {
		// �����ڸ� �Է¹޴´�.
		// exit ���ö����� ���ѹݺ��� �Ѵ�.
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("������(+, -, *, /, %) : ");
			String operatorStr = sc.next(); // ���ڿ�

			// ���� operatorStr�� exit�̶��
			if (operatorStr.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				return; // ����������, ȣ���Ѱ��� �ƹ��͵� ���� ���� ��ȯ�Ѵ�.
			}

			// exit�� �ƴ϶��-> operatorStr�� 0��° �ε����� ���ڸ� �����´�.
			char op = operatorStr.charAt(0);

			// ������ �Է¹޴´�.
			System.out.print("����1: ");
			int num1 = sc.nextInt();

			System.out.print("����2: ");
			int num2 = sc.nextInt();

			switch (op) {
			case '+':
				System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1 + num2));
				break;

			case '-':
				System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1 - num2));
				break;

			case '/': {
				// ���� num2�� 0�̶��
				if (num2 == 0) {
//					System.out.println(num1/num2); // ArithmeticException �߻�.
					System.out.println("0���� ������ �����ϴ�. �ٽ� �Է����ּ���.");
					break;
				}
				System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1 / num2));
			}
				break;

			case '%': {
				// ���� num2�� 0�̶��
				if (num2 == 0) {
					System.out.println("0���� ������ �����ϴ�. �ٽ� �Է����ּ���.");
					break;
				}
				System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1 % num2));
			}
				break;

			case '*':
				System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1 * num2));
				break;

			default:
				System.out.println("���� �������Դϴ�. �ٽ��Է����ּ���.");
			}
			System.out.println();
		}
	}

	// �ǽ�����13
	public void practice13() {
		Scanner sc= new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num= sc.nextInt(); 
		
		if(num>0) {
			//�Է��� num�� ���� �������
			for(int i=0; i<=num ;i++) {
				for(int j=0; j<i;j++)
					System.out.print('*');
				System.out.println();
			}
		}else {
			System.out.println("���� ������ �Է����ּ���!");
		}
	}

	// �ǽ�����14
	public void practice14() {
		//(��ü ����) �ƴϸ� �Է��� ������ ������ �ٷ��Ͽ� *�� ����
		Scanner sc= new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num=Math.abs(sc.nextInt()); //�Է��� ������ ����
		for(int i=num; i>0 ;i--) {
			for(int j=0; j<i; j++)
				System.out.print('*');
			System.out.println();
		}
	}

}

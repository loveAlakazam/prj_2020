package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice2 {
	// �ݺ��� hard����
	// �ð����⵵: O(N)
	// �ǽ�����15
	public boolean isPrimary(int num) {
		// �Ҽ�: ����� 1�� �ڱ��ڽ��� ���� �ǹ��Ѵ�.
		// 2���� ū �����̰�, ¦����� -> �Ҽ��� �ƴϴ�.
		if (num > 2 && num % 2 == 0) {
			return false;
		}

		int cnt = 0; // num�� ����������� �� ���� ī��Ʈ
		for (int i = 1; i <= num; i++) {
			// 1�� num�̿ܿ� ����������� ���� �����Ѵٸ� false
			if (num % i == 0)
				cnt++;
		}
		return (cnt == 2) ? true : false;
	}

	// �����佺�׳׽� ü�� �̿��� �Ҽ� ���ϱ�.
	// �־�: O(N^2)
	public boolean isPrimary_era(int num) {
		// 1.�迭�� �����Ͽ� �ʱ�ȭ �Ѵ�.
		int arr[] = new int[num + 1];
		for (int i = 2; i <= num; i++) {
			arr[i] = i;
		}

		// 2. 2���� �����ؼ� Ư������ ����� �ش��ϴ� ���� ��� �����.
		for (int i = 2; i <= num; i++) {
			// ������ ���� 0�̶�� �ǳʶڴ�.
			if (arr[i] == 0)
				continue;

			// �̹� ������ ���� 0�� �ƴ϶��
			// �׹������ ����Ͽ�, ������ ��� ���� �����
			for (int j = 2 * i; j <= num; j += i)
				arr[j] = 0;
		}

		// 3. arr[num]�� 0�̸� -> �Ҽ��� �ƴϰ�
		// arr[num]�� 0�̾ƴѼ���� -> �Ҽ��̴�.
		return (arr[num] == 0) ? false : true;

	}

	public void practice15() {
		// ����ڷκ��� �Է¹��� �ϳ��� ���� �Ҽ����� �Ǻ��ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int inputNum = sc.nextInt();

		// �Է��� ���ڰ� 2���� �������
		if (inputNum < 2) {
			System.out.println("�߸� �Է��߽��ϴ�.");
		} else {
			// �Է��� ���ڰ� 2�̻��ΰ��.
			// �Ҽ�
			if (isPrimary(inputNum))
				System.out.println("�Ҽ� �Դϴ�.");

//			// �����佺�׳׽��� ü�� �̿��� �Ҽ����ϱ�
//			if (isPrimary_era(inputNum))
//				System.out.println("�Ҽ� �Դϴ�.");

			// �Ҽ��� �ƴϴ�.
			else
				System.out.println("�Ҽ��� �ƴմϴ�.");
		}
	}

	// �ǽ�����16
	public void practice16() {
		// �Է��� ���ڰ� 2���� ���� �����ΰ��
		// ����ڰ� �ٽ� �Է��ϵ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		int inputNum;
		do {
			// �����Է�
			System.out.print("����: ");
			inputNum = sc.nextInt();

			// 2�̻��� ���ڸ� �Է��� ���
			if (inputNum >= 2) {
				if (isPrimary(inputNum)) {// �Ҽ�
					System.out.println("�Ҽ��Դϴ�.");
				} else {// �Ҽ��� �ƴ�
					System.out.println("�Ҽ��� �ƴմϴ�.");
				}
				return; // �ݺ����� �����.
			}

			// 2�̸��� ���ڸ� �Է��� ���
			System.out.println("�߸� �Է��߽��ϴ�.");
		} while (true);
	}

	// �ǽ�����17
	public void practice17() {
		// 2���� ����ڰ� �Է��� �������� �Ҽ��� ��� ����ϰ�
		// �Ҽ��� ������ ���
		// ��, 2���� ���� ���� �߸��Է��ߴٰ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int inputNum = sc.nextInt();
		if (inputNum < 2) {
			// 2���� ���� ���
			System.out.println("�߸� �Է��߽��ϴ�.");
		} else {
			// 2�̻��� ���� �Է�
			// 2~�Է��� �������� �Ҽ��� ����ϰ�
			// �Ҽ����� ī��Ʈ
			int primaryCnt = 0;
			for (int i = 2; i <= inputNum; i++) {
				// i�� �Ҽ����
				if (isPrimary(i)) {
					System.out.print(i + " ");
					primaryCnt++;
				}
			}
			System.out.printf("\n2���� %d������ �Ҽ��� ������ %d���Դϴ�.\n", inputNum, primaryCnt);
		}

	}

	// �ǽ�����18
	public void practice18() {
		// 1���� ����ڿ��� �Է¹��� ������ �߿���
		// 2�� 3�� ��� ��� ����ϰ�
		// 2�� 3�� ������� ������ ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ��� �ϳ��� �Է��ϼ���: ");
		int num = sc.nextInt();

		String numbers = "";

		if (num > 0) {
			// 2�� 3�� ����� ��� ���
			int commonCnt = 0; // ������� ī��Ʈ
			for (int i = 2; i <= num; i++) {
				if (i % 2 == 0 || i % 3 == 0) {
					numbers += (i + " ");

					// 2�� 3�� ��� ����������� ����.(2��3�� �����)
					// 2��3�� �ּҰ������ 6�̴�. if(i%6==0)
					if (i % 2 == 0 && i % 3 == 0)
						commonCnt++;
				}
			}

			System.out.println(numbers);
			System.out.println("count: " + commonCnt);
		} else {
			System.out.println("�ڿ����� �Է����ּ���!");
		}
	}

	// �ǽ����� 19
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num = Math.abs(sc.nextInt()); // �����Է�(����)
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < num; j++) {
				if (j < num - i)
					System.out.print(' ');
				else
					System.out.print('*');
			}
			System.out.println();
		}
	}

	// �ǽ����� 20
	public void practice20() {
		Scanner sc= new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num=Math.abs(sc.nextInt());//������
		int rows=num*2-1; //�ళ��
		for(int r=1; r<=rows; r++) {
			if(r<=num) {
				//���ȣ(1���ͽ���)�� num���� �������
				for(int c=0; c<r; c++)
					System.out.print('*');
			}else {
				//���ȣ�� num���� ū���: c-num�� ���� 0���� ũ��.
				for(int c=r; 2*num-c>0; c++)
					System.out.print('*');
			}
			System.out.println();
		}
	}

	// �ǽ����� 21
	public void practice21() {
		Scanner sc= new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num=sc.nextInt();
		for(int i=0; i<num; i++) {
			
			//�Է�
			for(int j=0; j<num*2+1; j++) {
				if(j>=num-i && j<=num+i)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}

	// �ǽ����� 22
	public void practice22() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) { // i: ��(1~num)
			for (int j = 0; j < num; j++) { //j: ��(0~num-1)
				if (i == 1 || i == num) {
					// ���ȣ(i) 1�Ǵ� num �϶�
					System.out.print('*');
				} else {
					// ���ȣ(i)�� 1�� num�� �ƴ϶��
					if (j == 0 || j == num - 1)
						System.out.print('*');
					else
						System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}

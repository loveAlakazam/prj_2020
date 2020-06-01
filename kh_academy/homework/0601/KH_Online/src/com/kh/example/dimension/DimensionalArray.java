package com.kh.example.dimension;

public class DimensionalArray {
	public void method1() {
		// 2���� �迭 ����
		int[][] iArr1;
		int iArr2[][];
		int[] iArr3[];

		// 2���� �迭 �Ҵ�
		/*
		 * int[] iArr1=new int[3]; iArr1[0]= new int[5]; iArr1[1]= new int[5]; iArr2[2]=
		 * new int[5];
		 */
		iArr1 = new int[3][5];

		// ��ø for���� ���� ����Ǿ� �ִ� ���� ���
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(iArr1[i][j] + " ");
			}
			System.out.println(); // �ٹٲ� ����
		}

		// �������� �迭�� ũ�⸦ ���Ͽ� ���
		for (int i = 0; i < iArr1.length; i++) {
			for (int j = 0; j < iArr1[i].length; j++) {
				System.out.print(iArr1[i][j] + " ");
			}
			System.out.println();// �ٹٲ� ����
		}

		iArr2 = new int[3][3];
//		iArr2[0][0]=1;
//		iArr2[0][1]=2;
//		iArr2[0][2]=3;
//		
//		iArr2[1][0]=4;
//		iArr2[1][1]=5;
//		iArr2[1][2]=6;
//		
//		iArr2[2][0]=7;
//		iArr2[2][1]=8;
//		iArr2[2][2]=9;

		for (int r = 0; r < iArr2.length; r++) {
			for (int c = 0; c < iArr2[r].length; c++) {
				iArr2[r][c] = (r * iArr2.length) + c + 1;
			}
		}

		int value = 1;
		for (int r = 0; r < iArr2.length; r++) {
			for (int c = 0; c < iArr2[r].length; c++) {
				iArr2[r][c] = value++;
			}
			System.out.println();
		}

		System.out.println("iArr2�� �ּҰ�: " + iArr2);
		for (int r = 0; r < iArr2.length; r++) {
			for (int c = 0; c < iArr2[r].length; c++)
				System.out.print(iArr2[r][c] + " ");
			System.out.println();
		}

		iArr2 = new int[4][4]; // �缱��
		System.out.println("iArr2�� �ּҰ�: " + iArr2);
		for (int r = 0; r < iArr2.length; r++) {
			for (int c = 0; c < iArr2[r].length; c++)
				iArr2[r][c] = (iArr2.length * r) + c + 1;
		}

		for (int r = 0; r < iArr2.length; r++) {
			for (int c = 0; c < iArr2[r].length; c++)
				System.out.print(iArr2[r][c] + " ");
			System.out.println();
		}

	}

	public void method2() {
		// ����� ���ÿ� �ʱ�ȭ
		String[][] sArr = { { "�����", "�̱�ȣ" }, { "������", "�齽��" } };

		// ���� �迭 : ��� ���� ũ�Ⱑ ��� �������ִ�.
		for (int r = 0; r < sArr.length; r++) {
			for (int c = 0; c < sArr[r].length; c++) {
				System.out.print(sArr[r][c] + " ");
			}
			System.out.println();
		}

		// �����迭: ���� ������������, �࿡ ���� ����ũ�Ⱑ ���������� �ʴ�.
		// �� �ึ���� ���� ������ �ٸ���.
		/*
		 * �ڷ����� ���� 1���� �迭 �������� �ϳ��� ���� ���� 2���� �迭�̱� ������ �����ִ� 1���� �迭�� ���̰� �� ���� �ʿ䰡 ����.
		 */
		int[][] iArr = new int[3][]; // �����迭�� �Ҵ�

		// ���ึ���� ���� �Ҵ�
		iArr[0] = new int[2];
		iArr[1] = new int[3];
		iArr[2] = new int[4];

		// ���
		for (int r = 0; r < iArr.length; r++) {
			for (int c = 0; c < iArr[r].length; c++)
				System.out.print(iArr[r][c]);
			System.out.println();
		}
		System.out.println();

		// �����迭�� �����
		// 1. �ε���
		iArr[0][0] = 1;
		iArr[0][1] = 2;

		iArr[1][0] = 3;
		iArr[1][1] = 4;
		iArr[1][2] = 5;

		iArr[2][0] = 6;
		iArr[2][1] = 7;
		iArr[2][2] = 8;
		iArr[2][3] = 9;
		// ���
		for (int r = 0; r < iArr.length; r++) {
			for (int c = 0; c < iArr[r].length; c++)
				System.out.print(iArr[r][c]);
			System.out.println();
		}
		System.out.println();

		// 2. ���� for��
		int value = 1;
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++)
				iArr[i][j] = value++;
		}

		for (int r = 0; r < iArr.length; r++) {
			for (int c = 0; c < iArr[r].length; c++)
				System.out.print(iArr[r][c] + " ");
			System.out.println();
		}
		System.out.println();

		// 3. ����� ���ÿ� �ʱ�ȭ
		iArr = new int[][] { { 1, 2, 3 }, { 4, 5, 6, 7 } };
		// ���ο� �迭�ΰ�� iArr[][]= {{1,2,3},{4,5,6,7}};
		for (int r = 0; r < iArr.length; r++) {
			for (int c = 0; c < iArr[r].length; c++) {
				System.out.print(iArr[r][c] + " ");
			}
			System.out.println();
		}
	}

	public void arrayExam() {
//		int [][]iArr= {{11,12},{1,2,3}, {4,5,6,8,99}};
//		for(int r=0; r<iArr.length; r++) {
//			for(int c=0; c<iArr[r].length;c++)
//				System.out.print(iArr[r][c]+" ");
//			System.out.println();
//		}
		// �����迭 �ʱ�ȭ
		// iArr�� 3��, �׷��� � ���� ��
		int[][] iArr = new int[3][];

		// ���� ���� ���̰� ��� �迭�� �����ϴ����� �˷�����Ѵ�.
		iArr[0] = new int[2]; // 0�࿡�� ���̰� 2�� �迭�� ����
		iArr[1] = new int[3]; // 1�࿡�� ���̰� 3�� �迭�� ����
		iArr[2] = new int[4]; // 2�࿡�� ���̰� 4�� �迭�� ����

		// ���2 �̿�- for�ݺ����� �̿�
		int value = 1;
		for (int r = 0; r < iArr.length; r++) {
			// iArr[r].length: (r��)����
			for (int c = 0; c < iArr[r].length; c++) {
				iArr[r][c] = value++;
			}
		}

		// �迭�� ���Ҹ� ���
		for (int r = 0; r < iArr.length; r++) {
			for (int c = 0; c < iArr[r].length; c++) {
				System.out.print(iArr[r][c] + " ");
			}
			System.out.println();
		}

		System.out.println();
		// ���3 �̿�- ����Ű�� ����� �����
		iArr = new int[][] { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 9, 8 } };
		// �迭�� ���Ҹ� ���
		for (int r = 0; r < iArr.length; r++) {
			for (int c = 0; c < iArr[r].length; c++) {
				System.out.print(iArr[r][c] + " ");
			}
			System.out.println();
		}

	}
}

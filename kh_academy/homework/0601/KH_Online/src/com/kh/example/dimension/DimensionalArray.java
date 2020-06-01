package com.kh.example.dimension;

public class DimensionalArray {
	public void method1() {
		// 2차원 배열 선언
		int[][] iArr1;
		int iArr2[][];
		int[] iArr3[];

		// 2차원 배열 할당
		/*
		 * int[] iArr1=new int[3]; iArr1[0]= new int[5]; iArr1[1]= new int[5]; iArr2[2]=
		 * new int[5];
		 */
		iArr1 = new int[3][5];

		// 중첩 for문을 통해 저장되어 있는 값을 출력
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(iArr1[i][j] + " ");
			}
			System.out.println(); // 줄바꿈 개행
		}

		// 동적으로 배열의 크기를 구하여 출력
		for (int i = 0; i < iArr1.length; i++) {
			for (int j = 0; j < iArr1[i].length; j++) {
				System.out.print(iArr1[i][j] + " ");
			}
			System.out.println();// 줄바꿈 개행
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

		System.out.println("iArr2의 주소값: " + iArr2);
		for (int r = 0; r < iArr2.length; r++) {
			for (int c = 0; c < iArr2[r].length; c++)
				System.out.print(iArr2[r][c] + " ");
			System.out.println();
		}

		iArr2 = new int[4][4]; // 재선언
		System.out.println("iArr2의 주소값: " + iArr2);
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
		// 선언과 동시에 초기화
		String[][] sArr = { { "우민혁", "이규호" }, { "유정하", "백슬기" } };

		// 정변 배열 : 행과 열의 크기가 모두 정해져있다.
		for (int r = 0; r < sArr.length; r++) {
			for (int c = 0; c < sArr[r].length; c++) {
				System.out.print(sArr[r][c] + " ");
			}
			System.out.println();
		}

		// 가변배열: 행은 정해져있지만, 행에 대한 열의크기가 정해져있지 않다.
		// 각 행마다의 열의 개수가 다르다.
		/*
		 * 자료형이 같은 1차원 배열 여러개를 하나로 묶은 것이 2차원 배열이기 때문에 묶여있는 1차원 배열의 길이가 꼭 같을 필요가 없다.
		 */
		int[][] iArr = new int[3][]; // 가변배열의 할당

		// 각행마다의 열을 할당
		iArr[0] = new int[2];
		iArr[1] = new int[3];
		iArr[2] = new int[4];

		// 출력
		for (int r = 0; r < iArr.length; r++) {
			for (int c = 0; c < iArr[r].length; c++)
				System.out.print(iArr[r][c]);
			System.out.println();
		}
		System.out.println();

		// 가변배열의 값기록
		// 1. 인덱스
		iArr[0][0] = 1;
		iArr[0][1] = 2;

		iArr[1][0] = 3;
		iArr[1][1] = 4;
		iArr[1][2] = 5;

		iArr[2][0] = 6;
		iArr[2][1] = 7;
		iArr[2][2] = 8;
		iArr[2][3] = 9;
		// 출력
		for (int r = 0; r < iArr.length; r++) {
			for (int c = 0; c < iArr[r].length; c++)
				System.out.print(iArr[r][c]);
			System.out.println();
		}
		System.out.println();

		// 2. 이중 for문
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

		// 3. 선언과 동시에 초기화
		iArr = new int[][] { { 1, 2, 3 }, { 4, 5, 6, 7 } };
		// 새로운 배열인경우 iArr[][]= {{1,2,3},{4,5,6,7}};
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
		// 가변배열 초기화
		// iArr은 3행, 그런데 몇열 인지 모름
		int[][] iArr = new int[3][];

		// 각행 마다 길이가 몇개인 배열을 참조하는지를 알려줘야한다.
		iArr[0] = new int[2]; // 0행에는 길이가 2인 배열을 참조
		iArr[1] = new int[3]; // 1행에는 길이가 3인 배열을 참조
		iArr[2] = new int[4]; // 2행에는 길이가 4인 배열을 참조

		// 방법2 이용- for반복문을 이용
		int value = 1;
		for (int r = 0; r < iArr.length; r++) {
			// iArr[r].length: (r행)길이
			for (int c = 0; c < iArr[r].length; c++) {
				iArr[r][c] = value++;
			}
		}

		// 배열의 원소를 출력
		for (int r = 0; r < iArr.length; r++) {
			for (int c = 0; c < iArr[r].length; c++) {
				System.out.print(iArr[r][c] + " ");
			}
			System.out.println();
		}

		System.out.println();
		// 방법3 이용- 가리키는 대상을 덮어쓰기
		iArr = new int[][] { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 9, 8 } };
		// 배열의 원소를 출력
		for (int r = 0; r < iArr.length; r++) {
			for (int c = 0; c < iArr[r].length; c++) {
				System.out.print(iArr[r][c] + " ");
			}
			System.out.println();
		}

	}
}

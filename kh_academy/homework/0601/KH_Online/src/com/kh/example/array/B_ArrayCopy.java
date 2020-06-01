package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	// ��������: �迭�� �ּҸ� ����
	// ��������: ������ ���ο� �迭�� �ϳ� �����Ͽ� ���� ���ΰ� ����

	// ��������
	public void method1() {
		int[] originArr = { 1, 2, 3, 4, 5 };

		int[] copyArr = originArr; // copyArr�� originArr�� �ּҰ��� ���´�.
		System.out.println("originArr : " + originArr);
		System.out.println("copyArr: " + copyArr);

		System.out.println();

		System.out.print("Origin Arr: ");
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}

		System.out.println();
		System.out.print("copy Arr: ");
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}

		System.out.println();
		System.out.println("originArr[0]�� ���� 99�� ����");
		originArr[0] = 99;

		System.out.print("originArr: ");// 99 2 3 4 5
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}

		System.out.println();
		System.out.print("copyArr: "); // 99 2 3 4 5
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		// originArr�� copyArr�� ���� ���� ��ü�� �����Ѵ�.
	}

	// ��������
	public void method2() {
		int[] originArr = { 1, 2, 3, 4, 5 };

		// originArr�� �迭���̸�ŭ ���� �Ҵ��ϱ�.
		// ������ �������. -> int �ڷ��� �⺻�� :0
		int[] copyArr = new int[originArr.length];

		System.out.println("originArr address: " + originArr);
		System.out.println("copyArr address: " + copyArr);

		// �������� -1 : for���� �̿��� ����
		// �������� -2 : System Ŭ������ �ִ� arraycopy()�޼ҵ带 �̿��� ����
		// �������� -3 : ArraysŬ������ �ִ� copyOf() �޼ҵ带 �̿��� ����
	}

	// ��������1 - for���� �̿��� ����
	public void deepcopy1() {
		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = new int[originArr.length];

		// �ּҰ��� ���� �ٸ���.
		// ��, originArr�� copyArr�� �����ϴ� ��ü�� ���� �ٸ���. (�ּҰ��� �ٸ��⶧����)
		System.out.println("originArr �ּҰ�: " + originArr);
		System.out.println("copyArr �ּҰ�: " + copyArr);

		for (int i = 0; i < copyArr.length; i++) {
			copyArr[i] = originArr[i];
		}

		System.out.print("originArr: ");
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.print("copoyArr: ");
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");	
		}
		
		
		System.out.println();
		originArr[0]=99; //originArr[0]�� 99�� ����
		copyArr[1]=50;   //copyArr[1]�� 50���� ����
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		
	}
	
	//�������� 2
	public void deepcopy2() {
		//	System Ŭ������ arraycopy()�� �̿�
		int [] originArr= {1,2,3,4,5};
		int [] copyArr=new int[10];
		
		/*
		 * System.arraycopy(src: �����迭-��迭�� �Ȱ��� ī���� ���ΰ�?,
		 * 					srcPos: �����迭�� ������ġ-�����迭�� ��𼭺��� ���縦 �����Ұǰ�?,
		 * 					dest:   ����迭,
		 * 					destPost: ����迭�� ������ġ- ����迭�� ��� �ٿ���������,
		 * 					length: ������ ����,
		 * );
		 * */
		
		
		//[error message]
		//The method arraycopy(Object, int, Object, int, int) 
		//in the type System is not applicable for the arguments (int[], int, int[], int, int[])
		
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		System.out.print("originArr: ");
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		
		System.out.print("\ncopyArr: ");
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
	}
	
	//��������3
	//ArraysŬ������ �ִ� copyOf()�� �̿�.
	public void deepcopy3() {
		int [] originArr= {1,2,3,4,5};
		int [] copyArr= new int[10];
		System.out.println("�迭���� ����");
		System.out.print("copyArr: ");
		for(int i=0; i<copyArr.length; i++)
			System.out.print(copyArr[i]+" ");
		
		System.out.println();
		
		// ctrl ������ ��ũȮ�� 
		//Array.copyOf()�� System.arraycopy()�� ����ߴ�.
		//Array.copyOf( �����迭, ������ ���� �迭�� ����);
		System.out.println("\n�迭���� ����");
		copyArr=Arrays.copyOf(originArr, originArr.length);
		
		System.out.print("copyArr: ");
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		String str="";
		System.out.print(str);
	}
}

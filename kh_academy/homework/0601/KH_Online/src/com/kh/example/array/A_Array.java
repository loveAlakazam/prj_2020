package com.kh.example.array;

import java.util.Scanner;

public class A_Array {
	// �迭�̶�?
	// �����ڷ����� �������� ������ �ϳ��� �������� ��Ÿ����.
	// �ε����� 0���� �����Ѵ�.
	public void method1() {
		int[] arr = new int[9];

		// �ε����� 0���� �����ϹǷ�
		// �迭���� �ش� �ε����� ���� �迭������ ����.
		// ArrayIndexOutOfBoundsException
		for (int i = 0; i < 9; i++) {
			arr[i] = (i + 1) * 10;
		}

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public void method2() {
		int[] arr = new int[10];
		System.out.println(arr);

		for (int i = 0; i < 10; i++) {
			arr[i] = (i + 1) * 10;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

//		int arr2= {1,2,3,4,5};
		// Type mismatch: cannot convert from int[] to int
//		int arr2[]= {1,2,3,4,5};
//		for(int i=0; i<6; i++) {
//			System.out.print(arr2[i]+" ");
//		}

		// �迭 �ʱ�ȭ ����
		// cArr�� ���ҿ� ����ִ� �ʱⰪ�� �����̴�.
		char[] cArr = new char[10];
		for (int i = 0; i < cArr.length; i++) {
			System.out.println("cArr[" + i + "]=1" + cArr[i] + "2");
		}
	}
	
	public void method2_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ��: ");
		int size = sc.nextInt();
		double[] dArr = new double[size];
		System.out.println("dArr�ּ�: "+dArr);
		System.out.println("dArr length: "+dArr.length);
		for (int i = 0; i < dArr.length; i++) {
			System.out.println("dArr[" + i + "]=" + dArr[i]);
		}
		
		//�ּҰ� �ٲ����. -> �ٸ� ������ ������ ����Ų��.(�����Ѵ�)
		System.out.println();
		dArr=new double[30];
		System.out.println("dArr length: "+dArr.length);
		System.out.println("dArr address: "+dArr);
	}
}

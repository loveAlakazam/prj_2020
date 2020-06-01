package com.kh.example.array;

import java.util.Scanner;

public class A_Array {
	// 배열이란?
	// 같은자료형의 여러개의 변수를 하나의 묶음으로 나타낸다.
	// 인덱스는 0부터 시작한다.
	public void method1() {
		int[] arr = new int[9];

		// 인덱스는 0부터 시작하므로
		// 배열에서 해당 인덱스에 대한 배열공간이 없다.
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

		// 배열 초기화 이후
		// cArr의 원소에 들어있는 초기값은 띄어쓰기이다.
		char[] cArr = new char[10];
		for (int i = 0; i < cArr.length; i++) {
			System.out.println("cArr[" + i + "]=1" + cArr[i] + "2");
		}
	}
	
	public void method2_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기: ");
		int size = sc.nextInt();
		double[] dArr = new double[size];
		System.out.println("dArr주소: "+dArr);
		System.out.println("dArr length: "+dArr.length);
		for (int i = 0; i < dArr.length; i++) {
			System.out.println("dArr[" + i + "]=" + dArr[i]);
		}
		
		//주소가 바뀌었다. -> 다른 힙영역 공간을 가리킨다.(참조한다)
		System.out.println();
		dArr=new double[30];
		System.out.println("dArr length: "+dArr.length);
		System.out.println("dArr address: "+dArr);
	}
}

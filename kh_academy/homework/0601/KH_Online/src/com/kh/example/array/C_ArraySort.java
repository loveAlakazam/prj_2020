package com.kh.example.array;

import java.util.Arrays;

public class C_ArraySort {
	public void method() {
		int[]iArr= {2,5,4,6,1,3};
		System.out.print("������ iArr: ");
		for(int i=0; i<iArr.length; i++)
			System.out.print(iArr[i]+" ");
		
		System.out.print("\n������ iArr: ");
		Arrays.sort(iArr);
		for(int i=0; i<iArr.length; i++)
			System.out.print(iArr[i]+" ");	
	}
	
	public void method2() {
		String[] fruits= {"���","��",
				"����", "���ξ���", 
				"�ٳ���", "������"};
		System.out.print("���� ��: ");
		for(int i=0; i<fruits.length; i++)
			System.out.print(fruits[i]+" ");
	
		
		System.out.print("\n������: ");
		Arrays.sort(fruits);
		for(int i=0; i<fruits.length; i++)
			System.out.print(fruits[i]+" ");
		
	}
}

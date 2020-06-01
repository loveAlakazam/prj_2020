package com.kh.example.array;

import java.util.Arrays;

public class C_ArraySort {
	public void method() {
		int[]iArr= {2,5,4,6,1,3};
		System.out.print("정렬전 iArr: ");
		for(int i=0; i<iArr.length; i++)
			System.out.print(iArr[i]+" ");
		
		System.out.print("\n정렬후 iArr: ");
		Arrays.sort(iArr);
		for(int i=0; i<iArr.length; i++)
			System.out.print(iArr[i]+" ");	
	}
	
	public void method2() {
		String[] fruits= {"사과","배",
				"딸기", "파인애플", 
				"바나나", "오렌지"};
		System.out.print("정렬 전: ");
		for(int i=0; i<fruits.length; i++)
			System.out.print(fruits[i]+" ");
	
		
		System.out.print("\n정렬후: ");
		Arrays.sort(fruits);
		for(int i=0; i<fruits.length; i++)
			System.out.print(fruits[i]+" ");
		
	}
}

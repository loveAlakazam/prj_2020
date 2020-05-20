package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void printUnicode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자: ");
		char char1 = sc.nextLine().charAt(0);
		// int 타입 변수 공간(4byte) <= char 타입 데이터(2byte)
		// 작은타입에서 큰타입으로 자동형변환 가능
		int char2Int1 = char1;
		System.out.println(char1 + " unicode: " + char2Int1);
		
		System.out.println();
		
		System.out.print("문자: ");
		char char2 = sc.nextLine().charAt(0);
		int char2Int2 = char2;
		System.out.println(char2 + " unicode: " + char2Int2);
	}
}

package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void printUnicode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		char char1 = sc.nextLine().charAt(0);
		// int Ÿ�� ���� ����(4byte) <= char Ÿ�� ������(2byte)
		// ����Ÿ�Կ��� ūŸ������ �ڵ�����ȯ ����
		int char2Int1 = char1;
		System.out.println(char1 + " unicode: " + char2Int1);
		
		System.out.println();
		
		System.out.print("����: ");
		char char2 = sc.nextLine().charAt(0);
		int char2Int2 = char2;
		System.out.println(char2 + " unicode: " + char2Int2);
	}
}

package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void getScore() {
		Scanner sc= new Scanner(System.in);
		System.out.print("����: ");
		double korScore=sc.nextDouble();
		
		System.out.print("����: ");
		double engScore=sc.nextDouble();
		
		System.out.print("����: ");
		double matScore=sc.nextDouble();
		
		// ���� ����ȯ
		// ����Ÿ�԰���(4byte) <- ūŸ�� ������(double 8byte)
		// ūŸ���� �����Ͱ� ������ �ս��� �����ϰ� ����������  �����Ѵ�.
		int totalScore= (int)(korScore+engScore+matScore);
		int avg=totalScore/3;
		
		System.out.println("����: "+ totalScore);
		System.out.println("���: "+ avg);
	}
}

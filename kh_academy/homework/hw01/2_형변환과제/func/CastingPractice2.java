package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void getScore() {
		Scanner sc= new Scanner(System.in);
		System.out.print("국어: ");
		double korScore=sc.nextDouble();
		
		System.out.print("영어: ");
		double engScore=sc.nextDouble();
		
		System.out.print("수학: ");
		double matScore=sc.nextDouble();
		
		// 강제 형변환
		// 작은타입공간(4byte) <- 큰타입 데이터(double 8byte)
		// 큰타입의 데이터가 데이터 손실을 감수하고도 작은공간에  저장한다.
		int totalScore= (int)(korScore+engScore+matScore);
		int avg=totalScore/3;
		
		System.out.println("총점: "+ totalScore);
		System.out.println("평균: "+ avg);
	}
}

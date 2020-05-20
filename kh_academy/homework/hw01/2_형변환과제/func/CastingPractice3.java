package com.kh.practice2.func;

public class CastingPractice3 {
	public void method() {
		int iNum1= 10;
		int iNum2= 4;
		
		float fNum=3.0f;
		double dNum=2.5;
		char ch='A';
		
		//사칙연산과 형변환
		System.out.println(iNum1/iNum2);
		System.out.println((int)dNum);
		
		//10.0
		System.out.println(iNum2* dNum);
		System.out.println((double)iNum1);
		
		//2.5
		System.out.println((double)iNum1/iNum2);
		System.out.println(dNum);
		
		//3
		System.out.println((int)(iNum1/fNum));
		System.out.println(iNum1/(int)fNum);
	
		//3.33333
		System.out.println((float)(iNum1/fNum));
		System.out.println((double)iNum1/fNum);
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println(ch+iNum1);
		System.out.println((char)(ch+iNum1));
	}
}

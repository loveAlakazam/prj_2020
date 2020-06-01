package com.kh.example.chap02.run;

import com.kh.example.chap02.loop.A_For;
import com.kh.example.chap02.loop.B_While;
import com.kh.example.chap02.loop.C_DoWhile;
import com.kh.example.chap03.branch.A_Break;
import com.kh.example.chap03.branch.B_Continue;

public class Run {
	public static void mySelf5() {
		int i=0;
		while(i<5) {
			System.out.println("나는 최은강이야!");
			i++;
		}
	}
	
	public static void main(String[] args) {
		A_For af= new A_For();
//		af.method();
//		af.method1_1();
//		af.method2();
//		af.method2_1();
//		af.method3_1();
//		af.method4();
//		af.method4_1();
//		af.method5();
//		af.method6();
//		af.method6_1();
//		af.method7();
//		af.method8();
//		af.method9();
		
		B_While bw= new B_While();
//		bw.method1();
//		mySelf5();
//		bw.method2();
//		bw.method3();
//		bw.method4();
//		bw.method4_1();
//		bw.method7();
//		bw.method8();
		
		C_DoWhile cdw= new C_DoWhile();
		cdw.method1();
//		cdw.method2();
//		cdw.method3();
		
		A_Break ab= new A_Break();
//		ab.method1();
		B_Continue bc= new B_Continue();
//		bc.method1();
	}

}

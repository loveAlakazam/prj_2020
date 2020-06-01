package com.kh.example.run;

import com.kh.example.array.A_Array;
import com.kh.example.array.B_ArrayCopy;
import com.kh.example.array.C_ArraySort;
import com.kh.example.dimension.DimensionalArray;

public class Run {

	public static void main(String[] args) {
		A_Array aa= new A_Array();
//		aa.method1();
//		aa.method2();
//		aa.method2_1();
		B_ArrayCopy ba= new B_ArrayCopy();
//		ba.method1();
//		ba.method2();
//		ba.deepcopy1();
//		ba.deepcopy2();
//		ba.deepcopy3();
	
		C_ArraySort ac= new C_ArraySort();
//		ac.method();
//		ac.method2();
		
		
		DimensionalArray da= new DimensionalArray();
//		da.method1();
//		da.method2();
		da.arrayExam();
	}

}

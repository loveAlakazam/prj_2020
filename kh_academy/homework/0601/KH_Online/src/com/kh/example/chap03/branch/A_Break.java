package com.kh.example.chap03.branch;

import java.util.Scanner;

public class A_Break {
	//break문은 가장가까운 반복문을 빠져나간다.
	public void method1() {
		//문자열을 입력받아서 글자개수를 출력한다.
		//단, end입력하면 반복을 종료
		//do while사용
		
		//문자열을 입력받는다.
		Scanner sc= new Scanner(System.in);
		String str=null;
		do {
			System.out.print("문자열 입력: ");
			str= sc.nextLine();
			
			//입력한 글자가 end일때 나간다.
			//가장가까운 반복문을빠져나감
			if(str.equals("end"))
				break;
			
			//글자개수 입력
			System.out.println(str+"글자개수: "+ str.length());
		}while(true);
	}

}

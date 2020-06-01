package com.kh.example.chap03.branch;

public class B_Continue {
	//continue문은 아래에 있는 코드를 수행하지 않고
	//바로 증감식또는 조건식으로 건너뛴다.
	
	public void method1() {
		//1~100까지의 정수 합계출력
		//4의 배수 빼고 계산
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%4==0)
				continue;
			System.out.println("i: "+i);
			sum+=i;
		}
		System.out.println("4의배수를 제외한 나머지 숫자들의합: "+sum);
	}
}

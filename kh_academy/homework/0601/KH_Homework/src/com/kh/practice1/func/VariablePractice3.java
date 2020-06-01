package com.kh.practice1.func;

public class VariablePractice3 {
	//사각형 면적을 구하는 함수.
	public double getSquareArea(double width, double height) {
		return width*height;
	}
	
	//사각형 둘레를 구하는 함수.
	public double getSquarePerimeter(double width, double height) {
		return (width+height)*2;
		//연산자 계산 우선순위는 () 괄호가 먼저이며
		//괄호를 제외한 연산자의 계산에서는: /(나눗셈몫), %(나눗셈 나머지), *(곱셈) -> +(더하기), -(빼기) 순이다.
	}
}

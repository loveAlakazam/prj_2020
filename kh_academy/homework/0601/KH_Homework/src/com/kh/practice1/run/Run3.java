package com.kh.practice1.run; //현재 위치

import java.util.Scanner;//Scanner 클래스 임포트

import com.kh.practice1.func.VariablePractice3; // VariablePractice3클래스 임포트

public class Run3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//사용자로부터 가로길이와 세로길이를 각각 구한다.
		System.out.print("사각형의 가로길이를 입력해주세요: ");
		double width= sc.nextDouble();
		
		System.out.print("사각형의 세로길이를 입력해주세요: ");
		double height=sc.nextDouble();
		
		//가로길이, 세로길이 출력
		System.out.println("가로길이: "+ width);
		System.out.println("세로길이: "+ height);
		System.out.println(); //출력할 문자열이 없다면, 개행만 한다.
		
		//면적과 둘레 결과 출력
		//com.kh.practice1.func.VariablePractice3 클래스를 불러온다.
		VariablePractice3 vp3= new VariablePractice3();
		double squareArea=vp3.getSquareArea(width, height);
		double squarePerimeter= vp3.getSquarePerimeter(width, height);
		System.out.println("면적: "+ squareArea);
		System.out.println("둘레: "+ squarePerimeter);
	
	}
}

package com.kh.practice1.run; //���� ��ġ

import java.util.Scanner;//Scanner Ŭ���� ����Ʈ

import com.kh.practice1.func.VariablePractice3; // VariablePractice3Ŭ���� ����Ʈ

public class Run3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//����ڷκ��� ���α��̿� ���α��̸� ���� ���Ѵ�.
		System.out.print("�簢���� ���α��̸� �Է����ּ���: ");
		double width= sc.nextDouble();
		
		System.out.print("�簢���� ���α��̸� �Է����ּ���: ");
		double height=sc.nextDouble();
		
		//���α���, ���α��� ���
		System.out.println("���α���: "+ width);
		System.out.println("���α���: "+ height);
		System.out.println(); //����� ���ڿ��� ���ٸ�, ���ุ �Ѵ�.
		
		//������ �ѷ� ��� ���
		//com.kh.practice1.func.VariablePractice3 Ŭ������ �ҷ��´�.
		VariablePractice3 vp3= new VariablePractice3();
		double squareArea=vp3.getSquareArea(width, height);
		double squarePerimeter= vp3.getSquarePerimeter(width, height);
		System.out.println("����: "+ squareArea);
		System.out.println("�ѷ�: "+ squarePerimeter);
	
	}
}

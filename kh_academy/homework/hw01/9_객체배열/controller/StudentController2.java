package com.kh.practice.student.controller;
import com.kh.practice.student.model.vo.Student;
import java.util.Scanner;
//controller :  view와 model을 연결하며, 데이터 가공 및 처리 담당.
public class StudentController {
	// 필드 //
	// 초기값 : null , 공간만 할당해줌.
	private Student [] sArr=new Student[5];
	// 객체배열
	
	public static final int CUT_LINE=60; 
	//상수 - 초기화 이후 값 변경을 할 수 없다.
	//static: 같은 객체끼리 공유한다.
	//메모리의 static 영역에 저장한다.
	//객체 생성없이 사용할 수 있다.
	
	// 생성자 //
	public StudentController() {
		// 5개의 객체 배열을 위의 샘플데이터의 값으로
		// 초기화해주는 기본 생성자
		
		// The value of the local variable sArr is not used
		// Array constants can only be used in initializers
		
		//(심화) 사용자가 직접 입력한 값으로 객체를 만들 수 있을까?
		Scanner sc= new Scanner(System.in);
		System.out.println("학생이름 , 과목, 점수  순으로 입력해주세요!");
		for(int i=0; i<sArr.length; i++) {
			int num=i+1;
			System.out.print("학생"+num+"의 이름: "); 
			String name=sc.nextLine();
			
			System.out.print("학생"+num+"의 응시 과목명: "); 
			String subject=sc.nextLine();
			
			System.out.print("학생"+num+"의 점수: ");
			int score=Integer.parseInt(sc.nextLine());
			this.sArr[i]=new Student(name, subject, score);
		}
	}
	
	// 메소드 //
	public Student[] printStudent() {
		// Student 객체배열을 리턴한다.
		return sArr;
	}
	
	public int sumScore() {
		// int자료형 정수값을 리턴한다.
		int sum=0;
		for(int i=0; i<sArr.length; i++)
			sum+=sArr[i].getScore();
		return sum;
	}
	
	public double[] avgScore() {
		double [] avg= new double[2];
		//double[] 배열(기본자료형 배열)을 리턴한다.
		//sumScore 리턴값을 0번째 인덱스 저장
		avg[0]=this.sumScore();
		
		// 합의 평균을 첫번째 인덱스에 저장
		avg[1]=(double)avg[0]/sArr.length;
		return avg;
	}
	
}

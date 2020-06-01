package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student student =new Student();
		student.information();
		
		System.out.println();
		
		Student student2= new Student();
		student2.information();
		
		System.out.println();
		
		Student student3= new Student("최은강");
		student3.information();
		
		
		System.out.println();
		
		Student student4= new Student("김은강", 333);
		student4.information();
		
	
	}
}

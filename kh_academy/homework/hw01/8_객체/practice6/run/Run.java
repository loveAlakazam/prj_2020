package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
	public static void main(String [] args) {
		// 실행용 메소드로 기본 생성자와 매개변수 3개인 생성자, 매개변수 5개인 생성자들을 통해
		// 각각의 객체 생성후 inform()메소드를 통해 출력
		
		Book book1= new Book();
		book1.inform();
		
		System.out.println();
		
		Book book2= new Book("파이썬 머신러닝 가이드" , "위키북스" , "권철민" );
		book2.inform();
		
		System.out.println();
		
		Book book3= new Book("python clean code", "터닝포인트", "마리아노 아나야", 35000, 1.2);
		book3.inform();
	}
}

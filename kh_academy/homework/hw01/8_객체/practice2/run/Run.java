package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;
public class Run {
	
	public static void main(String [] args) {
		// 객체를 생성
		
		// 기본 생성자 호출 
		Product product1= new Product();
		product1.information(); 
		
		// 생성자2 호출
		Product product2= new Product("아메리카노");
		product2.information();
		
		// 오버로딩된 메소드 information 호출
		int dollarPrice=product2.information(2800);
		System.out.println("달러가격: "+ dollarPrice);
		
		// 생성자4 호출
		Product product3= new Product(2800);
		product3.information();
		
		// 생성자6 호출
		Product product4= new Product("7gram", "아메리카노");
		product4.information();
		
		//생성자7 호출
		Product product5= new Product("스타벅스","콜드브루",4100);
		product5.information();
		
		
	}
}

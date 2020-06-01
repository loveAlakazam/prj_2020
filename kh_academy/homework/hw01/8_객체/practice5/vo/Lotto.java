package com.kh.example.practice5.model.vo;

// 필드 실습문제 4
public class Lotto {
	// 필드 //
	// 중복되지 않은 1~45 사이의난수 6개 배열 
	private int lotto[]=new int[6]; //JVM에 의해서 0으로 초기화 (int형 기본값 = 0) 
	
	// 인스턴스 블록으로 초기화 
	// lotto 배열은 인스턴스 변수에 해당한다.
	// 즉 객체를 생성해야만한다.
	{
		boolean isUsed[] = new boolean[46]; 
		// isUsed[number:1~45] => number가 이미 사용됐는지 확인한다.
		// 이미 사용됐다면, True 
		// 아직 사용하지 않은 중복되지 않은 숫자라면 False
		
		int uniqueCnt=0; // 중복되지 않은 난수 개수 
		int random; // 1~45 사이의 난수 
		do {
			// 또한 random변수는 int 타입으로 설정했기 때문에 
			//random()의 반환타입은 double형이기때문에 int형으로 강제형변환해야한다.
			random= (int)(Math.random()*45+1); 
			
			if(! isUsed[random]) {
				//random 이 아직 사용되지 않은 로또번호라면
			    isUsed[random]=true; // 이제 사용함.
			    lotto[uniqueCnt++]=random;
			}
		}while(uniqueCnt<lotto.length);
	}
	
	// 생성자 (기본생성자) // 
	public Lotto() {
		
	}
	
	// 메소드 //
	public void information() {
		
		System.out.print("초기화 된 로또 번호는 : ");
		//  객체의 필드 (인스턴스 변수)인 중복되지 않은 숫자 6개의 로또번호를 출력한다.
		for(int i=0; i<lotto.length; i++) {
			//String 타입 문자열의 길이는 
			//String str="alakazam"; 일때 문자열 길이  => str.length()
			
			//배열의 길이는 
			// int [] arr= new int[]{1,2,3,4,5}; 일때  =>  arr.length 
			
			System.out.print(lotto[i]+" ");
		}
	}
}

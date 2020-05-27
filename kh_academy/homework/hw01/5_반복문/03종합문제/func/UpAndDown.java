package com.kh.practice.comp.func;
import java.util.Scanner;

public class UpAndDown {
	//조건문-반복문 종합문제
	//실습문제 5
	public void upDown() {
		//1부터 100사이의 정수중 임의의 난수가 정해지고
		//사용자는 정해진 난수를 맞추는데 몇번만에 맞췄는지 출력하세요.
		
		/*
		 * Math.random()
		 * 반환타입: double
		 * 0이상 ~1미만의 값을 리턴함.
		 * 
		 * 
		 * Math.random()*100+1
		 * 1이상 ~101미만의 값을 리턴
		*/
		//랜덤숫자 (답)
		int randomNumber=(int)(Math.random()*100+1);
		
		//사용자 입력숫자
		Scanner sc=new Scanner(System.in);
		int userNumber;
		int correctCnt=0; //맞춘횟수
		do {
			//사용자 입력 숫자
			System.out.print("1~100사이의 임의의 난수를 맞춰보세요: ");
			userNumber=sc.nextInt();
			
			//사용자 입력숫자가 1보다 작거나 100보다 크다면
			if(userNumber<1 || userNumber>100) {
				System.out.println("1~100사이의 숫자를 입력해주세요.");
				continue; //아래코드로 진행하지 않고 다음으로 넘어감.
			}
			
			//1이상이라면
			if(userNumber>randomNumber) {//사용자 입력숫자가 랜덤숫자보다 작다면
				System.out.println("DOWN !");
			}else if(userNumber<randomNumber) {//사용자 입력숫자가 랜덤숫자보다 크다면
				System.out.println("UP !");
			}
			//카운트
			correctCnt++;
		}while(userNumber!=randomNumber);
		//사용자입력숫자와 정답숫자가 같지 않으면 반복
		//같으면 빠져나간다.
		System.out.println("정답입니다!");
		System.out.println(correctCnt+"회만에 맞추셨습니다!");
	}
}

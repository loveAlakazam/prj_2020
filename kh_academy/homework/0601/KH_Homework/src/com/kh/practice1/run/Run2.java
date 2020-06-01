package com.kh.practice1.run;

import java.util.Scanner;

import com.kh.practice1.func.VariablePractice2;

public class Run2 {

	public static void main(String[] args) {
		VariablePractice2 vp2 = new VariablePractice2();
		
		//Scanner을 통해서, 사용자로부터 문자열을 입력받습니다.
		Scanner sc = new Scanner(System.in);
		
		// 문자열 형태의 숫자문자열을 입력받습니다.
		String stringNum1, stringNum2;
		System.out.print("첫번째 정수를 입력해주세요: ");
		stringNum1= sc.nextLine();
		
		System.out.print("두번째 정수를 입력해주세요: ");
		stringNum2= sc.nextLine();
		
		//Integer 정수객체에서 parseInt()메소드를 사용하여, 문자열을 숫자로 변환합니다.
		//이를 파싱(parsing)이라고 하며, parsing은 문자열을 다른 자료형(정수, 실수, 등) 으로 변환시키는 것을 의미합니다.
		int num1=Integer.parseInt(stringNum1);
		int num2=Integer.parseInt(stringNum2);
		
		//System.out.println()은 
		// 문자열 입력없으면 개행만합니다. (반면, printf와 print는 문자열입력이 필수적)
		// 입력한 문자열을 출력과 개행을 합니다.
		System.out.println("첫번째 정수: "+ num1);
		System.out.println("두번째 정수: "+ num2);
		
		int sum= vp2.sum(num1, num2);
		System.out.println("더하기 결과: "+ sum);
		
		int sub= vp2.sub(num1, num2);
		System.out.println("빼기 결과: "+ sub);
		
		int mul= vp2.mul(num1, num2);
		System.out.println("곱하기 결과: "+ mul);
		
		int div= vp2.div(num1, num2);
		System.out.println("나누기 몫 결과: "+ div);
		
		int mod= vp2.mod(num1, num2);
		System.out.println("나누기 나머지 결과: "+ mod);
	}

}

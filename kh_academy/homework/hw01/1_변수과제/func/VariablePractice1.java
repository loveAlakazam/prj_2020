package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public void introduceMe() {
		
		//사용자로부터 입력을 받는다.
		//입력을 받으려면 Scanner 객체를 호출해야한다.
		//Scanner객체는 java폴더 > util폴더 안에 들어있다.
		// java.util.Scanner 을 import해야 사용할 수 있다.
		
		Scanner sc = new Scanner(System.in); //사용자로부터 데이터를 입력을 받으려면, 표준입력 System.in이 필요.
		
		
		//문자열 입력은 sc.next()와 sc.nextLine()이 존재한다.
		//sc.next()는 띄어쓰기, \n와 같은 white-space를 제외한 문자열을 입력받을 수 있다.
		//즉, 쉽게말하자면 내가 입력한 문자열이 "서울시 성동구 금호동"이라고 하면,  sc.next()를 통해 "서울시"만 입력받는 것이다.
		
		//반면, sc.nextLine()은 띄어쓰기를 포함한 문자열을 입력받을 수 있으며
		// \n도 같이 입력을 받는다.
		// \n의 경우에는 널문자(\0)받아들여서, \n를 마지막으로 한다.
		//이름
		System.out.print("이름을 입력하세요: "); // System.out.print()는 비어있는 문자열을 들어갈 수 없으며, 오로지 "출력"만 한다.
		String name= sc.nextLine();
		
		//성별
		// 먼저 문자열의 객체를 입력받은뒤에, 
		// 문자열 String 객체에 내장된 메소드중 하나인 charAt(인덱스번호) 를 이용한다.
		// charAt의 ()괄호 안에는 zero-index기반의 문자열이 들어간다.
		// zero-index기반 문자열이란, 문자열의 인덱스는 0부터 시작한다는 것을 의미한다.
		System.out.print("성별을 입력하세요(남/여): ");
		char gender= sc.nextLine().charAt(0); // 입력받은 문자열 sc.nextLine()중 0번째 인덱스에 해당하는 문자를 추출.
		
		//나이
		// sc.nextInt()의 경우에는 \n를 받아들이지 않는다.
		System.out.print("나이를 입력하세요: ");
		int age= sc.nextInt();
		
		//age입력에서 nextInt()가 받아들이지 못해서 남은 \n문자열이  버퍼에 남아있다.
		//버퍼에 남아있는 \n를 비운다.
		sc.nextLine();
		
		//키
		System.out.print("키를 입력하세요.(cm): ");
		double height= sc.nextDouble();
		
		//nextDouble()함수에서 못받아들인 \n이 버퍼에 남으므로
		//버퍼를 비운다.
		sc.nextLine();
		
		//입력받은정보를 출력
		System.out.printf("키 %.1fcm인 %d살인 %c자 %s님 반갑습니다^^",height, age, gender, name);
	}
}

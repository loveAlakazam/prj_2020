package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice4 {
	public void printThreeWords2() {
		//사용자로부터 문자열을 입력받는다.
		Scanner sc= new Scanner(System.in);
		
		// \n을 제외한 나머지 문자열을 입력받는다.
		System.out.print("단어를 입력해주세요: ");
		String sampleWord= sc.next();
		
		//단어길이가 3미만인 단어의 경우에는 예외가 발생한다.
		//[예외] java.lang.StringIndexOutOfBoundsException
		
		
		//여기서 try-catch문을 사용해보겠습니다.
		try {
			 System.out.printf("첫번째 글자: %c\n", sampleWord.charAt(0));
			 System.out.printf("두번째 글자: %c\n", sampleWord.charAt(1));
			 System.out.printf("세번째 글자: %c\n", sampleWord.charAt(2));
			 
		}catch(StringIndexOutOfBoundsException e){
			//checkPrint함수에서 StringIndexOutOfBoundsException 예외가 발생하면
			//함수를 중단하고, catch블록으로 진입.
			
			//길이가 3자보다 작은 경우에는 예외 발생
			System.out.println("해당 단어는 3글자 미만입니다.");
			System.out.println("예외: "+e.toString()); //예외 출력
		}
		
	}
	
}

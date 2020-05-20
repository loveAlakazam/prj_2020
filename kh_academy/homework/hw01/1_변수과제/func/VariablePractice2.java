package com.kh.practice1.func;

public class VariablePractice2 {
	// 메소드 오버로딩 - 덧셈
	//기본 정수형(int) 덧셈
	public int sum(int a, int b) {
		return a+b;
	}
	
	//byte형 덧셈
	public byte sum(byte a, byte b) {
		return (byte)(a+b);
		//강제형변환이 없으면, Type mismatch: cannot convert from int to byte 에러발생
		//매개변수에 저장된 데이터의 기본값은 int형이다.
	}
	
	//short형 덧셈
	public short sum(short a, short b) {
		return (short)(a+b);
	}
	
	//long형 덧셈
	public long sum(long a, long b) {
		return a+b;
		//long형은 8byte의 공간을 차지하므로
		//int형은 4byte의 공간을 차지한다. 즉, 자동형변환으로 작은데이터 자료형인 데이터를
		//큰 데이터 자료형으로 바꾼다.
	}
	
	//오버로딩- 뺄셈
	public int sub(int a, int b) {
		return a-b;
	}
	
	public byte sub(byte a, byte b) {
		return (byte)(a-b);
	}
	
	public short sub(short a, short b) {
		return (short)(a-b);
	}
	
	public long sub(long a, long b) {
		return a-b;
	}
	
	//오버로딩- 곱셈
	public int mul(int a, int b) {
		return a*b;
	}
	
	public byte mul(byte a, byte b) {
		return (byte)(a*b);
	}
	
	public short mul(short a, short b) {
		return (short)(a*b);
	}
	
	public long mul(long a, long b) {
		return a*b;
	}
	
	//나눗셈(몫)
	//여기서는 정수만으로 제한해보겠습니다..
	//이유는 조금 귀찮습니다....ㅎㅎ;
	//여기서는 try-catch문을 사용해보겠습니다.
	//0을 나누는 경우를 예외로 해야되기때문입니다.
	//0을 나누게되는경우에는 나눌 수없다는 에러를 보냅니다.
	public int div(int a, int b) {
		int result=0;
		try {
			result=a/b;
			
		}catch(Exception e) {
			//예외를 출력합니다.
			System.out.println(e.toString());
		}
		return result;
	}
	
	public int mod(int a, int b) {
		int result=0;
		try {
			result=a%b;
		}catch(Exception e) {
			//예외를 출력
			System.out.println(e.toString());
		}
		return result;
	}
	
	
}

package part05;

public class MethodDefinition {
	//메소드 정의
	//public 리턴타입 메소드이름 (매개변수) {}
	
	//1.
	//리턴타입이 없는 메소드
	//매개변수가 없다.
	public void method1() {
		System.out.println("메소드1 실행");
	}
	
	//2.
	//매개변수 정수
	//리턴타입없다
	public void method2(int val) {
		System.out.println("메소드2 실행");
		System.out.println("매개변수값: "+val+"을 이용함.");
	}
	
	//3.
	//매개변수없음.
	//정수리턴
	public int method3() {
		System.out.println("메소드3 실행");
		return 3;
	}
	
	//4.
	//매개변수 2개
	//리턴없음
	public void method4(int x, int y) {
		System.out.println("메소드4 실행");
		System.out.println("x: "+x+"y: "+y);
		System.out.println("x+y="+(x+y));
	}
	
	//5
	//매개변수 1개
	//정수리턴
	public int method5(int y) {
		System.out.println("메소드5 실행");
		System.out.println("y: "+y);
		return y*y;
	}

}

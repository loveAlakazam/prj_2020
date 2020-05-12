package part07;

// Car클래스에 상속받겟다.
public class Bus extends Car {
	
	//버스 생성자- 기본생성자
	Bus(){
		super(); //부모 생성자 먼저 호출
		System.out.println("버스 객체 생성-자식생성자 호출");
	}
	
	//버스클래스 만이 가지고 있는 메소드
	public void ppangppang() {
		System.out.println("빵빵~");
	}
	
	
	//부모로부터 물려받은 메소드 run()을 재정의
	@Override
	public void run() {
//		super.run(); //부모객체의 run()메소드 호출
		System.out.println("버스가 달립니다.");
	}
	
}

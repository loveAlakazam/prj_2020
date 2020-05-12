package part06;

public class Car {
	
	//필드
	String name;
	int number;
	
	//생성자 - 생성자 오버로딩
	public Car(String name, int number) {
		this.name= name;
		this.number=number;
	}
	
	public Car(String name) {
		this.name=name;
	}
	
	public Car(int number) {
		this.number=number;
	}
//	public Car(String name) {
//		this.name=name;
//	}
//	
//	public Car(int number) {
//		this.number= number;
//	}
	
	//기본생성자
//	public Car() {
//		this.name="이름 없음";
//		this.number=0;
//	}
	
	//똑같은 코드를 두번 반복하지 않고 사용해보기
	public Car() {
		//코드 중복을 방지하기
		this("이름 없음", 0); // 기본생성자 호출했을 때
	}
}

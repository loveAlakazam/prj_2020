package part07;

public class Car {
	//생성자 - 기본생성자
	Car(){
		System.out.println("자동차 객체 생성자. - 부모생성자");
	}
	
	Car(String name){
		System.out.println(name+"이름의 자동차 생성자");
	}
	
	//메소드
	public void run() {
		System.out.println("자동차가 달립니다.");
	}
	
	public void stop() {
		System.out.println("이동을 멈춥니다.");
	}
}

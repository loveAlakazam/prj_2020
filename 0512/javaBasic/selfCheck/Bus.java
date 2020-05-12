package selfCheck;

public class Bus extends Car2{
	int fee;
	Bus(String name, int number, int fee){
		super(name, number); //자동차 객체 생성
		this.fee=fee; //fee필드만 따로 정의
		System.out.println("자식객체 생성");
	}
}

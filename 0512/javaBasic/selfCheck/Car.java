package selfCheck;

//구체적인 클래스 (자식)
public class Car extends Machine{
	@Override
	public void turnOff() {
		System.out.println("자동차의 시동을 종료합니다.");	
	}
	
	@Override
	public void turnOn() {
		System.out.println("부릉부릉");
	}
}

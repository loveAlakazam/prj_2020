package selfReview_Abstract;

//추상클래스(부모)
public abstract class Pokemon {
	//필드
	String name; //이름
	int number; //도감번호
	
	//추상 메소드 (공통된 메소드) = 선언만 한다.
	//공통된 행동이지만, 객체마다 행동이 다르므로
	//자식클래스(구체적인 대상)을 정의할 때 오버라이드하여 정의
	//추상클래스에서는 그냥 선언만 한다.
	public abstract void sound();
	public abstract void skill();
	
	//공통된 행동, 객체마다의 행동이 같은 경우
	//물론 얘도 오버라이드를 하여 수정이 가능하다.
	public void sleep() {
		System.out.println("잠자기");
	}
}

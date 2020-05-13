package part08;

// 0513 interface
// 구현은 없고 어떤것만 가지고 있다만 나타냄 

//타입의 역할은 하지만,구현이 없어서.
//인터페이스 자체가 객체를 생성하지 못한다.
public interface TV {
	//상수 (고정된 값) - final 붙이거나, 없어도 상관 없음.
	public int MIN_VOLUME=0;
	public int MAX_VOLUME= 100;
	
	//메소드 정의는 애매모호할때 -> 추상메소드와 유사.
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}

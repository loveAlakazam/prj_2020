package selfCheck;

//추상 클래스(부모)
public abstract class Machine {
	// 구체적인 클래스(객체= 자식클래스)마다 다르므로
	// 추상적으로 표시
	public abstract void turnOn();
	public abstract void turnOff();
}

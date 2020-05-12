package part07;

public abstract class Bird {
	//메소드마다 다를 수 있으므로 abstract를 붙인다. -> 선언만
	public abstract void sound();
	
	//공통적인 메소드
	public void fly() {
		System.out.println("날기");
	}
}

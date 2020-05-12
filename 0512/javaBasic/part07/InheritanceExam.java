package part07;

public class InheritanceExam {

	// 상속에 대한 예제
	public static void main(String[] args) {
		Bus bus= new Bus();
		bus.run(); //자식클래스가 부모클래스의 메소드와 필드를 사용할 수 있다.
		bus.ppangppang(); //확장된 메소드 - 부모클래스로부터 상속받은 것 외의 메소드
	
		Car car= new Car();
		car.run();
//		car.ppangppang(); //부모클래스는 자식이 가지고 있는 것을 사용할 수 없다.
	}
}

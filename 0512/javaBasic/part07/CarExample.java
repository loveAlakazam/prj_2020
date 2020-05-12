package part07;

public class CarExample {

	public static void main(String[] args) {
//		Car car = new Car();
		Texi texi =new Texi(); //자식 생성자 호출 : 부모생성자 호출=> 부모객체 호출 => 자식 생성자 호출 => 자식객체 호출
		
		System.out.println();
		// 메소드 오버라이드
		Bus bus= new Bus();
		bus.run(); //부모로부터 물려받은 run()메소드를 재정의한 run()메소드 실행
	
		//클래스 형변환
		//부모클래스 생성
		Car car = new Car();
		car.run(); //부모클래스의 run()메소드
//		car.ppangppang(); //자식클래스 Bus만 가지고 있으므로 안됨.
		
		bus.run(); //재정의된  run()메소드
		bus.ppangppang();
		
		//부모타입 > 자식타입
		//부모타입을 자식타입으로 형변환
		System.out.println("\n");
		Car c= new Bus(); //객체는 Bus인데, 참조변수 타입은 더 넓은 범위인 Car임
		c.run();
//		c.ppangppang(); //안됨.
		
		Bus car2Bus = (Bus) c;
		car2Bus.run();
		car2Bus.ppangppang();
	}

}

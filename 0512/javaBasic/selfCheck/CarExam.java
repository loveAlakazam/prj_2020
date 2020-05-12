package selfCheck;

public class CarExam {

	public static void main(String[] args) {
		//자동차 객체를 생성 (구체적인 객체)
		Car car = new Car();
		
		//car이 Machine클래스의 인스턴스
		if(Machine.class.isInstance(car)) {
			System.out.println("추상클래스 Machine의 자식클래스 Car의 인스턴스입니다.");
			System.out.println("추상클래스로부터 상속받았습니다.");
		}else {
			System.out.println("구체적인 클래스가 추상클래스로부터 상속을 받지 않았습니다.");
		}

	}

}

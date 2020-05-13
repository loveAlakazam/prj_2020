package part08;

// 내부클래스 3 - 지역 중첩 클래스 = 지역클래스(local class)
// 클래스를 지역변수처럼 선언할 수 있다.
public class InnerExam3 {
	public void exec() {
		//클래스가 메소드 안에 있다.
		class Cal{
			int value=0;
			public void plus() {
				value++;
			}
		}
		
		//클래스가 있는 메소드 안에서 클래스를 호출 할 수 있다.
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
	}
	
	
	public static void main(String[] args) {
		//바깥 클래스(현재클래스)를 생성
		InnerExam3 e = new InnerExam3();
		e.exec();
	}

}

package part08;

//익명 중첩클래스 사용예제
//Action, MyAction 을 사용
public class InnerExam4 {
	public static void main(String[] args) {
		//추상클래스 Action은 타입/부모 역할은 하지만
		// 자체 객체를 만들 수 없다.
		// 타입으로만 역할
		
		// 자식클래스 MyAction 객체를 생성
		//	Action a= new MyAction();
		
		
		//익명클래스는 자식클래스인 MyAction을 직접 만들지 않고
		//Action을 상속받은 익명클래스를 만들어서 사용
		//Action()자체가 생긴거 아님-> Action타입의 익명클래스를 만듦
		Action action = new Action() {
			@Override
			public void exec() {
				System.out.println("anonymous class- exec");
			};
			
		};
		
		//익명객체 사용
		action.exec();
	}
}


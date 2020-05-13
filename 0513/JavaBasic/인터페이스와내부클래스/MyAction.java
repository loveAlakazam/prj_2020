package part08;

//Action클래스는 추상클래스로,부모역할은 할 수 있으나
//추상클래스 그 자체의 객체를 만들 수 없다.
//Action클래스를 상속 받는다.
public class MyAction extends Action {
	//추상메소드 구체화.
	@Override
	public void exec() {
		System.out.println("exec");
	}
}

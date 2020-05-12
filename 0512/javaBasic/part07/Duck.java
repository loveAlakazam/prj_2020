package part07;

//구체적인 대상
public class Duck extends Bird{

	//추상메소드인 sound()를 오버라이드 시켜서
	//객체마다의 메소드를 작성한다.
	@Override
	public void sound() {
		System.out.println("꽥꽥");
	}
	
	
	
}

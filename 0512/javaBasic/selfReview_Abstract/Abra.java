package selfReview_Abstract;

public class Abra extends Pokemon{
	
	//생성자 정의
	Abra(){
		this.name="캐이시";
		this.number=63;
	}
	
	@Override
	public void sound() {
		System.out.println("캐이시이~");
	}
	
	@Override
	public void skill() {
		System.out.println("텔레포트!");
	}
	
	
}

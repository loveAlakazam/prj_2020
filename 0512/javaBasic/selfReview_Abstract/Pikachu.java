package selfReview_Abstract;

public class Pikachu extends Pokemon {
	//생성자 정의
	Pikachu(){
		this.name="피카츄";
		this.number=25;
	}
	
	@Override
	public void sound() {
		System.out.println("피카피까아~");
	}
	
	@Override
	public void skill() {
		System.out.println("백만볼트!");
	}
}

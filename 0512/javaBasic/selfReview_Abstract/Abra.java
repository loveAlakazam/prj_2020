package selfReview_Abstract;

public class Abra extends Pokemon{
	
	//������ ����
	Abra(){
		this.name="ĳ�̽�";
		this.number=63;
	}
	
	@Override
	public void sound() {
		System.out.println("ĳ�̽���~");
	}
	
	@Override
	public void skill() {
		System.out.println("�ڷ���Ʈ!");
	}
	
	
}

package selfReview_Abstract;

public class Pikachu extends Pokemon {
	//������ ����
	Pikachu(){
		this.name="��ī��";
		this.number=25;
	}
	
	@Override
	public void sound() {
		System.out.println("��ī�Ǳ��~");
	}
	
	@Override
	public void skill() {
		System.out.println("�鸸��Ʈ!");
	}
}

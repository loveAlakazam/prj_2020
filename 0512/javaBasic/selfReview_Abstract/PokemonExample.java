package selfReview_Abstract;

public class PokemonExample {

	public static void main(String[] args) {
		//ĳ�̽� Ŭ���� ����
		Abra p1 = new Abra();
		System.out.println("�̸�: "+p1.name +" ������ȣ:"+ p1.number);
		p1.sleep();
		p1.skill();
		p1.sound();
		
		Pikachu p2 =  new Pikachu();
		System.out.println("�̸�: "+p2.name +" ������ȣ:"+ p2.number);
		p2.sleep();
		p2.skill();
		p2.sound();
		

	}

}

package part07;

public class Chicken extends Bird{
	@Override
	public void sound() {
		System.out.println("������ ������");
	}
	
	//�������� �޼ҵ带 �������̵�
	@Override
	public void fly() {
		//		super.fly(); //�θ�Ŭ������ ���ǵ� fly()�� ȣ��
		System.out.println("Ǫ��� Ǫ���");
	}
}

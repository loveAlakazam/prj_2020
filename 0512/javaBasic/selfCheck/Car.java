package selfCheck;

//��ü���� Ŭ���� (�ڽ�)
public class Car extends Machine{
	@Override
	public void turnOff() {
		System.out.println("�ڵ����� �õ��� �����մϴ�.");	
	}
	
	@Override
	public void turnOn() {
		System.out.println("�θ��θ�");
	}
}

package selfReview_Abstract;

//�߻�Ŭ����(�θ�)
public abstract class Pokemon {
	//�ʵ�
	String name; //�̸�
	int number; //������ȣ
	
	//�߻� �޼ҵ� (����� �޼ҵ�) = ���� �Ѵ�.
	//����� �ൿ������, ��ü���� �ൿ�� �ٸ��Ƿ�
	//�ڽ�Ŭ����(��ü���� ���)�� ������ �� �������̵��Ͽ� ����
	//�߻�Ŭ���������� �׳� ���� �Ѵ�.
	public abstract void sound();
	public abstract void skill();
	
	//����� �ൿ, ��ü������ �ൿ�� ���� ���
	//���� �굵 �������̵带 �Ͽ� ������ �����ϴ�.
	public void sleep() {
		System.out.println("���ڱ�");
	}
}

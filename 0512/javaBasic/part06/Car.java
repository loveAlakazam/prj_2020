package part06;

public class Car {
	
	//�ʵ�
	String name;
	int number;
	
	//������ - ������ �����ε�
	public Car(String name, int number) {
		this.name= name;
		this.number=number;
	}
	
	public Car(String name) {
		this.name=name;
	}
	
	public Car(int number) {
		this.number=number;
	}
//	public Car(String name) {
//		this.name=name;
//	}
//	
//	public Car(int number) {
//		this.number= number;
//	}
	
	//�⺻������
//	public Car() {
//		this.name="�̸� ����";
//		this.number=0;
//	}
	
	//�Ȱ��� �ڵ带 �ι� �ݺ����� �ʰ� ����غ���
	public Car() {
		//�ڵ� �ߺ��� �����ϱ�
		this("�̸� ����", 0); // �⺻������ ȣ������ ��
	}
}

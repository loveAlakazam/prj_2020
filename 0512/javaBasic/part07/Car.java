package part07;

public class Car {
	//������ - �⺻������
	Car(){
		System.out.println("�ڵ��� ��ü ������. - �θ������");
	}
	
	Car(String name){
		System.out.println(name+"�̸��� �ڵ��� ������");
	}
	
	//�޼ҵ�
	public void run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
	}
	
	public void stop() {
		System.out.println("�̵��� ����ϴ�.");
	}
}

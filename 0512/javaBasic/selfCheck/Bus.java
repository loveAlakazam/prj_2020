package selfCheck;

public class Bus extends Car2{
	int fee;
	Bus(String name, int number, int fee){
		super(name, number); //�ڵ��� ��ü ����
		this.fee=fee; //fee�ʵ常 ���� ����
		System.out.println("�ڽİ�ü ����");
	}
}

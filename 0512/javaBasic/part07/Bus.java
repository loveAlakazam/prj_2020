package part07;

// CarŬ������ ��ӹްٴ�.
public class Bus extends Car {
	
	//���� ������- �⺻������
	Bus(){
		super(); //�θ� ������ ���� ȣ��
		System.out.println("���� ��ü ����-�ڽĻ����� ȣ��");
	}
	
	//����Ŭ���� ���� ������ �ִ� �޼ҵ�
	public void ppangppang() {
		System.out.println("����~");
	}
	
	
	//�θ�κ��� �������� �޼ҵ� run()�� ������
	@Override
	public void run() {
//		super.run(); //�θ�ü�� run()�޼ҵ� ȣ��
		System.out.println("������ �޸��ϴ�.");
	}
	
}

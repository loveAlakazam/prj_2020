package part07;

public class InheritanceExam {

	// ��ӿ� ���� ����
	public static void main(String[] args) {
		Bus bus= new Bus();
		bus.run(); //�ڽ�Ŭ������ �θ�Ŭ������ �޼ҵ�� �ʵ带 ����� �� �ִ�.
		bus.ppangppang(); //Ȯ��� �޼ҵ� - �θ�Ŭ�����κ��� ��ӹ��� �� ���� �޼ҵ�
	
		Car car= new Car();
		car.run();
//		car.ppangppang(); //�θ�Ŭ������ �ڽ��� ������ �ִ� ���� ����� �� ����.
	}
}

package part07;

public class CarExample {

	public static void main(String[] args) {
//		Car car = new Car();
		Texi texi =new Texi(); //�ڽ� ������ ȣ�� : �θ������ ȣ��=> �θ�ü ȣ�� => �ڽ� ������ ȣ�� => �ڽİ�ü ȣ��
		
		System.out.println();
		// �޼ҵ� �������̵�
		Bus bus= new Bus();
		bus.run(); //�θ�κ��� �������� run()�޼ҵ带 �������� run()�޼ҵ� ����
	
		//Ŭ���� ����ȯ
		//�θ�Ŭ���� ����
		Car car = new Car();
		car.run(); //�θ�Ŭ������ run()�޼ҵ�
//		car.ppangppang(); //�ڽ�Ŭ���� Bus�� ������ �����Ƿ� �ȵ�.
		
		bus.run(); //�����ǵ�  run()�޼ҵ�
		bus.ppangppang();
		
		//�θ�Ÿ�� > �ڽ�Ÿ��
		//�θ�Ÿ���� �ڽ�Ÿ������ ����ȯ
		System.out.println("\n");
		Car c= new Bus(); //��ü�� Bus�ε�, �������� Ÿ���� �� ���� ������ Car��
		c.run();
//		c.ppangppang(); //�ȵ�.
		
		Bus car2Bus = (Bus) c;
		car2Bus.run();
		car2Bus.ppangppang();
	}

}

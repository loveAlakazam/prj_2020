package part05;

public class CarExample {

	public static void main(String[] args) {
		//�޸𸮿� ����� ��ü: �ν��Ͻ�
		//��ü�� �����ϴ� ���� c1,c2
		Car c1=new Car();
		Car c2=new Car();
		
		c1.name="�ҹ���";
		c1.number=1234;
		
		c2.name="�¿���";
		c2.number=43215;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		

		System.out.println(c2.name);
		System.out.println(c2.number);
	}
}

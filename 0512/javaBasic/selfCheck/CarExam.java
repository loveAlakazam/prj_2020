package selfCheck;

public class CarExam {

	public static void main(String[] args) {
		//�ڵ��� ��ü�� ���� (��ü���� ��ü)
		Car car = new Car();
		
		//car�� MachineŬ������ �ν��Ͻ�
		if(Machine.class.isInstance(car)) {
			System.out.println("�߻�Ŭ���� Machine�� �ڽ�Ŭ���� Car�� �ν��Ͻ��Դϴ�.");
			System.out.println("�߻�Ŭ�����κ��� ��ӹ޾ҽ��ϴ�.");
		}else {
			System.out.println("��ü���� Ŭ������ �߻�Ŭ�����κ��� ����� ���� �ʾҽ��ϴ�.");
		}

	}

}

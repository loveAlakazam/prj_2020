package part05;

public class MethodDefinition {
	//�޼ҵ� ����
	//public ����Ÿ�� �޼ҵ��̸� (�Ű�����) {}
	
	//1.
	//����Ÿ���� ���� �޼ҵ�
	//�Ű������� ����.
	public void method1() {
		System.out.println("�޼ҵ�1 ����");
	}
	
	//2.
	//�Ű����� ����
	//����Ÿ�Ծ���
	public void method2(int val) {
		System.out.println("�޼ҵ�2 ����");
		System.out.println("�Ű�������: "+val+"�� �̿���.");
	}
	
	//3.
	//�Ű���������.
	//��������
	public int method3() {
		System.out.println("�޼ҵ�3 ����");
		return 3;
	}
	
	//4.
	//�Ű����� 2��
	//���Ͼ���
	public void method4(int x, int y) {
		System.out.println("�޼ҵ�4 ����");
		System.out.println("x: "+x+"y: "+y);
		System.out.println("x+y="+(x+y));
	}
	
	//5
	//�Ű����� 1��
	//��������
	public int method5(int y) {
		System.out.println("�޼ҵ�5 ����");
		System.out.println("y: "+y);
		return y*y;
	}

}

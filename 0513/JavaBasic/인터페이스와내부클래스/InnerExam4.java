package part08;

//�͸� ��øŬ���� ��뿹��
//Action, MyAction �� ���
public class InnerExam4 {
	public static void main(String[] args) {
		//�߻�Ŭ���� Action�� Ÿ��/�θ� ������ ������
		// ��ü ��ü�� ���� �� ����.
		// Ÿ�����θ� ����
		
		// �ڽ�Ŭ���� MyAction ��ü�� ����
		//	Action a= new MyAction();
		
		
		//�͸�Ŭ������ �ڽ�Ŭ������ MyAction�� ���� ������ �ʰ�
		//Action�� ��ӹ��� �͸�Ŭ������ ���� ���
		//Action()��ü�� ����� �ƴ�-> ActionŸ���� �͸�Ŭ������ ����
		Action action = new Action() {
			@Override
			public void exec() {
				System.out.println("anonymous class- exec");
			};
			
		};
		
		//�͸�ü ���
		action.exec();
	}
}


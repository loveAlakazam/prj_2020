package part08;

//����Ŭ���� 1- ��øŬ����= �ν��Ͻ� Ŭ����
public class InnerExam1 {
	//���ο� Ŭ������ ���ǵǾ��ִ�.
	class Cal{
		int value=0;
		public void plus() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		//�ٱ��� Ŭ���� InnerExam1 ��ü�� �����������
		InnerExam1 e= new InnerExam1();
		
		//�ٱ�Ŭ����Ÿ��.����Ŭ�����̸� �������� = �ٱ���������.new ����Ŭ����������();
		InnerExam1.Cal cal = e.new Cal();
		System.out.println(cal.value);
		cal.plus();
		System.out.println(cal.value);
	}

}

package part08;

// ����Ŭ���� 3 - ���� ��ø Ŭ���� = ����Ŭ����(local class)
// Ŭ������ ��������ó�� ������ �� �ִ�.
public class InnerExam3 {
	public void exec() {
		//Ŭ������ �޼ҵ� �ȿ� �ִ�.
		class Cal{
			int value=0;
			public void plus() {
				value++;
			}
		}
		
		//Ŭ������ �ִ� �޼ҵ� �ȿ��� Ŭ������ ȣ�� �� �� �ִ�.
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
	}
	
	
	public static void main(String[] args) {
		//�ٱ� Ŭ����(����Ŭ����)�� ����
		InnerExam3 e = new InnerExam3();
		e.exec();
	}

}

package part08;

// ����Ŭ����2 - ���� ��øŬ����, static Ŭ����
public class InnerExam2 {

	static class Cal{
		int value=0;
		public void plus() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		//�ٱ��� Ŭ���� InnerExam2�ȿ� �ִ� static Ŭ���� Cal
		InnerExam2.Cal cal = new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);

	}

}

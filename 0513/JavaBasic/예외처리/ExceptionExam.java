package part09;

public class ExceptionExam {

	public static void main(String[] args) {
		int i, j, k;
//		i=10;
//		j=5;
//		k=i/j;
//		System.out.println(k); //=>2

		//���ܸ� ������.
//		i=10;
//		j=0;
//		k=i/j;
//		System.out.println(k); //=>ArithmeticException �߻�
//		System.out.println("main end");
//	
		i=10;
		j=0;
		
		try {
			k=i/j;
			System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�."+e.toString());
		}finally {
			System.out.println("finally-block�� ������ ����");
		}
		System.out.println("main end");
	
	
	}
}

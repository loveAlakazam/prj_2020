package part09;

public class ExceptionExam2 {

	public static void main(String[] args) {
		int i=10;
		int j=0;
		try {
			float k= divide(i,j);
			System.out.println("k: "+ k);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
		//���� ó������ �ʰ�
		//���� ȣ���� �ʿ��� ó���ϵ����ϱ� -> throws
	}
	
//	public static float divide(float i, float j) {
//		return i/j;
//	}
	
	public static float divide(float i, float j) throws ArithmeticException, Exception{
		return i/j;
	}
}

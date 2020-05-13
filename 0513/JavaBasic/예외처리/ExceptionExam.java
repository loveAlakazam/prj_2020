package part09;

public class ExceptionExam {

	public static void main(String[] args) {
		int i, j, k;
//		i=10;
//		j=5;
//		k=i/j;
//		System.out.println(k); //=>2

		//예외를 만들어보자.
//		i=10;
//		j=0;
//		k=i/j;
//		System.out.println(k); //=>ArithmeticException 발생
//		System.out.println("main end");
//	
		i=10;
		j=0;
		
		try {
			k=i/j;
			System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다."+e.toString());
		}finally {
			System.out.println("finally-block은 무조건 실행");
		}
		System.out.println("main end");
	
	
	}
}

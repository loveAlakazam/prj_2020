package part09;

// 강제로 오류를 발생시키는 throw
// throw를 이용하여 직접 exception을 발생.
public class ExceptionExam3 {

	public static void main(String[] args) {
		int i=10;
		int j=0;
		try {
			int k= divide(i,j);
			System.out.println(k);
		}catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}
	}
	
	public static int divide(int i, int j) throws IllegalArgumentException{
		if(j==0) {
//			System.out.println("변수 j는 0이면 안됩니다.");
//			return 0; //예외사항 발생했는데 잘못된 값으로 리턴..=> 문제될수 있따.
			
			//직접 오류를 발생시킨다. -> argument가 잘못됐기 때문에, 오류가 발생함을 알려준다.
			throw new IllegalArgumentException("0으로 나눌 수 없습니다!");
			
		}
		int k=i/j;
		return k;
	}

}

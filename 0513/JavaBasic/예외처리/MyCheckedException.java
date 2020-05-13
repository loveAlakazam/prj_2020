package part09;

//사용자 정의 예외
public class MyCheckedException extends Exception{
	public MyCheckedException() {
		
	}
	
	public MyCheckedException(String msg) {
		super(msg);
	}
	
	public MyCheckedException(Exception ex) {
		super(ex);
	}

}

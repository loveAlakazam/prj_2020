package part09;

//����� ���� ����
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

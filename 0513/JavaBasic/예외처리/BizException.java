package part09;

// 사용자 정의 예외
public class BizException extends  RuntimeException {
	//생성자
	public BizException(String msg) {
		//어떤 오류를 발생시켰는가?
		super(msg); //문자열 예외
	}
	
	// 해당 생성자를 부모에게 전달.
	public BizException(Exception ex) {
		super(ex); // 실제 예외
	}
}

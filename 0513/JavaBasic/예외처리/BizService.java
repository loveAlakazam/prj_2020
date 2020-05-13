package part09;

public class BizService {
	
	public void bizMethod(int i) throws BizException{
		System.out.println("비즈니스 메소드 시작");
		
		if( i<0) {
			//0보다 작으면 예외 발생
			throw new BizException("매개변수 i가 0보다 작습니다. 그러므로 BizException이 발생합니다.");			
		}
		
		System.out.println("비즈니스 메소드 종료");
	}
}

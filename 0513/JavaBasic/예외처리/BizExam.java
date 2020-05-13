package part09;

public class BizExam {

	public static void main(String[] args) {
		BizService biz = new BizService();
		biz.bizMethod(5);
		
		try {
			biz.bizMethod(-1); //0보다 작음 -> 사용자 예외발생
		}catch(BizException e) {
			e.printStackTrace();
		}
	}

}

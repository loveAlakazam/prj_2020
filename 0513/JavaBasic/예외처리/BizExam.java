package part09;

public class BizExam {

	public static void main(String[] args) {
		BizService biz = new BizService();
		biz.bizMethod(5);
		
		try {
			biz.bizMethod(-1); //0���� ���� -> ����� ���ܹ߻�
		}catch(BizException e) {
			e.printStackTrace();
		}
	}

}

package part09;

// ����� ���� ����
public class BizException extends  RuntimeException {
	//������
	public BizException(String msg) {
		//� ������ �߻����״°�?
		super(msg); //���ڿ� ����
	}
	
	// �ش� �����ڸ� �θ𿡰� ����.
	public BizException(Exception ex) {
		super(ex); // ���� ����
	}
}

package part08;

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	//default �޼ҵ� => �������̽����� �޼ҵ带 ������ �� �ִ�.
	default int exec(int i, int j) {
		return i+j;
	}
	
	//static �޼ҵ�
	public static int exec2(int i, int j) {
		return i+j+1;
	}

}

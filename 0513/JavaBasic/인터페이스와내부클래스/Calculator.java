package part08;

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	//default 메소드 => 인터페이스에서 메소드를 구현할 수 있다.
	default int exec(int i, int j) {
		return i+j;
	}
	
	//static 메소드
	public static int exec2(int i, int j) {
		return i+j+1;
	}

}

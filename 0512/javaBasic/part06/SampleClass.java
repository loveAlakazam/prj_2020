package part06;

public class SampleClass {
	String name;
	int number;
	
	//������ �����ε�
	//�Ű������� �ٸ��� �Ͽ� �������� �����ڸ� ������ �� �ִ�.
	public SampleClass() {
		
	}
	
	public SampleClass(String name) {
		this.name=name;
	}
	
	public SampleClass(String name, int number) {
		this.name=name;
		this.number=number;
	}
	
	//�޼ҵ� �����ε�
	public int plus(int x, int y) {
		return x+y;
	}
	
	public int plus(float x, float y) {
		return (int)(x+y);
	}
	
	public int plus(int x, int y, int z) {
		return x+y+z;
	}
	
	//����Ÿ���� String
	public String plus(String x, String y) {
		return x+" "+y;
	}
}

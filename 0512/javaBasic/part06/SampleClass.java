package part06;

public class SampleClass {
	String name;
	int number;
	
	//생성자 오버로딩
	//매개변수를 다르게 하여 여러개의 생성자를 정의할 수 있다.
	public SampleClass() {
		
	}
	
	public SampleClass(String name) {
		this.name=name;
	}
	
	public SampleClass(String name, int number) {
		this.name=name;
		this.number=number;
	}
	
	//메소드 오버로딩
	public int plus(int x, int y) {
		return x+y;
	}
	
	public int plus(float x, float y) {
		return (int)(x+y);
	}
	
	public int plus(int x, int y, int z) {
		return x+y+z;
	}
	
	//리턴타입이 String
	public String plus(String x, String y) {
		return x+" "+y;
	}
}

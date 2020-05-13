package part08;

public class MyCalc implements Calculator {

	@Override
	public int plus(int i, int j) {
		return i+j;
	}

	@Override
	public int multiple(int i, int j) {
		return i*j*2;
	}

}

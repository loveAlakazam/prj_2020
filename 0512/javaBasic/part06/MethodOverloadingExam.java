package part06;

public class MethodOverloadingExam {

	public static void main(String[] args) {
		SampleClass m= new SampleClass();
		System.out.println(m.plus(4,5));
		System.out.println(m.plus(4, 5,6));
		System.out.println(m.plus("hello", "java"));
	}

}

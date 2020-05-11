package part05;

public class VariableScopeExam {

	int globalScope=10;
	static int globalScope2=11;
	public void scopeTest(int value) {
		int localScope=20;
		//전역변수 사용 가능
		System.out.println(globalScope);
		
		System.out.println(localScope);
		
		//메소드 블록 내에서 매개변수 사용가능
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
		//		System.out.println(localScope); //사용못함
		//		System.out.println(value);//사용못함
		System.out.println(value2);
		System.out.println(globalScope2);//static에서 사용
	}
	public static void main(String[] args) {
		//		System.out.println(globalScope);//사용못함..=> 이유:static
		//객체를 생성하여 정의한다.
		
		
		
		VariableScopeExam v= new VariableScopeExam();
		VariableScopeExam v2= new VariableScopeExam();
		
		v.globalScope*=10;
		v2.globalScope-=2;
		
		System.out.println("v.globalScope= "+v.globalScope);
		System.out.println("v2.globalScope= "+v2.globalScope);
		System.out.println("static value"+globalScope2);
		
		v.globalScope2=50;
		v.globalScope2=100;
		System.out.println("static value: "+globalScope2);
		//바람직한 클래스변수 사용법= 클래스이름.클래스변수
		System.out.println("static value: "+VariableScopeExam.globalScope2);
	}

}

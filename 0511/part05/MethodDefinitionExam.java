package part05;

public class MethodDefinitionExam {

	public static void main(String[] args) {
		//MethodDefinition ��ü�� �����ؾ��Ѵ�
		MethodDefinition md= new MethodDefinition();
		md.method1();
		md.method2(2);
		int result3= md.method3();
		System.out.println("method3()���� ���: "+result3);
		
		md.method4(4, 5);
		int result5=md.method5(5);
		System.out.println("method5()���� ���: "+result5);
	}
}

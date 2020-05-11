package part05;

public class VariableScopeExam {

	int globalScope=10;
	static int globalScope2=11;
	public void scopeTest(int value) {
		int localScope=20;
		//�������� ��� ����
		System.out.println(globalScope);
		
		System.out.println(localScope);
		
		//�޼ҵ� ��� ������ �Ű����� ��밡��
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
		//		System.out.println(localScope); //������
		//		System.out.println(value);//������
		System.out.println(value2);
		System.out.println(globalScope2);//static���� ���
	}
	public static void main(String[] args) {
		//		System.out.println(globalScope);//������..=> ����:static
		//��ü�� �����Ͽ� �����Ѵ�.
		
		
		
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
		//�ٶ����� Ŭ�������� ����= Ŭ�����̸�.Ŭ��������
		System.out.println("static value: "+VariableScopeExam.globalScope2);
	}

}

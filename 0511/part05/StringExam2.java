package part05;

public class StringExam2 {

	public static void main(String[] args) {
		String str= "hello ";
		System.out.println(str.length()); //���ڿ��� ����
		
		
		System.out.println(str.concat("java")); //�ٿ��µ� str�ʱ� ���ڿ��� ����.
		System.out.println(str);
		
		//str�� hello java�� �ϰ�ʹ�.
		str=str.concat("java");
		System.out.println(str);
		
		//substring(�����ε���)
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7)); //3~7������ �߶��ּ���
	}

}

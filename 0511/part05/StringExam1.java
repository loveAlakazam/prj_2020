package part05;

public class StringExam1 {

	public static void main(String[] args) {
		String str1= "hello";
		String str2= "hello";
		
		String str3= new String("hello");
		
		if(str1==str2){
			System.out.println("str1�� str2�� ���� ������");
		}
		
		if(str1==str3) {
			System.out.println("str1�� str3�� ��������");
		}else {
			System.out.println("str1�� str3�� �ٸ� ����");
		}
		
		System.out.println(str1);
		System.out.println(str1.substring(3));
		System.out.println(str1);

	}

}

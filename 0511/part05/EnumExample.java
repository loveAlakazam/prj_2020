package part05;

public class EnumExample {

	//����� �빮�ڷ� ���°� ����.
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	
	public static void main(String[] args) {
		String gender1;
		
		//Ŭ����.Ŭ�������� ���� Ŭ���������� ����� �� �ִ�.
		//static�ʵ� ������ ��ü�������� �ʰ� ����� �� �ִ�.
		gender1=EnumExample.MALE;
		gender1=EnumExample.FEMALE;
		gender1="boy";
		
		
		Gender gender2;
		gender2=Gender.FEMALE;
		//	gender2="boy"; //Ư������ �ٸ����� ����ȵ�.

	}
}

enum Gender{
	MALE, FEMALE
};
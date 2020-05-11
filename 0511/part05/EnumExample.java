package part05;

public class EnumExample {

	//상수는 대문자로 쓰는게 좋다.
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	
	public static void main(String[] args) {
		String gender1;
		
		//클래스.클래스변수 으로 클래스변수를 사용할 수 있다.
		//static필드 선언은 객체생성하지 않고도 사용할 수 있다.
		gender1=EnumExample.MALE;
		gender1=EnumExample.FEMALE;
		gender1="boy";
		
		
		Gender gender2;
		gender2=Gender.FEMALE;
		//	gender2="boy"; //특정값외 다른값은 저장안됨.

	}
}

enum Gender{
	MALE, FEMALE
};
package part05;

public class StringExam2 {

	public static void main(String[] args) {
		String str= "hello ";
		System.out.println(str.length()); //문자열의 길이
		
		
		System.out.println(str.concat("java")); //붙였는데 str초기 문자열만 나옴.
		System.out.println(str);
		
		//str이 hello java로 하고싶다.
		str=str.concat("java");
		System.out.println(str);
		
		//substring(시작인덱스)
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7)); //3~7번까지 잘라주세요
	}

}

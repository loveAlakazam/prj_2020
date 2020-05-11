package part05;

public class StringExam1 {

	public static void main(String[] args) {
		String str1= "hello";
		String str2= "hello";
		
		String str3= new String("hello");
		
		if(str1==str2){
			System.out.println("str1과 str2는 같은 참조함");
		}
		
		if(str1==str3) {
			System.out.println("str1과 str3는 같은참조");
		}else {
			System.out.println("str1과 str3는 다른 참조");
		}
		
		System.out.println(str1);
		System.out.println(str1.substring(3));
		System.out.println(str1);

	}

}

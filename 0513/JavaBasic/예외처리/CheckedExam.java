package part09;

public class CheckedExam {

	public static void main(String[] args) {
		CheckedExam exam = new CheckedExam();
		int []array= new int[10];
		try {
			exam.get50thItem(array);
		}catch(MyCheckedException e) {
			System.out.println("사용자 정의 예외 발생");
		}
		
	}
	
	public int get50thItem(int []array) throws MyCheckedException{
		if(array.length<50) {
			throw new MyCheckedException("배열의 길이가 50보다 작습니다.");
		}
		return array[49];
	}

}

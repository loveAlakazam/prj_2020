package part09;

public class CheckedExam {

	public static void main(String[] args) {
		CheckedExam exam = new CheckedExam();
		int []array= new int[10];
		try {
			exam.get50thItem(array);
		}catch(MyCheckedException e) {
			System.out.println("����� ���� ���� �߻�");
		}
		
	}
	
	public int get50thItem(int []array) throws MyCheckedException{
		if(array.length<50) {
			throw new MyCheckedException("�迭�� ���̰� 50���� �۽��ϴ�.");
		}
		return array[49];
	}

}

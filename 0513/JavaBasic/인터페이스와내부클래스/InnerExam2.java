package part08;

// 내부클래스2 - 정적 중첩클래스, static 클래스
public class InnerExam2 {

	static class Cal{
		int value=0;
		public void plus() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		//바깥쪽 클래스 InnerExam2안에 있는 static 클래스 Cal
		InnerExam2.Cal cal = new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);

	}

}

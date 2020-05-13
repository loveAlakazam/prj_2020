package part08;

//내부클래스 1- 중첩클래스= 인스턴스 클래스
public class InnerExam1 {
	//내부에 클래스가 정의되어있다.
	class Cal{
		int value=0;
		public void plus() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		//바깥쪽 클래스 InnerExam1 객체가 만들어져야함
		InnerExam1 e= new InnerExam1();
		
		//바깥클래스타입.내부클래스이름 참조변수 = 바깥참조변수.new 안쪽클래스생성자();
		InnerExam1.Cal cal = e.new Cal();
		System.out.println(cal.value);
		cal.plus();
		System.out.println(cal.value);
	}

}

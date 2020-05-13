package part08;

public class MyCalcExam {

	public static void main(String[] args) {
		Calculator cal = new MyCalc();
		cal.plus(1, 2);
		cal.multiple(5, 6);
		
		//default 메소드 사용
		int result=cal.exec(8, 10);
		System.out.println(result);
		
//		cal.exec2(9,9); 
		System.out.println(Calculator.exec2(9, 9));
	}

}

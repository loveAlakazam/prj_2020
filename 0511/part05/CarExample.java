package part05;

public class CarExample {

	public static void main(String[] args) {
		//메모리에 만드는 객체: 인스턴스
		//객체를 참조하는 변수 c1,c2
		Car c1=new Car();
		Car c2=new Car();
		
		c1.name="소방차";
		c1.number=1234;
		
		c2.name="승용차";
		c2.number=43215;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		

		System.out.println(c2.name);
		System.out.println(c2.number);
	}
}

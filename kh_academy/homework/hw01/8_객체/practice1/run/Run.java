package com.kh.example.practice1.run;
import com.kh.example.practice1.model.vo.Member;


public class Run {
	public static void main(String []args) {
		// 클래스 실습예제 1
		// 객체(인스턴스) 생성
		// 참조형변수 member에는 
		// new 연산자로 인한 생성자에 의해서 만들어진 객체의 주소
		// 즉, 메모리의 힙영역에서 만들어진 객체의 주소값을 저장하고 있다.
		
		Member member1= new Member(); //객체 생성
		member1.printName(); // printName() 메소드 호출
		// 참조형 변수의 초기값은 null이다. (JVM 기본값은 null 이다.)
		
		
		Member member2= new Member("최은강","ek1216","e1234" );
		//필드는 인스턴스 변수이므로 객체를 생성한뒤에 불러올수 있다.
		//그런데 Member 클래스 안에 있는 필드들은 모두 private 로 되어있어서
		//즉, 캡슐화 되어있어서 외부에서 필드를 조회할 수 없다.
//		System.out.println("이름: "+ member2.memberName);
		// error mesage: The field Member.memberName is not visible
		member2.printName();
		
		
		Member member3= new Member("김은강", "ek12", "e567", 10);
		member3.printName(); // changeName() 메소드 호출
		
		// 이름 변경: 김은강 -> 박은강
		member3.changeName("박은강");
		
		member3.printName();// printName() 메소드 호출
	}
}

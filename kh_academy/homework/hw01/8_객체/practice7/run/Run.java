package com.kh.example.practice7.run;
import com.kh.example.practice7.model.vo.Employee;
public class Run {
	
	// afterGetter() 란
	// getter함수를 이용해서  변경된 필드값을 확인하기 위해서 만든 메소드이다.
	public static void afterGetter(Employee e) {
		// 매개변수인 참조형변수 e에  Employee객체의 주소값을 얕은복사 시킨다.
		int empNo= e.getEmpNo();
		System.out.println("empNo: "+empNo);
		
		String empName= e.getEmpName();
		System.out.println("empName: "+ empName);
		
		String dept= e.getDept();
		System.out.println("dept: "+ dept);
		
		String job=e.getJob();
		System.out.println("job: "+ job);
		
		int age=e.getAge();
		System.out.println("age: "+ age);
		
		char gender= e.getGender();
		System.out.println("gender: "+ gender);
		
		int salary= e.getSalary();
		System.out.println("salary: "+ salary);
		
		double bonusPoint= e.getBonusPoint();
		System.out.println("bonusPoint: "+ bonusPoint);
		
		String phone= e.getPhone();
		System.out.println("phone: "+ phone);
		
		String address= e.getAddress();
		System.out.println("address: "+ address);
		
		System.out.println();

	}
	
	public static void main(String [] args) {
		// 기본 생성자로 객체를 만들고
		Employee employee= new Employee();
		
		// 기본생성자로 만들어진 객체의 주소를 employee가 담고 있다.
		// employee가 가리키는 객체의 필드들은 어떤값으로 초기화 되고있는지
		// printEmployee() 메소드를 실행해본다.
		
		// static 메모리에공유하는 메소드를 출력하고
		// 클래스 메소드: (클래스이름).(메소드이름)
		// 클래스 변수: (클래스이름).(필드이름)
		Run.afterGetter(employee); //employee객체가 가리키는 주소를 얕은복사.
		// 참조형변수 기본값: null
		// 정수형(int) 변수 기본값: 0
		// 실수형(double) 변수 기본값: 0.0
		
		
		// setter를 이용해 값을 변경한 후에
		employee.setEmpNo(100); // 0->100
		employee.setEmpName("홍길동");// 이름 변경: null ->홍길동
		employee.setDept("개발부"); // 개발부서 변경: null -> 영업부
		employee.setJob("과장"); // null -> 과장
		employee.setAge(25); // 0->25
		employee.setGender('남');// ->남
		employee.setSalary(2500000); // 0->2500000
		employee.setBonusPoint(0.05); //0.0->0.05
		employee.setPhone("010-1234-5678"); //null -> 010-1234-5678 
 		employee.setAddress("서울시 강남구"); // null -> 서울시 강남구 
	
		
		// getter을 이용해서 출력은 -> Run.afterGetter() 메소드에 정의되어있다.
 		Run.afterGetter(employee);
	}
}

package com.kh.example.practice7.model.vo;

public class Employee {
	
	// 필드 //
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;

	
	// 생성자 //
	public Employee() {
		// 기본 생성자 
		// 매개변수가 있는 생성자를 만들게 되면
		// JVM에서 자동으로 생성해주는 기본생성자를 더이상 사용할 수 없다.
		// 매개변수가 있는 생성자를 만든 후에도 기본생성자를 사용하고 싶다면 직접 작성해야한다.
		
	}
	

	// 매개변수가 있는 생성자 -1
	public Employee(int empNo, String empName) {
		this.empNo =empNo;
		this.empName= empName;
	}
	
	

	// 매개변수가 있는 생성자 -2
	public Employee(int empNo, String empName, String dept,
			String job, int age, char gender, int salary,
			double bonusPoint, String phone, String address) {
		this(empNo, empName); 
		// this(): 생성자를 오버로딩 할 수 있지만
		// 코드 중복을 막기위해서 이미 정의된 생성자를 이용하여
		// 기존생성자에서 초기화 할 수 없는 필드를 초기화할 수 있다.
		this.dept= dept;
		this.job=job;
		this.age=age;
		this.gender=gender;
		this.salary=salary;
		
		this.bonusPoint= bonusPoint;
		this.phone=phone;
		this.address=address;
	}
	
	
	
	// 메소드 //
	// 특정필드를 수정해야될 때, 그필드의 값을 꺼내고 싶을 때
	// 이름을 다르게하다보면, 혼란스러울 수 있다.
	
	// getter(): 리턴을 통해서 특정 필드의 값을 불러온다.
	// setter(): 매개변수에 저장된 값을 필드에 넣어서 초기화 시킨 필드값을 업데이트 시킨다.
	
	
	// empNo필드 
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public int getEmpNo() {
		return this.empNo;
	}
	
	// empName 필드
	public void setEmpName(String empName) {
		// 매개변수값을 통해서 저장한다.
		this.empName= empName;
	}
	
	public String getEmpName() {
		return this.empName;
	}
	
	// dept필드
	public void setDept(String dept) {
		this.dept=dept;
	}
	
	public String getDept() {
		return this.dept;
	}
	
	
	// job 필드
	public void setJob(String job) {
		this.job= job;
	}
	
	public String getJob() {
		return this.job;
	}
	
	
	// age 필드
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	//gender 필드
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	
	// salary 필드
	public void setSalary(int salary) {
		this.salary= salary;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	// bonusPoint 필드
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	
	public double getBonusPoint() {
		return this.bonusPoint;
	}
	
	
	// phone 필드
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	// address 필드
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	
	// static 블록 안=> static 변수 가능 / 인스턴스 변수 불가능(객체를 따로 생성해야됨)
	// 인스턴스 블록 안=> static 가능/ 인스턴스 변수 가능.

}

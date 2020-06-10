package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		// 연도가 윤년이면 true
		// 평년이면 false 리턴
		// 윤년: 연도가 4의배수
		//		100의 배수가 아니거나
		//		400의 배수가 되는해
		return ((year%4==0)&&(year%100!=0)&&(year%400==0))?true:false;
	}
	
	public long leapDate(Calendar c) {
		// 상속을 이용 - 인스턴스변수 c는 Calendar타입을
		// 실제로 매개변수에 얕은복사될 주소값은 GregorianCalendar객체(자식클래스)
		// 그러면 현재 c는 부모타입으로 되어있으므로, 부모클래스에 해당하는 멤버들만 사용가능
		// 자식꺼를 사용하고 싶다면 다운캐스팅을 해야함.
		long days= ((GregorianCalendar)c).getTimeInMillis(); //1970년1월1일~현재까지 ms단위로 나타냄.
		days=(long)((double)(days/(24*60*60*1000))); // 1일=24시간*60분*60초*1000ms
		// 1년 1월 1일부터 오늘까지의 총 날 수를 계산
		// 1년부터 현재 연도까지 각 연도가 윤년이면=> 366일
		// 						  평년이면 => 365일
		
		// 1년 1월 1일 부터 1970년 1월 1일 까지 계산.
		//해당 현재 연도가 윤년이면 2월=> 29일로
		//해당 현재 연도가 평년이면 2월=> 28일 더함.
		long oneTo1970=0L; //1970년까지.
		for(int year=1; year<1970; year++)
			days+=(isLeapYear(year))?366:365; //윤년인가?
		
		return days;
	}
}

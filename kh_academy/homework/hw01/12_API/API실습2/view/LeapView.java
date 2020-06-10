package com.kh.practice.leap.view;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	//LeapController 호출
	LeapController lc= new LeapController();
	
	public LeapView() {
		//기본생성자
		//1년1월1일부터 지금까지 며칠이 지났는지 모두 출력.	
		Calendar calendar=Calendar.getInstance();
		
		//년도정보 출력
		int year= calendar.get(Calendar.YEAR); //년도
		int month= calendar.get(Calendar.MONTH);//월
		int day=calendar.get(Calendar.DATE); //일
		int weekIdx=calendar.get(Calendar.DAY_OF_WEEK);
		char [] weekdays= {'일','월','화','수','목','금','토'};

		System.out.printf("오늘은 %d년 %d월 %d일 (요일) 입니다.\n",year,month,day,weekdays[weekIdx]);
		String yearInfo=(lc.isLeapYear(year))?"윤년":"평년";
		System.out.println(year+"년은 "+yearInfo+"입니다.");
		
//		Date today= new Date(); //오늘 날짜
//		long days= today.getTime(); //ms 단위 / 1970/1/1 0시0분0초 ~ 현재까지
//		System.out.println("Date().getTime(): "+days );
		
		GregorianCalendar gc=new GregorianCalendar();
//		System.out.println("gc.getTimeInMillis(): "+gc.getTimeInMillis()); // ms 단위가 나온다.
		long days=lc.leapDate(gc);
		System.out.println("총 날짜 수: "+days);
		
//		SimpleDateFormat sdf= new SimpleDateFormat("d"); //현재 일수만 나타낸다.
//		System.out.println(sdf.format(today)+"일");
	}

}

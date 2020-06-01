package com.kh.example.chap03_package_import.controller;

import java.sql.Date;
import java.util.Scanner;

public class PackageImport {
	public void test() {
		Scanner sc= new Scanner(System.in);
		//import가 없다면
		
		//import 가 필요없는 패키지: 같은 패키지 내 클래스 , java.lang
		
		Date sql=new Date(100L);
		java.util.Date util = new java.util.Date();
		
	}
}

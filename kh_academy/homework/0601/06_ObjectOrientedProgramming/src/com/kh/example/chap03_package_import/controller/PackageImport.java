package com.kh.example.chap03_package_import.controller;

import java.sql.Date;
import java.util.Scanner;

public class PackageImport {
	public void test() {
		Scanner sc= new Scanner(System.in);
		//import�� ���ٸ�
		
		//import �� �ʿ���� ��Ű��: ���� ��Ű�� �� Ŭ���� , java.lang
		
		Date sql=new Date(100L);
		java.util.Date util = new java.util.Date();
		
	}
}

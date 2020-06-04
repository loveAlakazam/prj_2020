package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;
public class CircleController {
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		//필드값 변경
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double area=Math.pow(c.getRadius(),2)*Circle.PI;
		return "면적: "+ c.toString() + area;
	}
	
	public String calcCircum(int x, int y, int radius) {
		// 필드값 변경
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double circum= 2* Circle.PI * c.getRadius();
		return "둘레: "+c.toString() + circum;
	}
}

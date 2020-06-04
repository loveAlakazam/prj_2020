package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;
public class RectangleController {
	//필드 fields//
	private Rectangle r = new Rectangle();
	
	//생성자 constructor //
	public RectangleController(){
		//기본생성자
	}
	
	//메소드 methods //
	public String calcArea(int x,int y, int height, int width) {
		//면적
		int area= width*height;
		return "면적: "+r.toString()+ area;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		//둘레
		int perimeter= 2*(width+height);
		return "둘레: "+r.toString()+perimeter;
	}
}

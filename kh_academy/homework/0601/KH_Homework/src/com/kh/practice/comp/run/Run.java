package com.kh.practice.comp.run;

import com.kh.practice.comp.func.CompExample;
import com.kh.practice.comp.func.UpAndDown;
import com.kh.practice.comp.func.RockPaperScissors;

public class Run {

	public static void main(String[] args) {
		CompExample ce= new CompExample();
		ce.practice1();
		ce.practice2();
		ce.practice3();
		ce.practice4();
		
		//실습문제5
		UpAndDown ud = new UpAndDown();
		ud.upDown();
		
		//실습문제6
		RockPaperScissors rps= new RockPaperScissors();
		rps.rps();
	}
}

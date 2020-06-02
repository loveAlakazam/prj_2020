package com.kh.practice.snack.controller;
import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	// model 과 view를 연결한다. 
	Snack s =null;
	
	// 기본생성자 //
	public SnackController() {
		
	}
	
	// 메소드 //
	// SnackMenu의 menu()메소드에서, 사용자로부터  입력한 데이터를 저장.
	public String saveData( String kind, String name, String flavor,
			int numOf, int price) {
		
		// 객체 Snack 을 생성하여
		// 사용자로부터 입력 받은  데이터를 setter를 이용하여 저장 
		s =new Snack();
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf );
		s.setPrice(price);
		
		// 저장완료됐다는 결과를 반환시켜준다.
		return "저장 완료 되었습니다!";
	}
	
	// SnackMenu 클래스에서 showData가 'y'인 경우에 호출하는 함수
	// 사용자로부터 입력한 데이터를 조회할 수 있다.
	public String confirmData() {
		//저장된 데이터를 반환하는 메소드
		return s.information();
		
	}
}

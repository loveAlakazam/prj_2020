package com.kh.practice.chap01_poly.controller;
// controller패키지: view와 model 을 연결하며
//데이터 처리를 담당.

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	// 필드
	private Member mem = null; // reference variable/ null로 초기화
	
	//객체배열- 크기5할당-공간만할당해서 모든 원소가 null
	private Book [] bList= {
			new CookBook("백종원의 집밥","백종원","tvN",true),
			new AniBook("한번 더 해요", "미티", "원모어", 19),
			new AniBook("원피스", "루피", "japan", 12),
			new CookBook("이혜정의 얼마나 맛있게요","이혜정","문학",false),
			new CookBook("최현석의 날 따라해봐","최현석","소금책", true)
	};
	
	// 메소드
	public void insertMember(Member mem) {
		// 전달받은 mem 주소값을 통해
		// LibraryController의 mem에 대입
		
		//"얕은복사" 일어남
		// 얕은복사: 주소값만을 복사.
		this.mem=mem; //매개변수: 전달받은 주소값
	}

	public Member myInfo() {
		//회원 래퍼런스(mem)주소값 리턴
		return mem;
	}

	public Book[] selectAll() {
		// 도서 전체 목록(bList)주소값 리턴
		return bList;
	}

	public Book[] searchBook(String keyword) {
		//전달받은 키워드가 포함된 도서가 여러개 존재할 수 있으니
		//검색된 도서를 담아줄 Book객체 배열을 새로 생성
		
		//for문을 통해 bList안의 도서들과
		//전달받은 키워드를 비교하여 포함하고 있는 경우
		//새로운 배열에 차곡차곡 담기 -> 그 배열 주소값 리턴.
		Book[] result=new Book[bList.length]; //Book타입 객체공간 할당.
		
		int keywordIn=0; //키워드가 들어있는 도서의 개수
		for(int i=0; i<bList.length; i++) {
			
			// i번째 도서의 타이틀을 얻는다.
			String title=bList[i].getTitle();
			
			//bList[i]에 keyword가 있다면?
			if(title.contains(keyword)) {
				result[keywordIn++]=bList[i];
			}
		}
		return result;
	}

	public int rentBook(int index) {
		// result 0으로 초기화
		int result=0;
		
		//current: 전달받은 인덱스에 해당하는 책
		//다형성: 부모타 클래스의 래퍼런스 변수는 자식클래스 객체를 참조하는 것.
		Book current= bList[index];
		Member user=myInfo();
		
		//회원의 나이정보를 가지고 온다.
		int userAge= user.getAge();
		
		//전달받은 인덱스가 만화책
		//	=> 회원의 나이와 해당 만화책의 제한나이를 비교하여
		// 	=> 회원나이가 더 적은 경우 result를 1로 초기화	
		
		//전달받은 인덱스의 도서가 요리책인 경우
		// => 해당 요리책의 쿠폰 유무가 유일 경우 
		//   회원의 couponCount를 1증가후
		//    result 2로 초기화  
		//result 리턴
		
		if(current instanceof AniBook) {
			//현재 책이 만화책이라면, 연령제한 나이를 가져온다.
			int accessAge=((AniBook)current).getAccessAge();
			
			//회원의 나이와 비교.
			result=(userAge<accessAge)?1:0;
			
		}else if(current instanceof CookBook){
			//현재 도서가 요리책이라면, 쿠폰 유무를 확인한다.
			
			//쿠폰유무 정보를 가지고 온다.
			boolean isCoupon=((CookBook)current).getCoupon();
			
			if(isCoupon) {
				//쿠폰이 있다.
				result=2;
				
				//쿠폰 개수를 수정한다.
				//회원의 쿠폰개수 정보를 가지고 와서 1씩증가.
				int userCouponCnt=user.getCouponCount();
				user.setCouponCount(++userCouponCnt);
			}
		}
		return result;
	}

}

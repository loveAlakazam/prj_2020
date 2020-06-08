package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

// view 패키지 => 출력결과를 볼 수 있는 패키지.

public class LibraryMenu {
	// 필드
	// 접근제한자: private(-)
	// 캡슐화
	// 현재 클래스 내에서만 접근가능
	// 현재 클래스 밖에서는 접근 못함.
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);

	// 메소드
	public void mainMenu() {
		// 메인메뉴 출력 메소드
		// 이름, 나이, 성별을 키보드로 입력받은후 -> Member 객체 생성
		System.out.println("===== 회원정보 입력 =====");
		System.out.print("이름: ");
		String name = sc.nextLine();

		System.out.print("나이: ");
		int age = Integer.parseInt(sc.nextLine());

		System.out.print("성별: ");
		char gender = sc.nextLine().charAt(0);
		
		// LibraryController의 insertMember()메소드에 전달.
		lc.insertMember(new Member(name, age, gender));
		
		do {
			System.out.println("===== 메            뉴 =====");
			System.out.println("1. 마이 페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴번호: ");
			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				// 마이 페이지
				// lc.myInfo() => 회원객체 Member를 반환
				// toString() => 개인회원정보 문자열 반환
				System.out.println(lc.myInfo().toString());
				break;
			case 2:
				// 도서 전체 조회
				selectAll();
				break;
			case 3:
				// 도서 검색
				searchBook();
				break;

			case 4:
				// 도서 대여하기
				rentBook();
				break;

			case 9:
				// 프로그램 종료하기
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("1,2,3,4,9 중 하나를 다시 입력해주세요!");
				break;
			}
			System.out.println();
		} while (true);
	}

	
	public void selectAll() {
		// 도서 전체 목록 출력 메소드
		// LibraryController의 selectAll() 메소드 호출하여
		// 결과값 Book[] 자료형 bList에 담기
		
		// for문을 이용하여 bList의 모든 도서 목록 출력
		// 단, i를 이용하여 index도 같이 출력
		// index -> 대여할때 도서번호를 알기 위해서 사용.
		
		// ex) 0번도서 : 백종원집밥/ 백종원/ tvN/ true
		// lc.selectAll() => bList 객체배열의 주소값을 출력
		Book [] books=lc.selectAll();
		for(int i=0; i<books.length; i++ ) {
			Book current= books[i];
			String bookInfo="";
			// 현재 책이 가리키는 객체가 만화책이라면-> AniBook으로 다운캐스팅
			if(current instanceof AniBook)
				bookInfo=((AniBook)current).toString();
			
			//현채 책이 가리키는 객체가 요리책이라면-> CookBook으로 다운캐스팅
			else if(current instanceof CookBook)
				bookInfo=((CookBook)current).toString();
			
			System.out.println(bookInfo);
		}
	}

	
	public void searchBook() {
		// 검색할 제목 키워드를 입력받아
		// 검색결과를 출력하는 메소드
		
		// 검색할 제목 키워드 > 입력받음 keyword
		System.out.print("검색할 제목 키워드 : ");
		String keyword=sc.nextLine();
		
		// 그 결과값을 Book[] 자료형 searchList에 담아서 검색 결과인 도서목록에 출력
		Book[] searchResult=lc.searchBook(keyword);
		for(int i=0; i<searchResult.length; i++) {
			Book current= searchResult[i];
			String result="";
			
			//현재 도서가 가리키는 객체가 null이라면 continue;
			if(current ==null)
				continue;
			
			//현재 도서가 존재하다면 출력
			//현재도서가 만화책이라면 -> AniBook으로 다운캐스팅
			if(current instanceof AniBook)
				result=((AniBook)current).toString();
			
			//현재도서가 요리책이라면-> CookBook으로 다운캐스팅.
			else if(current instanceof CookBook)
				result=((CookBook)current).toString();
			
			System.out.println(i+"번 도서: "+result);
		}
	}

	
	public void rentBook() {
		// 전체 도서 출력하기
		System.out.println();
		selectAll();
		
		// 대여할 도서 인덱스를 입력받아
		// LibraryController의 rentBook메소드로 전달
		// 결과값을 result로 받아서, 0,1,2 일 경우
		// 각각에 해당하는 출력문을 출력.
		int index;
		Book [] books=lc.selectAll();
		
		do{
			System.out.print("대여할 도서 번호 선택: ");
			index= Integer.parseInt(sc.nextLine());
			
			
			if(!(index<0 || index>=books.length))
				break;
			
			//index가 0미만의 숫자거나
			//bList 인덱스에 해당하지 않은 숫자를 입력
			System.out.println("다시 입력해주세요!");
		}while(true);
		
		
		// 1을 리턴받은 경우-> 연령제한/ 대여 불가능
		// 2을 리턴받은 경우-> 대여가능/ 쿠폰 발행
		// 0을 리턴받은 경우 -> (AniBook) 대여성공 / (CookBook) 대여성공 (쿠폰없음)
		int result=lc.rentBook(index);
		switch(result) {
		case 0:
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이 제한으로 대여를 할 수 없습니다!");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인해주세요!");
			break;
		}	
	}
}

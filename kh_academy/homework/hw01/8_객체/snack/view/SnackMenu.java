package com.kh.practice.snack.view;

// SnackController은 다른 패키지에 있으므로 import
import com.kh.practice.snack.controller.SnackController;
import java.util.Scanner;

public class SnackMenu {
	// view 패키지는 화면의 출력을 담당한다.

	public void menu() {
		// 사용자가 Snack 객체에 데이터를 저장할 수 있도록
		// 값을 받고 저장한 값을 출력하는 메소드
		Scanner sc =new Scanner(System.in);
		char showData; // 사용자로부터 입력받은 데이터정보를 확인할지를 나타내는 단일문자 
		do{
			System.out.println("스낵류를 입력하세요.");
			System.out.print("종류: ");
			String kind=sc.nextLine();
			
			System.out.print("이름: ");
			String name=sc.nextLine();
			
			System.out.print("맛: ");
			String flavor=sc.nextLine();
			
			System.out.print("개수: ");
			int numOf= Integer.parseInt(sc.nextLine());
			
			System.out.print("가격: ");
			int price=Integer.parseInt(sc.nextLine());
			
			
			// 객체의 데이터를 저장한다.
			//  입력했다면 SnackController에서 saveData() 메소드를 호출한다.
			SnackController scr= new SnackController();
			
			//객체 저장후 저장 완료문자열 
			System.out.println(scr.saveData(kind, name, flavor, numOf, price));
			
			
			// 계속할지를 나타냄.
			// y를 입력하면 벗어난다. 
			do{
				System.out.print("저장한 정보를 확인하시겠습니? (y/n) : ");
				showData=(sc.nextLine().toLowerCase()).charAt(0);
				switch(showData) {
					case 'y': //입력받은 데이터를 조회하겠다 
						System.out.println(scr.confirmData());// 저장한 정보를 조회한다.
						break;// 가장가까운 반복문을 벗어난다.
					
					case 'n': //입력받은 데이터를 조회하지않고, 호출한 곳으로 돌아가서 현재메소드를 종료하겠다.
						return;
				
					default: //n과 y가 아닌 다른 값을 썼다면 다시 입력하라고 하자.
						System.out.println("없는 문자입니다! y와 n중 하나를 입력해주세요!");
				}
			}while(showData!='y'); // 안쪽 do-while문 
			// 엉뚱한 값이라면 다시 입력하도록한다. 
			System.out.println();
		}while(true); //가장 바깥 do- while문 
	}
}

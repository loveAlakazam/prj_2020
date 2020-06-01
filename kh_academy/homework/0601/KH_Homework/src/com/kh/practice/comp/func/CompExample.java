package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	// 조건문 & 반복문 종합문제

	// 실습문제1
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();

		// 양수라면
		String result = "";
		if (num > 0) {
			// 1~num까지 수/박 출력
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 0) {
					// i가 짝수라면 ->"수"
					result += "수";
				} else {
					// i가 홀수라면->"박"
					result += "박";
				}
			}
			// 결과를 출력
			System.out.println(result);

		} else {
			System.out.println("양수가 아닙니다.");
		}
	}

	// 실습문제2
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		int num;
		String result = "";
		do {
			// 정수입력
			System.out.print("정수: ");
			num = sc.nextInt();

			if (num >= 1) {
				// 1이상의 숫자입력
				for (int i = 1; i <= num; i++) {
					if (i % 2 == 0) {
						// 짝수 -> 수
						result += "수";
					} else {
						// 홀수->박
						result += "박";
					}
				}
				System.out.println(result);
				break;// 출력이후에는 무한반복을 빠져나간다.
			} else {
				// 1미만의 숫자입력
				System.out.println("양수가 아닙니다.");
			}
		} while (true);
	}

	// 실습문제3
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열: ");
		String str = sc.nextLine();

		System.out.print("문자: ");
		char alphabet = sc.nextLine().charAt(0);

		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == alphabet)
				cnt++;
		}
		System.out.println(str + " 안에 포함된 " + alphabet + "의 개수: " + cnt);
	}

	// 실습문제4
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		// 계속 진행할건지
		char isContinue;
		String isContinueStr;

		// 입력문자열
		String str;

		// 알파벳
		String alphabetStr;
		char alphabet;

		// 입력한 문자열 str에 alphabet이 몇개있는지 카운트
		int cnt;
		do {
			System.out.print("문자열: ");
			str = sc.nextLine();

			System.out.print("문자: ");
			alphabetStr = sc.nextLine();
			alphabet = alphabetStr.charAt(0);

			// 문자열에 문자가 포함된 개수
			// 만약에 str: Application이고, 알파벳은 A일때, A의개수를 구하려면..?
			// a나 A가 있으면 카운트하도록 한다.
			cnt = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.toLowerCase().charAt(i) == alphabetStr.toLowerCase().charAt(0))
					cnt++;
			}
			System.out.println("문자 " + alphabet + "이 포함된 개수: " + cnt);

			// 더하시겠습니까?
			do {
				System.out.print("더 하시겠습니까?(y/n): ");
				isContinueStr = sc.nextLine().toLowerCase(); // 문자열입력받는다->소문자로 변경
				isContinue = isContinueStr.charAt(0); // 맨앞글자 데이터만 가져온다.

				switch (isContinue) {
				case 'n':
					return; // practice4()를 호출한곳으로 돌아가고, 현재함수 종료
				case 'y':
					break; // 스위치문을 빠져나간다.
				default:
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
					continue;
				}
			} while (isContinue != 'y'); // Y,y 이외의 문자는 안쪽do-while문을 빠져나올수 없음.
		} while (true);
	}
}

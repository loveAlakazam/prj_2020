package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice_Hard {
	// 실습문제11
	// 입력한 비밀번호의 맨앞자리수가 1~9사이의 정수인가?
	public boolean isOne2Nine(int firstNum) {
		// 첫번째숫자가 1과 9사이의 정수라면, true를 리턴
		if (firstNum >= 1 && firstNum <= 9)
			return true;

		// 1~9사이의 정수가 아니라면, false를 리턴
		return false;
	}

	public boolean isDuplicated(String password) {
		// 배열과 반복문을 이용하여 중복되는 정수의 개수를 카운트
		// boolean의 기본값은 false
		boolean usedNum[] = new boolean[10];
		for (int i = 0; i < password.length(); i++) {
			char now = password.charAt(i);
			int nowNum=now-'0';
			if (usedNum[nowNum])  // 이미 사용했다면
				return true;
			//아직 사용하지 않았다면
			else{
				usedNum[nowNum]=true;
			}
		}
		return false;
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력(1000~9999) : ");
		String password = sc.nextLine();

		String message = "성공"; // 결과 출력 메시지
		// 입력한 비밀번호의 길이가 4인가?
		if (password.length() == 4) {
			// 제일 앞자리수가 1~9사이의 정수인가?
			int firstNumber = password.charAt(0) - '0';
			if (isOne2Nine(firstNumber)) {
				// 첫번째 숫자가 1~9사이의 정수이다.
				// 중복된 숫자가 존재하는가?
				if(isDuplicated(password))//중복된 숫자가 존재한다면
					message="실패(숫자중복)"; 

			} else {
				// 첫번째숫자가 1~9사이의 정수가 아니다.
				message = "실패(맨앞자리 1~9사이 아님)";
			}
		} else {
			// 자리수가 안맞음
			message = "자리수 안맞음";
		}

		System.out.println(message);
	}
}

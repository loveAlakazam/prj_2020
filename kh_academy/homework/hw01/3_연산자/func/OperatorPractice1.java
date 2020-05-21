package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice1 {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();

		String result = (num > 0) ? "양수이다." : "양수가 아니다.";
		System.out.println(result);
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();

		String result = (num > 0) ? "양수다." : ((num == 0) ? "0이다" : "음수다");
		System.out.println(result);
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();

		String result = (num % 2 == 0) ? "짝수다" : "홀수다";
		System.out.println(result);
	}

	public void practice4() {
		// 인원수와 사탕의 개수를 키보드로 입력받고
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수: ");
		int personNum = Integer.parseInt(sc.nextLine());

		System.out.print("사탕 개수: ");
		int candyNum = Integer.parseInt(sc.nextLine());

		// 1인당 동일하게 나눠가진 사탕의 개수와
		// 나눠주고 남은 사탕의 개수를 출력하기
		int getCandy = candyNum / personNum;
		int restCandy = candyNum % personNum;

		System.out.println("1인당 사탕 개수: " + getCandy);
		System.out.println("남는 사탕 개수  : " + restCandy);
	}

	public void practice5() {
		// 키보드로 입력받은 값들을 변수에 기록
		Scanner sc = new Scanner(System.in);

		System.out.print("이름: ");
		String name = sc.nextLine();

		System.out.print("학년(숫자): ");
		int grade = Integer.parseInt(sc.nextLine());

		System.out.print("반(숫자): ");
		int classNum = Integer.parseInt(sc.nextLine());

		System.out.print("번호(숫자): ");
		int stdNum = Integer.parseInt(sc.nextLine());

		System.out.print("성별(M/F)");
		// 성별입력
		char gender = sc.nextLine().toUpperCase().charAt(0);
		gender = (gender == 'M') ? '남' : '여';

		System.out.print("성적(소수점 아래 둘째자리까지): ");
		double score = Double.parseDouble(sc.nextLine());

		// 저장된 변수값을 화면출력
		System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.", grade, classNum, stdNum, name, gender, score);
	}

	public void practice6() {
		// 나이를 키보드로 입력받는다
		System.out.print("나이: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		// 13살 이하인가? "어린이": ( (19세이하인가?) "청소년":"성인")
		String isStudent = (age <= 13) ? "어린이" : ((age <= 19) ? "청소년" : "성인");
		System.out.println(isStudent);
	}

	public void practice7() {
		// 국어 영어 수학 점수를 키보드로 입력한다.(정수입력)
		int kor, eng, mat;
		Scanner sc = new Scanner(System.in);
		System.out.print("국어: ");
		kor = Integer.parseInt(sc.nextLine());

		System.out.print("영어: ");
		eng = Integer.parseInt(sc.nextLine());

		System.out.print("수학: ");
		mat = Integer.parseInt(sc.nextLine());

		System.out.println();
		// 세과목에 대한 합계와 평균을 구한다.
		double avg = kor + eng + mat;
		System.out.println("합계: " + avg);
		avg /= 3;

		System.out.printf("평균: %.2f\n", avg);

		String isPass = ((kor >= 40 && eng >= 40 && mat >= 40) && (avg >= 60)) ? "합격" : "불합격";
		System.out.println("결과: "+isPass);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		// 주민등록번호를 입력.
		System.out.print("주민번호를 입력하세요(- 포함):");
		char genderNum = sc.nextLine().charAt(7);
		String getGender = (genderNum == '2') ? "여자" : "남자";
		System.out.println(getGender);
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		// 두개의 정수를 입력받는다.
		System.out.print("정수1: ");
		int num1 = sc.nextInt();

		System.out.print("정수2: ");
		int num2 = sc.nextInt();

		System.out.print("입력: ");
		int inputNum = sc.nextInt();

		// 조건 1: inputNum<=num1
		// 조건2: inputNum>num2
		// (조건1) || (조건2)
		boolean result = ((inputNum <= num1) || (inputNum > num2)) ? true : false;
		System.out.println("결과: " + result);
	}

	public void practice10() {
		// 3개의 수를 키보드로 입력받는다.
		Scanner sc = new Scanner(System.in);

		// 배열을 만들어보자.
		int nums[] = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("입력"+(i+1)+": ");
			nums[i] = Integer.parseInt(sc.nextLine());
		}
		// 입력받은 수 모두가 같은가?
		boolean isSame = (nums[0] == nums[1]) && (nums[0] == nums[2]) && (nums[1] == nums[2]);
		boolean result = (isSame) ? true : false;
		System.out.println("세개 모두 같은가? :" + result);
	}

	// 연봉이 3000만원 이상인지 확인하는 함수
	public String overThirtyThousand(double money) {
		String result = (money >= 3000) ? "3000 이상" : "3000 미만";
		return result;
	}

	public void practice11() {
		// a,b,c 사원의 연봉을 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉: ");
		int aMoney = Integer.parseInt(sc.nextLine());
		double aInst = aMoney * 1.4;

		System.out.print("B사원의 연봉: ");
		int bMoney = Integer.parseInt(sc.nextLine());
		double bInst= bMoney;
		
		System.out.print("C사원의 연봉: ");
		int cMoney = Integer.parseInt(sc.nextLine());
		double cInst= cMoney*1.15;
		
		
		// 각 사원의 인센티브를 포함한 연봉을 계산한다.
		System.out.printf("A사원 연봉/연봉+a: %d/%.1f\n", aMoney, aInst);
		// 인센티브 포함급여가 3000만원 이상이면 "3000이상", 아니라면 "3000미만"출력
		System.out.println(overThirtyThousand(aInst));

		// B사원
		System.out.printf("A사원 연봉/연봉+a: %d/%.1f\n", bMoney, bInst);
		System.out.println(overThirtyThousand(cInst));

		// C사원
		System.out.printf("A사원 연봉/연봉+a: %d/%.1f\n", cMoney, cInst);
		System.out.println(overThirtyThousand(cInst));

		
	}
}

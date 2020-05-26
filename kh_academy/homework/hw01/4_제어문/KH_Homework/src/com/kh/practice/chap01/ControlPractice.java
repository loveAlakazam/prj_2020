package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	// 실습문제 1
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");

		// 메뉴번호 입력
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();

		// 선택한 메뉴
		String selected;
		switch (menu) {
		case 1:
			selected = "입력";
			System.out.println(selected + "메뉴 입니다.");
			break; // 다른케이스에 진입하지 않으려면, break이 필요.
		case 2:
			selected = "수정";
			System.out.println(selected + "메뉴 입니다.");
			break;

		case 3:
			selected = "조회";
			System.out.println(selected + "메뉴 입니다.");
			break;

		case 4:
			selected = "삭제";
			System.out.println(selected + "메뉴 입니다.");
			break;

		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;

		default:
			System.out.println("잘못 입력했습니다.");
		}
	}

	// 실습문제2
	public void practice2() {
		// 키보드로 입력받은 정수
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 한개를 입력해주세요: ");
		int num = sc.nextInt();

		String result;
		// num이 양수라면
		if (num > 0) {
			if (num % 2 == 0) { // 짝수인가?
				result = "짝수이다.";
			} else { // 짝수가 아니라면
				result = "홀수이다.";
			}
		} else {// num이 양수가 아니다.

			result = "양수만 입력해주세요.";
		}

		System.out.println(result);
	}

	// 실습문제 3
	public void practice3() {
		// 국어/ 영어/ 수학 세과목의 점수를 키보드로 입력받는다.
		int kor, eng, mat;
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수 입력: ");
		kor = sc.nextInt();

		System.out.print("영어 점수 입력: ");
		eng = sc.nextInt();

		System.out.print("수학 점수 입력: ");
		mat = sc.nextInt();

		// 합계를 구한다.
		int total = kor + eng + mat;
		double avg = (double) total / 3.0;

		// 세과목점수가 각각 40점이상 (국/영/수 모두 40점이상)
		// 평균이 60점 이상
		if ((kor >= 40 && eng >= 40 && mat >= 40) && (avg >= 60)) {
			// 합격
			System.out.printf("국어: %d점\n", kor);
			System.out.printf("영어: %d점\n", eng);
			System.out.printf("수학: %d점\n", mat);
			System.out.printf("합계: %d점\n평균: %.1f\n축하합니다! 합격입니다!", total, avg);

		} else {
			// 불합격
			System.out.println("불합격 입니다.");
		}
	}

	// 실습문제4
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력: ");
		int month = Integer.parseInt(sc.nextLine());
		String season;
		switch (month) {
		// 1월 , 2월, 12월 => 겨울
		case 1:
		case 2:
		case 12:
			season = "겨울";
			break;

		// 3월 ~ 5월 => 봄
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;

		// 6월 ~ 8월 => 여름
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;

		// 9월 ~11월 => 가을
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;

		// 그외의 숫자
		default:
			season = "error";
		}

		// case문마다 출력이 싫어서.. 조건문을 추가해서 썼습니다.
		if (season.equals("error")) {
			System.out.println(month + "은(는) 잘못 입력된 달입니다.");
		} else {
			System.out.println(month + "월은 " + season + "입니다.");
		}
	}

	// 실습문제5
	public void practice5() {
		// 아이디, 비밀번호 정해두고 로그인 기능을 작성하세요.
		// 정해놓은 아이디와 비밀번호
		String realId = "myId";
		String realPw = "myPassword12";

		// 사용자가 입력한 아이디와 비밀번호
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디: ");
		String inputId = sc.next();

		System.out.print("비밀번호: ");
		String inputPw = sc.next();

		// 아이디가 일치하는가?
		String result;
		if (inputId.equals(realId)) {
			// 비밀번호가 일치하는가?
			if (inputPw.equals(realPw)) {
				result = "로그인 성공";
			} else {
				result = "비밀번호가 틀렸습니다.";
			}
		} else {
			// 아이디가 일치하지 않음
			result = "아이디가 틀렸습니다.";
		}
		// 출력메시지
		System.out.println(result);
	}

	// 실습문제6
	public void practice6() {
		// 사용자에게 관리자/ 회원/ 비회원 중 하나를 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급: ");
		String position = sc.nextLine();

		// 각 등급이 행할 수 있는 권한 출력
		String available; // 비회원을 기준으로 한다.

		switch (position) {
		case "관리자":
			available = "회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성";
			break;

		case "회원":
			available = "게시글 작성, 게시글 조회, 댓글 작성";
			break;
		case "비회원":
			available = "게시글 조회";
			break;

		default:
			available = "없음";
		}
		if (!available.equals("없음"))
			System.out.println(available);
	}

	// 실습문제7
	public void practice7() {
		try {
			double height, weight;
			Scanner sc = new Scanner(System.in);
			System.out.print("키(m)를 입력해주세요: ");
			height = Double.parseDouble(sc.nextLine());

			System.out.print("몸무게(kg)를 입력해주세요: ");
			weight = Double.parseDouble(sc.nextLine());

			double bmi = weight / (height * height);
			System.out.println("BMI 지수: " + bmi);
			String result;
			if (bmi < 18.5) { // 18.5미만 -> 저체중
				result = "저체중";
			} else if (bmi < 23) { // 정상체중
				result = "정상 체중";
			} else if (bmi < 25) { // 과제중
				result = "과체중";
			} else if (bmi < 30) {// 비만
				result = "비만";
			} else {// 고도비만
				result = "고도비만";
			}
			System.out.println(result);
		} catch (Exception e) {
			// 키가 0m는 아니지.
			System.out.println("잘못 입력하셨습니다!");
			System.out.println("다시 입력해주세요!");
		}
	}

	// 실습문제8
	public void practice8() {
		Scanner sc = new Scanner(System.in);

		// 두개의 정수와 연산 기호를 입력받는다.
		System.out.print("피연산자1 입력: ");
		int num1 = Integer.parseInt(sc.nextLine());

		System.out.print("피연산자2 입력: ");
		int num2 = Integer.parseInt(sc.nextLine());

		System.out.print("연산자 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);

		// 두개의 정수 모두 양수일 때만 작동
		if (num1 > 0 && num2 > 0) {
			String result = "";
			switch (op) {
			case '+':
				System.out.printf("%d %c %d = %f", num1, op, num2, (float) num1 + num2);
				break;

			case '-':
				System.out.printf("%d %c %d = %f", num1, op, num2, (float) num1 - num2);
				break;

			case '*':
				System.out.printf("%d %c %d = %f", num1, op, num2, (float) num1 * num2);
				break;

			case '/':
				System.out.printf("%d %c %d = %f", num1, op, num2, (float) num1 / num2);
				break;

			case '%':
				System.out.printf("%d %c %d = %f", num1, op, num2, (float) (num1 % num2));
				break;

			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		}
	}

	// 실습문제9
	public void practice9() {
		// 중간고사점수, 기말고사점수, 과제점수, 출석횟수 입력
		Scanner sc = new Scanner(System.in);
		double midTerm, finalTerm, homeworkScore, attendCnt;
		double total = 0;
		System.out.print("중간고사 점수: ");
		midTerm = Double.parseDouble(sc.nextLine());
		midTerm *= 0.2;
		total += midTerm;

		System.out.print("기말고사 점수: ");
		finalTerm = Double.parseDouble(sc.nextLine());
		finalTerm *= 0.3;
		total += finalTerm;

		System.out.print("과제 점수: ");
		homeworkScore = Double.parseDouble(sc.nextLine());
		homeworkScore *= 0.3;
		total += homeworkScore;

		// 20회중에서 출석한 날만 따진 값으로 계산하세요.
		System.out.print("출석횟수: ");
		attendCnt = Double.parseDouble(sc.nextLine());
		attendCnt = ((attendCnt / 20) * 100) * 0.2;
		total += attendCnt;

		System.out.println("=========== 결과 ===========");
		// 출석횟수가 30%이상 결석하면 fail (70%이하 출석)
		if (attendCnt <= 0.7 * 20) {
			System.out.println("Fail [출석횟수 부족(" + (int) attendCnt + "/20)]");
		} else {
			// 출석점수 통과시에 점수 결과출력
			System.out.printf("중간고사 점수(20): %.1f\n", midTerm);
			System.out.printf("기말고사 점수(30): %.1f\n", finalTerm);
			System.out.printf("과제점수       (30): %.1f\n", homeworkScore);
			System.out.printf("출석점수       (20): %.1f\n", attendCnt);
			System.out.printf("총점: %.1f\n", total);

			// 만일 70점 이상이라면
			if (total >= 70) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail [점수 미달]");
			}
		}
	}

	// 실습문제10
	public void practice10() {
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");

		System.out.print("선택: ");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			System.out.println("(실습문제 " + menu + "실행)");
			practice1();
			break;
			
		case 2:
			System.out.println("(실습문제 " + menu + "실행)");
			practice2();
			break;
			
		case 3:
			System.out.println("(실습문제 " + menu + "실행)");
			practice3();
			break;
			
		case 4:
			System.out.println("(실습문제 " + menu + "실행)");
			practice4();
			break;
			
		case 5:
			System.out.println("(실습문제 " + menu + "실행)");
			practice5();
			break;
			
		case 6:
			System.out.println("(실습문제 " + menu + "실행)");
			practice6();
			break;
			
		case 7:
			System.out.println("(실습문제 " + menu + "실행)");
			practice7();
			break;
			
		case 8:
			System.out.println("(실습문제 " + menu + "실행)");
			practice8();
			break;
			
		case 9:
			System.out.println("(실습문제 " + menu + "실행)");
			practice9();
			break;
			
		default:
			System.out.println("다시 입력해주세요.");
			System.out.println();
		}
	}

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
		boolean usedNum[] = new boolean[10];
		for (int i = 0; i < password.length(); i++) {
			char now = password.charAt(i);
			if (usedNum[now - '0']) // 이미 사용했다면
				return true;
			else
				usedNum[now - '0'] = true; // 아직 사용하지 않음.
		}
		return false;
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력(1000~9999) : ");
		String password = sc.nextLine();

		// 이건 배열과 반복문을 써야될거 같은데...
		int useNum[] = new int[10];

		String message = "성공"; // 결과 출력 메시지
		// 입력한 비밀번호의 길이가 4인가?
		if (password.length() == 4) {
			// 제일 앞자리수가 1~9사이의 정수인가?
			int firstNumber = password.charAt(0) - '0';
			if (isOne2Nine(firstNumber)) {
				// 첫번째 숫자가 1~9사이의 정수이다.
				// 중복된 숫자가 존재하는가?
				if (isDuplicated(password))// 중복된 숫자가 존재한다면
					message = "실패(숫자중복)";

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

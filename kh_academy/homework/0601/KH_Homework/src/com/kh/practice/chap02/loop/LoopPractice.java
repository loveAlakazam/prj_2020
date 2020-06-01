package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	// 실습문제 1
	public void practice1() {
		// 사용자로부터 한개의 값을 입력받아
		// 그 숫자까지의 숫자들을 모두 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.print("1 이상의 숫자를 입력하세요: ");
		int inputNum = sc.nextInt();
		// 단, 입력한 수는 1보다 크거나 같아야합니다.
		if (inputNum >= 1) {
			for (int i = 1; i <= inputNum; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		System.out.println();
	}

	// 문제2
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		int inputNum;

		// 1미만의 숫자 입력한다면
		// 다시 입력해달라고 한다.
		while (true) {
			System.out.print("1이상의 숫자를 입력하세요: ");
			inputNum = sc.nextInt();

			// 1이상의 숫자를 입력하면-> 반복문을 빠져나간다.
			if (inputNum >= 1) {
				for (int i = 1; i <= inputNum; i++) {
					System.out.print(i + " ");
				}
				break;
			}
			// 1미만이면 계속 무한루프
		}
	}

	// 실습문제3
	public void practice3() {
		// 사용자로부터 한개의 값을 받아 1부터 그 숫자까지의
		// 모든 숫자를 거꾸로 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요: ");

		int inputNum = sc.nextInt(); // 초기식
		while (inputNum >= 1) {// 조건식
			System.out.print(inputNum + " ");
			inputNum--; // 증감식
		}
	}

	// 실습문제4
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		int inputNum;
		do {
			// 숫자 입력
			System.out.print("1이상의 숫자를 입력하세요: ");
			inputNum = sc.nextInt();

			// 1이상 숫자를 입력하면 -> 거꾸로출력 and break
			if (inputNum >= 1) {
				for (int i = inputNum; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			}
		} while (true);
	}

	// 실습문제5
	public void practice5() {
		// 1부터 사용자로부터 입력받은 수까지의 정수들의 합을 계산한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요: ");
		int userNum = sc.nextInt(); // 1보다 작은 숫자가 나올수 있으므로

		int start, end;
		start = (userNum > 1) ? 1 : userNum;
		end = (userNum > 1) ? userNum : 1;

		int sum = 0;
		String equation = "";
		while (start <= end) {
			sum += start;

			if (start < 0) { // start가 음수라면
				equation += "(" + start + ") + ";
			} else {// start가 0이상 양수라면
					// end와 start가 같다면
				if (start == end)
					equation += (start + " + = ") + sum;

				// end와 start가 같지 않다면
				else
					equation += start + " + ";
			}
			start++;
		}
		System.out.println(equation);
	}

	// 실습문제6
	public void practice6() {
		// 사용자로부터 2개의 값을 입력받아서
		// 그 사이의 숫자를 모두 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();

		// 첫번째 숫자가 1미만인가?
		if (num1 < 1) {
			System.out.println("1이상의 숫자를 입력해주세요!");
		} else {
			System.out.print("두번째 숫자: ");
			int num2 = sc.nextInt();

			// 2번째 숫자가 1미만인가?
			if (num2 < 1) {
				System.out.println("1이상의 숫자를 입력해주세요!");
			} else {

				// 첫번째숫자~두번째숫자 출력
				// num1과 num2중 작은값을 start로 한다.
				int start = Math.min(num1, num2);

				// num1과 num2중 큰값을 end로한다.
				int end = Math.max(num1, num2);

				for (int i = start; i <= end; i++) {
					System.out.print(i + " ");
				}
			}
		}
	}

	// 실습문제7
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		while (true) {
			// 첫번째 숫자, 두번째 숫자 입력을 한다.
			System.out.print("첫번째 숫자: ");
			num1 = sc.nextInt();

			System.out.print("두번째 숫자: ");
			num2 = sc.nextInt();

			// 숫자 두개 모두 1이상의 숫자라면 -> 출력하고 -> break
			if (num1 >= 1 && num2 >= 1) {
				int start = (num1 < num2) ? num1 : num2;
				int end = (num1 > num2) ? num1 : num2;
				for (int i = start; i <= end; i++)
					System.out.print(i + " ");
				break;
			}

			// 둘중하나라도 1이상인 숫자가 아니라면
			System.out.println("1이상의 숫자를 입력해주세요!");
		}
	}

	// 실습문제8
	public void practice8() {
		// 숫자를 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		int num = sc.nextInt();

		// 입력받은 숫자의 단을 출력 한다.
		System.out.printf("===== %d단 =====\n", num);
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + "= " + (num * i));
		}
	}

	// 실습문제9
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		// 숫자입력
		System.out.print("숫자: ");
		int num = sc.nextInt();
		// num이 숫자 9이하이면, 출력
		if (num <= 9) {
			for (int dan = num; dan <= 9; dan++) {
				System.out.printf("===== %d단 =====\n", dan);

				for (int i = 1; i <= 9; i++)
					System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
			}
		} else {
			System.out.println("9이하의 숫자만 입력하세요.");
		}
	}

	// 실습문제10
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			// 숫자를 입력받는다.
			System.out.print("숫자: ");
			num = sc.nextInt();

			if (num <= 9)
				break;
			else {
				// 9보다 크다.
				// 다시 입력받는다.
				System.out.println("9이하의 숫자만 입력해주세요.");
			}
		} while (true);

		for (int dan = num; dan <= 9; dan++) {
			System.out.printf("===== %d단 =====\n", dan);
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
			}
		}
	}

	// 실습문제11
	public void practice11() {
		// 사용자로부터 시작숫자와 공차를 입력받아
		// 일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자: ");
		int startNum = sc.nextInt();

		System.out.print("공차: ");
		int diff = sc.nextInt();

		// 시작숫자값으로 sum초기화.
		int sum = startNum;
		for (int i = 1; i <= 10; i++) {
			System.out.print(sum + " ");
			sum += diff; // 공차만큼 계속 더해나간다.
		}
	}

	// 실습문제12
	public void practice12() {
		// 연산자를 입력받는다.
		// exit 들어올때까지 무한반복을 한다.
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String operatorStr = sc.next(); // 문자열

			// 만일 operatorStr이 exit이라면
			if (operatorStr.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return; // 빠져나가서, 호출한곳에 아무것도 없는 값을 반환한다.
			}

			// exit이 아니라면-> operatorStr의 0번째 인덱스의 문자를 가져온다.
			char op = operatorStr.charAt(0);

			// 정수를 입력받는다.
			System.out.print("정수1: ");
			int num1 = sc.nextInt();

			System.out.print("정수2: ");
			int num2 = sc.nextInt();

			switch (op) {
			case '+':
				System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1 + num2));
				break;

			case '-':
				System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1 - num2));
				break;

			case '/': {
				// 만일 num2가 0이라면
				if (num2 == 0) {
//					System.out.println(num1/num2); // ArithmeticException 발생.
					System.out.println("0으로 나눌수 없습니다. 다시 입력해주세요.");
					break;
				}
				System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1 / num2));
			}
				break;

			case '%': {
				// 만일 num2가 0이라면
				if (num2 == 0) {
					System.out.println("0으로 나눌수 없습니다. 다시 입력해주세요.");
					break;
				}
				System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1 % num2));
			}
				break;

			case '*':
				System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1 * num2));
				break;

			default:
				System.out.println("없는 연산자입니다. 다시입력해주세요.");
			}
			System.out.println();
		}
	}

	// 실습문제13
	public void practice13() {
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num= sc.nextInt(); 
		
		if(num>0) {
			//입력한 num이 양의 정수라면
			for(int i=0; i<=num ;i++) {
				for(int j=0; j<i;j++)
					System.out.print('*');
				System.out.println();
			}
		}else {
			System.out.println("양의 정수를 입력해주세요!");
		}
	}

	// 실습문제14
	public void practice14() {
		//(자체 응용) 아니면 입력한 정수의 절댓값을 줄로하여 *을 찍어보기
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=Math.abs(sc.nextInt()); //입력한 정수의 절댓값
		for(int i=num; i>0 ;i--) {
			for(int j=0; j<i; j++)
				System.out.print('*');
			System.out.println();
		}
	}

}

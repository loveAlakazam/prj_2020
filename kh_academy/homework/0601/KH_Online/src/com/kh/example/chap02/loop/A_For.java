package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 * for(초기식;조건식; 증감식){ 수행코드; }
	 * 
	 * 조건식 결과가 false가 될때까지 반복한다.
	 * 
	 * 초기식 , 조건식, 증감식 -> 생략가능 for(;;){} 초기식, 조건식, 증감식을 생략하더라도 for문의 위나 안에 생략한 부분을
	 * 기술하여 나타내줘야함. 결국 for()안에서만 생략될뿐 모두 필요한 요소
	 */
	public void method() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("i: " + i);
		}
	}

	public void method1_1() {
		// 자기 소개 5번하기
		for (int i = 0; i < 5; i++) {
			System.out.println("내이름은 최은강이야.");
		}
	}

	public void method2() {
		for (int i = 5; i > 0; i--) {
			System.out.println("i: " + i);
		}
	}

	public void method2_1() {
		for (int i = 8; i >= 3; i--) {
			System.out.println("i: " + i);
		}
	}

	public void method3() {
		// 1~10사이의 홀수만 출력하기
		for (int i = 1; i <= 10; i += 2) {
			System.out.println("홀수: " + i);
		}
	}

	public void method3_1() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println("홀수: " + i);
			}
		}
	}

	// 정수2개를 받아서 그 사이의 숫자를 받는다.
	public void method4() {
		// 두개숫자 3, 6 => 3,4,5,6
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int start = sc.nextInt();

		System.out.print("두번째 숫자: ");
		int end = sc.nextInt();

		int max; // 두숫자중 큰 수
		int min; // 두숫자중 작은수
		if (start > end) {
			max = start;
			min = end;
		} else {
			max = end;
			min = start;
		}
		for (int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}

//		//초기식을 생략한다.
//		for(;start<=end; start++) {
//			System.out.println("start: "+ start);
//		}

//		int min=(start<=end)?start: end;
//		int max=(start>end)?start: end;
//		
//		for(int i=min; i<=max; i++) {
//			System.out.print(i+" ");
//		}
	}

	public void method4_1() {
		// 정수하나를 입력받아 그 수가 1~9사이의 수일때만
		// 그 수의 구구단 출력
		// 조건이 맞지 않으면 1~9 사이의 양수를 입력해야합니다라고 출력
		// ex.3 입력 3단출력

		Scanner sc = new Scanner(System.in);
		System.out.print("1~9사이의 양수를 입력: ");
		int dan = sc.nextInt();
		if (dan >= 1 && dan <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " x " + i + " = " + dan * i);
			}
		} else {
			System.out.println("1~9사이의 양수 입력해주세요.");
		}
	}

	public void method5() {
		// 1~10 사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계

		// random(): 0.0~1.0 사이의 실수를 리턴.
		// 0단계 : 0.0<=Math.random()<1.0
		// 0.0은 포함 ~ 1.0(미포함) double값을 리턴한다.
//		double random=Math.random();
//		System.out.println(random);

		// 1단계: 0*10 <=Math.random()*10 <1*10
//		double random=Math.random()*10;
//		System.out.println(random);
//		
		// 1과 10사이의 랜덤숫자를 출력한다.
		// 그리고 그 랜덤숫자는 int형
		// random()은 double형으로 반환
		// 2단계
		// 1<= Math.random()*10+1 <11
//		double random=(int)Math.random()*10+1;

		// 3단계 : int형 변환
		// 1~10사이의 임의의 정수
		int random = (int) (Math.random() * 10 + 1);
//		System.out.println("random Number: "+ random);
		int sum = 0;
		for (int i = 1; i <= random; i++) {
			sum += i;
		}

		System.out.printf("1~%d까지 정수합계: %d", random, sum);
	}

	// 구구단
	public void method6() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
			System.out.println();
		}
	}

	public void method6_1() {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%2d x%2d=%2d  ", j, i, (j * i));
			}
			System.out.println();
		}
	}

	public void method7() {
		// 아날로그 시계 0시0분 ~23시 59분
		for (int si = 0; si < 24; si++) {
			for (int bun = 0; bun < 60; bun++) {
				System.out.println(si + "시 " + bun + "분 입니다.");
			}
			System.out.println();
		}
	}

	// 숙제 8
	public void method8() {
		// 한줄에 별표(*)가 5번 출력
		// 그 줄은 사용자가 입력한 수만큼 출력한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 줄의 수: ");
		int inputNum = sc.nextInt();

		for (int i = 0; i < inputNum; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 숙제9
	public void method9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수 입력: ");
		int jul = sc.nextInt();

		System.out.print("칸 수 입력: ");
		int kan = sc.nextInt();

		for (int row = 0; row < jul; row++) {
			for (int col = 0; col < kan; col++) {
				if (row == col) {
					System.out.print(col + 1);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}

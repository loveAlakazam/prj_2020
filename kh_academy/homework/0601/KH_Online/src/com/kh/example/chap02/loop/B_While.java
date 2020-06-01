package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*
	 * while(조건식){ 실행문장; [조건식 or 분기문]; }
	 * 
	 * 조건식-> (조건식 true일때) -> 실행문장-> 증감식 (반복) 조건식이 false가 될때까지 반복문 반복.
	 */

	public void method1() {
//		for(int i=1; i<=5; i++) {
//			System.out.println("i: "+i);
//		}

		int i = 1;
		while (i <= 5) {
			System.out.println("i번째 반복문 수행: " + i);
			i++;
		}
	}

	public void method2() {
		int i = 5;
		while (i > 0) {
			System.out.println("i: " + i);
			i--;
		}
	}

	public void method3() {
		int i = 0;
		while (i <= 10) {
			if (i % 2 != 0)
				System.out.println("홀수: " + i);
			i++;
		}

		i = 1;
		while (i <= 10) {
			System.out.println("홀수: " + i);
			i += 2;
		}
	}

	public void method4() {
		// 정수 두개를 입력받아서 그 사이 숫자를 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1: ");
		int start = sc.nextInt();

		System.out.print("숫자2: ");
		int end = sc.nextInt();
		int max, min;
		if (start > end) {
			max = start;
			min = end;
		} else {// start<=end
			max = end;
			min = start;
		}

		while (min <= max) {
			System.out.print(min + " ");
			min++;
		}
	}

	public void method4_1() {
		// 정수 하나를 입력받아 그 수가 1~9 사이의 수일때만 구구단 출력
		// 조건이 맞지 않으면 1~9사이의 양수를 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9 사이의 정수 입력: ");
		int num = sc.nextInt();

		if (num >= 1 && num <= 9) {
			int i = 1;
			while (i < 10) {
				System.out.println(i + "*" + num + "=" + (i * num));
				i++;
			}
		} else {
			System.out.println("1~9 사이의 양수만 입력해주세요.");
		}

	}

	public void method5() {
		// 1~10부터 임의의 난수를 정해서 1부터 난수의 정수 합계
		Scanner sc = new Scanner(System.in);
		int randNum = (int) (Math.random() * 10 + 1);
		int sum = 0;
		int i=0;
		while(i<=randNum) {
			sum += i;
			i++;
		}
		System.out.println("result: " + sum);
	}

	public void method6() {
		// 문자열을 입력받아서 인덱스별로 문자출력
		// apple
		// 0: a
		// 1: p
		// 2: p
		// 3: l
		// 4: e
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		for (int i = 0; i < inputString.length(); i++) {
			System.out.println(i + ": " + inputString.charAt(i));
		}

		int i = 0;
		while (i < inputString.length()) {
			System.out.println(i + ": " + inputString.charAt(i));
			i++;
		}
	}

	public void method7() {
		// 중첩 while문 : while문 안에 while문
		int dan = 2;
		while (dan < 10) {
			int i = 1;
			while (i < 10) {
				System.out.printf("%d * %d = %d\n", dan, i, i * dan);
				i++;
			}
			System.out.println();
			dan++;
		}
	}

	public void method8() {
		// 아날로그 시계
		int si = 0;
		int bun;
		while (si < 24) {
			bun = 0;
			while (bun < 60) {
				System.out.println(si + "시" + bun + "분");
				bun++;
			}
			si++;
			System.out.println();
		}
	}

	public void method9() {
		// 한줄에 별표(*)가 5번 출력
		// 그 줄은 사용자가 입력한 수만큼 출력한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 줄의 수: ");
		int inputNum = sc.nextInt();
		
		int i=0;
		int j;
		while(i<inputNum) {
			j=0;
			while(j<5) {
				System.out.print("*");
				j++;
			}
			i++;
		}
	}

	public void method10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수 입력: ");
		int jul = sc.nextInt();

		System.out.print("칸 수 입력: ");
		int kan = sc.nextInt();
		
		int row, col;
		row=0;
		while(row<jul) {
			col=0;
			while(col<kan) {
				if(row==col)
					System.out.print(col + 1);
				else
					System.out.print("*");
				col++;
			}
			row++;
		}

	}
}

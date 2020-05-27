package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice2 {
	// 반복문 hard문제
	// 시간복잡도: O(N)
	// 실습문제15
	public boolean isPrimary(int num) {
		// 소수: 약수가 1과 자기자신인 수를 의미한다.
		// 2보다 큰 정수이고, 짝수라면 -> 소수가 아니다.
		if (num > 2 && num % 2 == 0) {
			return false;
		}

		int cnt = 0; // num에 나누어떨어지는 수 개수 카운트
		for (int i = 1; i <= num; i++) {
			// 1과 num이외에 나누어떨어지는 수가 존재한다면 false
			if (num % i == 0)
				cnt++;
		}
		return (cnt == 2) ? true : false;
	}

	// 에라토스테네스 체를 이용한 소수 구하기.
	// 최악: O(N^2)
	public boolean isPrimary_era(int num) {
		// 1.배열을 생성하여 초기화 한다.
		int arr[] = new int[num + 1];
		for (int i = 2; i <= num; i++) {
			arr[i] = i;
		}

		// 2. 2부터 시작해서 특정수의 배수에 해당하는 수를 모두 지운다.
		for (int i = 2; i <= num; i++) {
			// 지워진 수가 0이라면 건너뛴다.
			if (arr[i] == 0)
				continue;

			// 이미 지워진 수가 0이 아니라면
			// 그배수부터 출발하여, 가능한 모든 숫자 지우기
			for (int j = 2 * i; j <= num; j += i)
				arr[j] = 0;
		}

		// 3. arr[num]이 0이면 -> 소수가 아니고
		// arr[num]이 0이아닌수라면 -> 소수이다.
		return (arr[num] == 0) ? false : true;

	}

	public void practice15() {
		// 사용자로부터 입력받은 하나의 값이 소수인지 판별하기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		int inputNum = sc.nextInt();

		// 입력한 숫자가 2보다 작은경우
		if (inputNum < 2) {
			System.out.println("잘못 입력했습니다.");
		} else {
			// 입력한 숫자가 2이상인경우.
			// 소수
			if (isPrimary(inputNum))
				System.out.println("소수 입니다.");

//			// 에라토스테네스의 체를 이용한 소수구하기
//			if (isPrimary_era(inputNum))
//				System.out.println("소수 입니다.");

			// 소수가 아니다.
			else
				System.out.println("소수가 아닙니다.");
		}
	}

	// 실습문제16
	public void practice16() {
		// 입력한 숫자가 2보다 작은 숫자인경우
		// 사용자가 다시 입력하도록한다.
		Scanner sc = new Scanner(System.in);
		int inputNum;
		do {
			// 숫자입력
			System.out.print("숫자: ");
			inputNum = sc.nextInt();

			// 2이상의 숫자를 입력한 경우
			if (inputNum >= 2) {
				if (isPrimary(inputNum)) {// 소수
					System.out.println("소수입니다.");
				} else {// 소수가 아님
					System.out.println("소수가 아닙니다.");
				}
				return; // 반복문을 벗어난다.
			}

			// 2미만의 숫자를 입력한 경우
			System.out.println("잘못 입력했습니다.");
		} while (true);
	}

	// 실습문제17
	public void practice17() {
		// 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고
		// 소수의 개수를 출력
		// 단, 2보다 작은 경우는 잘못입력했다고 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		int inputNum = sc.nextInt();
		if (inputNum < 2) {
			// 2보다 작은 경우
			System.out.println("잘못 입력했습니다.");
		} else {
			// 2이상인 수를 입력
			// 2~입력한 수까지의 소수를 출력하고
			// 소수개수 카운트
			int primaryCnt = 0;
			for (int i = 2; i <= inputNum; i++) {
				// i가 소수라면
				if (isPrimary(i)) {
					System.out.print(i + " ");
					primaryCnt++;
				}
			}
			System.out.printf("\n2부터 %d까지의 소수의 개수는 %d개입니다.\n", inputNum, primaryCnt);
		}

	}

	// 실습문제18
	public void practice18() {
		// 1부터 사용자에게 입력받은 수까지 중에서
		// 2와 3의 배수 모두 출력하고
		// 2와 3의 공배수의 개수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요: ");
		int num = sc.nextInt();

		String numbers = "";

		if (num > 0) {
			// 2와 3의 배수를 모두 출력
			int commonCnt = 0; // 공배수를 카운트
			for (int i = 2; i <= num; i++) {
				if (i % 2 == 0 || i % 3 == 0) {
					numbers += (i + " ");

					// 2와 3에 모두 나누어떨어지는 숫자.(2와3의 공배수)
					// 2와3의 최소공배수는 6이다. if(i%6==0)
					if (i % 2 == 0 && i % 3 == 0)
						commonCnt++;
				}
			}

			System.out.println(numbers);
			System.out.println("count: " + commonCnt);
		} else {
			System.out.println("자연수를 입력해주세요!");
		}
	}

	// 실습문제 19
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = Math.abs(sc.nextInt()); // 정수입력(절댓값)
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < num; j++) {
				if (j < num - i)
					System.out.print(' ');
				else
					System.out.print('*');
			}
			System.out.println();
		}
	}

	// 실습문제 20
	public void practice20() {
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=Math.abs(sc.nextInt());//열개수
		int rows=num*2-1; //행개수
		for(int r=1; r<=rows; r++) {
			if(r<=num) {
				//행번호(1부터시작)이 num보다 작은경우
				for(int c=0; c<r; c++)
					System.out.print('*');
			}else {
				//행번호가 num보다 큰경우: c-num의 값이 0보다 크다.
				for(int c=r; 2*num-c>0; c++)
					System.out.print('*');
			}
			System.out.println();
		}
	}

	// 실습문제 21
	public void practice21() {
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		for(int i=0; i<num; i++) {
			
			//입력
			for(int j=0; j<num*2+1; j++) {
				if(j>=num-i && j<=num+i)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}

	// 실습문제 22
	public void practice22() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) { // i: 행(1~num)
			for (int j = 0; j < num; j++) { //j: 열(0~num-1)
				if (i == 1 || i == num) {
					// 행번호(i) 1또는 num 일때
					System.out.print('*');
				} else {
					// 행번호(i)가 1과 num이 아니라면
					if (j == 0 || j == num - 1)
						System.out.print('*');
					else
						System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}

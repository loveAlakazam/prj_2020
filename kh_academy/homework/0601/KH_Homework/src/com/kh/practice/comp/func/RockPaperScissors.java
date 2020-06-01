package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	//반복문-조건문 종합문제
	//실습문제6
	
	//배열을 활용한 풀이
	public void rps() {
		//사용자 이름을 입력하고 
		//컴퓨터가 가위/바위/보 인지는 랜덤한 숫자로 통해서 결정한다.
		//사용자에게는 직접 가위/바위/보를 받으세요
		//사용자가 exit을 입력하기 전까지는 가위바위보를 계속 진행
		//exit이후에는 반복을 멈추고 몇번의 (승/패/무)를 출력하세요.
		
		//가위: 0/ 바위:1 / 보:2
		//사용자: 행
		//컴퓨터: 열
		
		//사용자의 가위바위보 결과에 대한 정보.
		int roundCnt=0; //게임진행횟수
		int winCnt=0; //이긴횟수
		int drawCnt=0; //비긴횟수
		int lostCnt=0; //진횟수
		
		String rpsResult[][]= {
			//사용자: 가위(0)
				//컴퓨터:가위(비김), 바위(짐), 보(이김)
				{"비겼습니다.", "졌습니다 ㅠㅠ", "이겼습니다 ^-^!!"},
			//사용자: 바위(1)
				//컴퓨터: 가위(이김), 바위(비김), 보(짐)
				{"이겼습니다 ^-^!!", "비겼습니다.", "졌습니다 ㅠㅠ"},
			//사용자: 보(2)
				//컴퓨터: 가위(짐), 바위(이김), 보(비김)
				{"졌습니다 ㅠㅠ", "이겼습니다 ^-^!!", "비겼습니다."}
		};
		
		Scanner sc= new Scanner(System.in);
		
		//당신의 이름을 입력해주세요.
		System.out.print("당신의 이름: ");
		String userName=sc.nextLine();
		String order; //가위+바위+보+exit
		do {
			//가위바위보 입력
			System.out.print("가위바위보: ");
			order=sc.nextLine();
			
			//order가 exit이라면-> 가까운 반복문을 빠져나간다.
			int user;
			switch(order) {
				case "가위":
					user=0;
					break;
					
				case "바위":
					user=1;
					break;
					
				case "보":
					user=2;
					break;
					
				case "exit": //승/패/무를 출력하고 return.
					System.out.println(userName+"님의 결과");
					System.out.println(roundCnt+"전 "+winCnt+"승 "
					+drawCnt+"무 "+ lostCnt+"패");
					return; //무한반복문을 빠져나가서, 호출한곳으로 돌아간다.
					
				default:
					System.out.println("잘못 입력하셨습니다.");
					continue; //아래코드 무시하고 다음으로 반복.
			}
			
			//가위/바위/보 를 입력하면 게임 진행 시작
			roundCnt++;
			
			//컴퓨터의 가위바위보
			int computer=(int)(Math.random()*3); //0,1,2
			String rps[]= {"가위","바위","보"};
			
			//게임 결과
			System.out.println("컴퓨터: "+rps[computer]);
			System.out.println(userName+": "+order);
			
			String msg=rpsResult[user][computer];
			System.out.println(msg);//메시지 출력
			
			if(msg.equals("이겼습니다 ^-^!!")) // 이겼다는 메시지를 받았다면
				winCnt++;
			else if(msg.equals("비겼습니다.")) // 비겼다는 메시지를 받았다면
				drawCnt++;
			else //졌다는 메시지
				lostCnt++;
			System.out.println();
		}while(true);
	}
}

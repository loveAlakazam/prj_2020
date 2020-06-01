package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	//실습문제1
	public void practice1() {
		//3행3열 짜리 문자열 배열을 선언 및 할당
		//정변형 배열: 행과 열이 정해져있는 배열
		String arr2d[][]=new String [3][3];
		for(int r=0; r<arr2d.length; r++) {
			for(int c=0; c<arr2d[r].length; c++) {
				arr2d[r][c]="("+r+","+c+")";
			}
		}
		
		//출력
		for(int r=0; r<arr2d.length; r++) {
			for(int c=0; c<arr2d[r].length; c++)
				System.out.print(arr2d[r][c]);
			System.out.println();
		}
	}
	
	
	//실습문제2
	public void practice2() {
		int arr[][]=new int[4][4];
		int val=1;
		for(int r=0; r<arr.length; r++) {
			for(int c=0; c<arr[r].length; c++) {
				arr[r][c]=val++;
			}
		}
		
		for(int r=0; r<arr.length; r++) {
			for(int c=0; c<arr[r].length; c++)
				System.out.printf("%3d",arr[r][c]);
			System.out.println();
		}
	}
	
	
	//실습문제3
	public void practice3() {
		int [][]arr= new int[4][4];
		int val=16;
		for(int r=0; r<arr.length; r++) {
			for(int c=0; c<arr[r].length; c++)
				arr[r][c]=val--;
		}
		
		for(int r=0; r<arr.length; r++) {
			for(int c=0; c<arr[r].length; c++)
				System.out.printf("%3d",arr[r][c]);
			System.out.println();
		}
	}
	
	public void practice4() {
		Scanner sc= new Scanner(System.in);
		int [][]arr= new int[4][4];
		for(int r=0; r<arr.length; r++) {
			//r행 c열( 0<=r,c<=2): 임의의 정수값을 저장한다.
			if(r<arr.length-1) {
				int colSum=0; // 같은행에 있는 열들의 합
				for(int c=0; c<arr[r].length-1; c++) {
					arr[r][c]=(int)(Math.random()*10+1);
					colSum+=arr[r][c];
				}
				//마지막 열
				arr[r][arr[r].length-1]=colSum;
			}
		}
		
		//같은열에 있는 행들의합
		for(int c=0; c<arr.length; c++) {
			int rowSum=0;
			for(int r=0; r<arr.length-1; r++) {
				rowSum+=arr[r][c];
			}
			arr[arr.length-1][c]=rowSum;
		}
		
		//출력
		for(int r=0; r<arr.length; r++) {
			for(int c=0; c<arr[r].length; c++)
				System.out.printf("%4d",arr[r][c]);
			System.out.println();
		}
	}
	
	//실습문제5
	public void practice5() {
		Scanner sc= new Scanner(System.in);
		
		// 1~10 사이 정수를 입력하면 true가된다.
		int rowNum=0;
		int colNum=0;
		boolean isRow, isCol;
		do {
			isRow=isCol=false; //false로 초기화
			
			System.out.print("행 크기: ");
			rowNum= sc.nextInt();
			if(!(rowNum>=1 && rowNum<=10)) {
				System.out.println("1~10사이의 숫자를 입력하세요!");
				continue;
			}
			
			isRow=true;
			
			
			System.out.print("열 크기: ");
			colNum= sc.nextInt();
			if(!(colNum>=1 && colNum<=10)) {
				System.out.println("1~10사이의 숫자를 입력하세요!");
				continue;
			}
			
			isCol=true;
			//행크기와 열크기가 모두 1~10사이의 정수인지 확인
		}while(!(isRow && isCol));
		
		//랜덤 영어대문자를 입력
		//A: 65 ~ Z:90
		char [][] arr= new char[rowNum][colNum];
		for(int r=0; r<rowNum; r++) {
			for(int c=0; c<colNum; c++)
				arr[r][c]=(char)(Math.random()*26+65);
		}
		
		for(int r=0; r<rowNum; r++) {
			for(int c=0; c<colNum; c++)
				System.out.printf("%-4c", arr[r][c]);
			System.out.println();
		}
	}
	
	//실습문제 6
	public void practice6() {
		String[][] strArr=new String[][] {
			{"이","까","왔", "앞","힘"},
			{"차","지","습","으","냅"},
			{"원","열","니","로","시"},
			{"배","심","다","좀","다"},
			{"열","하","!","더","!!"}
		};
		
		System.out.println("[ 기존흐름(가로방향) ]");
		for(int r=0; r<strArr.length; r++) {
			for(int c=0; c<strArr[r].length; c++)
				System.out.print(strArr[r][c]+" ");
			System.out.println();
		}
		System.out.println();
		System.out.println("[ 세로방향  ]");
		for(int c=0; c<strArr.length; c++) {
			for(int r=0; r<strArr.length; r++)
				System.out.print(strArr[r][c]+" ");
			System.out.println();
		}
	}
	
	//실습문제7
	public void practice7() {
		Scanner sc =new Scanner(System.in);
		//사용자에게 행의 크기를 입력받고
		System.out.print("행의 크기: ");
		int rowSize= sc.nextInt();
		if(rowSize>0) {
			//문자형 가변 배열을 선언 및 할당
			char dynamicArray[][]=new char[rowSize][];
			
			//그수만큼의 반복을 통해 열의 크기를 받아
			// 각 인덱스에 a부터 총 인덱스 개수만큼 하나씩 늘려서 저장하고 출력
			char now='a';
			for(int r=0; r<dynamicArray.length; r++) {
				System.out.print(r+"행의 열 크기:");
				int colSize=sc.nextInt();
				dynamicArray[r]=new char[colSize]; 
				
				//배열원소 알파벳 입력
				for(int c=0; c<dynamicArray[r].length; c++)
					dynamicArray[r][c]=now++;
			}
			
			//배열출력
			for(int r=0; r<dynamicArray.length; r++) {
				for(int c=0; c<dynamicArray[r].length; c++)
					System.out.print(dynamicArray[r][c]+" ");
				System.out.println();
			}
		}else {
			System.out.println("0보다 큰 수를 입력해주세요!");
		}
	}
	
	//실습문제8
	public void practice8() {
		//1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고
		String [] students= {
				"강건강", "남나나", "도대담", "류라라", 
				"문미미", "박보배", "송성실", "윤예의",
				"진재주", "차천축", "피풍표", "홍하하"
		};
		
		//3행 2열으로 2차원배열 2개를 이용하여 분단을 나눠
		String [][] team= new String[3][2];
		int teamCnt=students.length/(team.length * team[0].length) ; //분단 개수
		int nowTeam=1;//시작분단
		int nowStudent=0; //시작학생
		do {
			for(int r=0; r<team.length; r++) {
				for(int c=0; c<team[r].length; c++)
					team[r][c]=students[nowStudent++];
			}
			
			System.out.println("== "+nowTeam+"분단 ==");
			for(int r=0; r<team.length; r++) {
				for(int c=0; c<team[r].length; c++)
					System.out.print(team[r][c]+" ");
				System.out.println();
			}
			
			nowTeam++;
		}while(nowTeam<=teamCnt);
	}
	
	public int[] isStudent(String name) {
		String [] students= {
				"강건강", "남나나", "도대담", "류라라", 
				"문미미", "박보배", "송성실", "윤예의",
				"진재주", "차천축", "피풍표", "홍하하"
		};
		
		
		//학생들을 차례대로 String team[][][]배열에 넣는다.
		int now=0;
		String team[][][]=new String[2][3][2];
		for(int i=0; i<team.length; i++) {
			for(int r=0; r<team[i].length; r++) {
				for(int c=0; c<team[i][r].length; c++)
					team[i][r][c]=students[now++];
			}
		}
		
		//practice9() 다른 풀이.
//		for(int i=0; i<team.length; i++) {
//			for(int r=0; r<team[i].length; r++) {
//				for(int c=0; c<team[i][r].length; c++)
//					System.out.print(team[i][r][c]+" ");
//				System.out.println();
//			}
//			System.out.println();
//		}
		
		//name인 학생이 없다고 초기화함.
		//0번째 인덱스: 분단(1~2)
		//1번째 인덱스: 행번호(줄번호: 1~3)
		//2번째 인덱스: 열번호(0:왼쪽, 1: 오른쪽)
		int result[]= {-1,-1,-1};
		
		
		for(int i=0; i<team.length; i++) { //i번째 분단
			for(int r=0; r<team[i].length; r++) {//행
				for(int c=0; c<team[i][r].length; c++) {//열
					if(team[i][r][c].equals(name)) {
						//검색한 학생이 존재한다면
						result[0]=(i+1);//분단
						result[1]=(r+1);//몇번째줄(1~3)
						result[2]=c; //왼쪽:0, 오른쪽:1
					}
				}
			}
		}
		return result;
	}
	
	//실습문제9
	public void practice9() {
		//자리 배치한 것을 가지고 학생이름을 검색하여
		//해당 학생이 어느 자리에 앉았는지 출력하시오.
		Scanner sc=new Scanner(System.in);
		practice8(); //자리표를 불러온다.
		System.out.println("=======================");
		System.out.print("검색할 학생 이름을 입력하세요: ");
		String searchName=sc.nextLine();
		//검색한 이름이 좌석에 있는가?
		int result[]=isStudent(searchName);
		if(result[0]>0) {
			//분단은 1,2분단으로 되어있기때문에 -> 검색한 이름이 존재함
			
			//몇번째줄?
			String jul="";
			switch(result[1]) {
			case 1:jul="첫";break;
			case 2:jul="두";break;
			case 3:jul="세";break;
			}
			
			//왼쪽오른쪽?
			String leftRight=(result[2]==0)?"왼쪽":"오른쪽";
			
			//검색결과 출력
			System.out.println("검색하신 "+searchName+" 학생은 "+ result[0]+"분단 "+jul+"번째 줄 "+leftRight+"에 있습니다.");
			
		}else {
			//존재하지 않음
			System.out.println("검색하신 "+searchName+" 학생은 존재하지 않습니다.");
		}
	}
	
}

package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	//배열- 실습문제1
	public void practice1() {
		//길이가 10인 배열을 선언하고
		int [] arr= new int[10];
		
		//1~10까지의 값을 반복문을 이용하여
		for(int i=0; i<arr.length; i++)
			arr[i]=i+1;
		
		//순서대로 배열 인덱스에 넣은 후 값을 출력
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	
	//실습문제2
	public void practice2() {
		//길이가 10인 배열을 선언한다.
		int []arr= new int[10];
		
		//1~10까지의 값을 반복문을 이용하여
		//역순으로 배열인덱스에 넣은후 값을 출력
		for(int i=0; i<arr.length; i++) {
			arr[i]=arr.length-i;
		}
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	
	//실습문제3
	
	
	//실습문제4
	
	
	//2020.05.28 
	//실습문제5
	
	//실습문제6
	
	//실습문제 11
	
	//실습문제 15
	//최소한 시간복잡도O(N)으로 나타내보기.
	public void practice15() {
		Scanner sc =new Scanner(System.in);
		System.out.print("문자열: ");
		String word= sc.nextLine(); // \n을같이 받지만, \n을 문자의 끝으로 인지
		
		// 최소 한번이라도 사용한 알파벳들을 모아놓음.
		boolean isUsed[] =new boolean[26]; //알파벳이 사용된 상태인지를 확인(false로 초기화)
		char uniqueAlpha[]= new char[26]; //최대 26(알파벳길이)
		
		int uniqueAlphaLength=0; // 최소 한번 사용한 단어의 길이를 구한다.
		for(int i=0; i<word.length(); i++) {
			//현재 영어문자
			char current=word.toLowerCase().charAt(i);
			
			//현재 영어문자가 사용된 상태인가?
			int alphaIdx= current-'a';
			if(!isUsed[alphaIdx]) {
				//아직 사용되지 않은 상태라면
				isUsed[alphaIdx]=true;
				
				//current 알파벳을 추가하고
				//최소 한번이상이라도 사용한 알파벳 길이 증가 
				uniqueAlpha[uniqueAlphaLength++]=current;
			}
		}
		
		System.out.print("문자열에 있는 문자 : ");
		for(int i=0; i<uniqueAlphaLength; i++) {
			char current=uniqueAlpha[i];
			if(i==uniqueAlphaLength-1) //마지막문자
				System.out.println(current);
			else
				System.out.print(current+", ");
			
		}
		System.out.println("문자 개수: "+uniqueAlphaLength);
	}
	
	public void practice15_2() {
		//어떤 문자가 들어갔는지 배열에 저장하고
		//문자의 개수와 함께 출력
		Scanner sc =new Scanner(System.in);
		System.out.print("문자열: ");
		String words= sc.next();
		
		//현재 단어의 길이만큼의 배열공간 할당
		char []usedAlpha= new char[words.length()];
		
		//그 알파벳이 최소 한번이상 사용했는지를 확인
		
		int uniqueCnt=0; //최소 한번이상(중복x) 사용한 알파벳 개수
		
		
		for(int i=0; i<words.length(); i++) {
			//현재 알파벳
			char current= words.charAt(i);
			
			//현재 알파벳이 usedAlpha에 있는가?
			boolean isHere= false; //usedAlpha에 current가 없다고 초기화한다
			
			for(int j=0; j< usedAlpha.length; j++) {
				//current가 usedAlpha 배열에 있다면
				if(usedAlpha[j]==current) {
					isHere=true;
					break;
				}
			}
			
			//현재알파벳이 있는가?
			if(isHere) //있다면-> uniqueCnt를 플러스한다.
				uniqueCnt++;
			
			
		}
		
		System.out.print("문자열에 있는 문자 :");
		for(int i=0; i<isUsedAlpha.length; i++)
			if(isUsedAlpha[i])
				System.out.print((char)('a'+i)+ " ");
		System.out.println("\n문자 개수: "+uniqueCnt);
	}
	
	//실습문제16
	
	
	
}

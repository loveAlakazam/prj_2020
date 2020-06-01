package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	// 배열- 실습문제1
	public void practice1() {
		// 길이가 10인 배열을 선언하고
		int[] arr = new int[10];

		// 1~10까지의 값을 반복문을 이용하여
		for (int i = 0; i < arr.length; i++)
			arr[i] = i + 1;

		// 순서대로 배열 인덱스에 넣은 후 값을 출력
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	// 실습문제2
	public void practice2() {
		// 길이가 10인 배열을 선언한다.
		int[] arr = new int[10];

		// 1~10까지의 값을 반복문을 이용하여
		// 역순으로 배열인덱스에 넣은후 값을 출력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	// 실습문제3
	public void practice3() {
		Scanner sc= new Scanner(System.in);
		System.out.print("양의 정수: ");
		int num= sc.nextInt();
		if(num>0) {

			int arr[]= new int[num];
			for(int i=0; i<arr.length ;i++)
				arr[i]=(i+1);
			for(int i=0; i<arr.length; i++)
				System.out.print(arr[i]+" ");
			
		}else {
			System.out.println("양의 정수를 입력해주세요!");
		}
	}

	// 실습문제4
	public void practice4() {
		//길이가 5인 String배열 선언
		String fruits[]= {"사과", "귤","포도", "복숭아", "참외"};
		System.out.print(fruits[1]);
	}


	// 실습문제5
	public void practice5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열: ");
		String words= sc.nextLine();
		
		System.out.print("문자: ");
		char target= sc.nextLine().charAt(0);
		
		//문자열에 문자가 들어있는지 확인하는 배열
		boolean isTarget[]=new boolean [words.length()];
		
		//target문자를 카운트
		int targetCnt=0;
		
		for(int i=0; i<words.length(); i++)
			if(target==words.charAt(i)) { //target이들어잇다면
				isTarget[i]=true;
				targetCnt++;
			}
		System.out.print(words+"에 "+target+"이 존재하는 위치 (인덱스): ");
		for(int i=0; i<words.length(); i++)
			if(isTarget[i])
				System.out.print(i+" ");
		
		System.out.println("\n"+target+"의 개수: "+targetCnt);
	}

	
	// 실습문제6
	public void practice6() {
		//월~일까지 초기화된 문자열 배열을 만들고
		//0~6까지의 숫자를 입력받아
		Scanner sc= new Scanner(System.in);
		System.out.print("0~6 사이의 숫자 입력: ");
		int num= sc.nextInt();
		
		if(num>=0 && num<=6) {
			//입력한 숫자와 같은 인덱스에 있는 요일을 출력
			String days[]= {"월","화","수","목","금","토","일"};
			System.out.println(days[num]+"요일");
		}else {

			//범위에 없는 숫자를 입력 시 "잘못 입력했습니다"라고 출력
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}

	
	// 실습문제 7
	public void practice7() {
		Scanner sc= new Scanner(System.in);
		System.out.print("정수: ");
		int num= sc.nextInt();
		
		int arr[]= new int[num];
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을값: ");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println("\n총합: "+ sum);
	}
	
	// 실습문제 8
	public void practice8() {
		Scanner sc= new Scanner(System.in);
		
		int num;
		do {
			System.out.print("정수: ");
			num=sc.nextInt();
			//3이상 홀수 자연수를 입력
			if(num>=3 && num%2!=0) {
				int []arr=new int[num];
				int now=0;
				//배열에 값넣기
				for(int i=0; i<arr.length; i++) {
					//배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고
					if(i<=(arr.length/2))
						arr[i]=++now;
						
					//중간이후에부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력
					else
						arr[i]=--now;
				}
				//arr출력
				for(int i=0; i<arr.length; i++) {
					int current= arr[i];
					if(i!=arr.length-1)
						System.out.print(current+", ");
					else
						System.out.print(current);
				}
				return;
			}else {
				//3미만이거나, 짝수라면 계속입력
				System.out.println("다시 입력하세요.");
			}
		}while(true);
	}
	
	
	// 실습문제 9
	public void practice9() {
		Scanner sc= new Scanner(System.in);
		//사용자가 입력한 값이 배열에 있는지 검색한다.
		System.out.print("치킨 이름을 입력하세요 : ");
		String userInput= sc.nextLine();
		
		String menu[]= {"후라이드", "양념", "고추 바사삭", "허니콤보", "슉뿌림", "자메이칸 통다리"};
		for(int i=0; i<menu.length; i++) {
			//사용자 입력과 menu[i]번째 문자열이 일치하면 배달가능
			if(userInput.equals(menu[i])) {
				System.out.println(userInput+"치킨 배달가능");
				return; //종료 및 호출한 곳으로 돌아간다.
			}	
		}
		System.out.println(userInput+"치킨은 없는 메뉴입니다.");
	}
	
	
	// 실습문제 10
	public void practice10() {
		Scanner sc= new Scanner(System.in);
		System.out.print("주민등록번호 (-포함): ");
		String personId= sc.nextLine();
		if(personId.length() !=14) {
			System.out.println("주민번호를 잘못 입력했습니다!");
		}else {
			char [] originId= new char[14]; //14자리
			for(int i=0; i<originId.length; i++)
				originId[i]=personId.charAt(i);
			
			//복사본(깊은복사)을 만든다.
			//복사본 배열은 '-' 이후 뒷자리를 '*'로 가린다.
			//방법1 : 반복문을 이용
			char [] copyId1= new char[originId.length];
			for(int i=0; i<copyId1.length; i++) {
				copyId1[i]=originId[i]; //원본을 복사한뒤에
				if(i>=7) //'-'뒷자리 수라면, 인덱스가 7이상이라면
					copyId1[i]='*'; //복사본은 가린다.
			}
			
			System.out.print("\n(복사본1): ");
			for(char i : copyId1) 
				System.out.print(i);
			System.out.println();

			
			//방법2: System.arraycopy()이용
			char [] copyId2= new char[originId.length];
			System.arraycopy(originId, 0, copyId2, 0, originId.length);
			
			for(int i=0; i<copyId2.length; i++)
				if(i>=7)
					copyId2[i]='*';
			
			System.out.print("\n(복사본2): ");
			for(char i : copyId2)
				System.out.print(i);
			System.out.println();
			
			
			//방법3: Arrays.copyOf()이용
			char [] copyId3= Arrays.copyOf(originId, originId.length);
			for(int i=0; i<copyId3.length; i++)
				if(i>=7)
					copyId3[i]='*';
			
			System.out.print("\n(복사본3): ");
			for(int i=0; i<copyId3.length; i++) 
				System.out.print(copyId3[i]);	
			System.out.println();
			
			
			//원본
			System.out.print("원본: ");
			for(char i: originId)
				System.out.print(i);
			System.out.println();
		}
	}
	
	
	// 실습문제 11
	public void practice11() {
		//10개의 값을 저장할 수 있는 정수형배열을 선언 및 할당
		int [] nums=new int[10];
		
		//1~10사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요
		for(int i=0; i<nums.length; i++) {
			//난수 생성
			int randomNum=(int)(Math.random()*10+1);
			nums[i]=randomNum;
		}
		
		//출력
		for(int i=0; i<nums.length; i++)
			System.out.print(nums[i]+" ");
	}
	
	
	// 실습문제12
	public void practice12() {
		//10개의 정수형 배열 선언 및 할당
		int nums[]= new int[10];
		int max=0;
		int min=11;
		for(int i=0; i<nums.length; i++) {
			int randomNum=(int)(Math.random()*10+1);
			nums[i]=randomNum;
			max=Math.max(max, nums[i]);
			min=Math.min(min, nums[i]);
		}
		for(int i=0; i<nums.length; i++)
			System.out.print(nums[i]+" ");
		//최댓값 최솟값 출력
		System.out.println();
		System.out.println("최댓값: "+max);
		System.out.println("최솟값: "+min);
	}
	
	
	// 실습문제 13
	public void practice13() {
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당
		int nums[]= new int[10];
		
		boolean isUsed[]=new boolean[10];
		
		//1~10 사이의 난수를 발생시켜 중복되는 값이 없게 배열에 초기화 한후 출력하시오.
		for(int i=0; i<nums.length; i++) {
			int randomNum; 
			do{
				randomNum=(int)(Math.random()*10+1);
			}while(isUsed[randomNum-1]); //랜덤넘버가 사용된 숫자라면 루프문 진입
			//아직 사용하지 않은 숫자라면-> true로 사용했다고 표시.
			isUsed[randomNum-1]=true;
			nums[i]=randomNum;
		}
		
		//출력
		for(int i=0; i<nums.length; i++)
			System.out.print(nums[i]+" ");
	}
	
	
	// 실습문제 14
	public void practice14() {
		//로또번호(1~45) 자동생성기 프로그램
		//중복값없이 오름차순으로 정렬
		int lotto[]= new int[6];
		boolean isUsed[]= new boolean[45];
		for(int i=0; i<lotto.length; i++) {
			//1~45까지 랜덤넘버 생성
			int randomNum;
			do{
				randomNum=(int)(Math.random()*45+1);
			}while(isUsed[randomNum-1]);//이미사용된 숫자라면 다시 루프문진입
			
			//아직 사용된 숫자가 아니라면
			//현재랜덤넘버는 이미 사용한 숫자로 바꾼다.
			isUsed[randomNum-1]=true;
			lotto[i]=randomNum;
		}
		
		//로또번호를 오름차순으로 정렬(Arrays.sort())
		Arrays.sort(lotto);
		for(int i=0; i<lotto.length; i++)
			System.out.print(lotto[i]+" ");
	}
	
	// 실습문제 15
	// 최소한 시간복잡도O(N)으로 나타내보기.
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열: ");
		String word = sc.nextLine(); // \n을같이 받지만, \n을 문자의 끝으로 인지

		// 최소 한번이라도 사용한 알파벳들을 모아놓음.
		boolean isUsed[] = new boolean[26]; // 알파벳이 사용된 상태인지를 확인(false로 초기화)
		char uniqueAlpha[] = new char[26]; // 최대 26(알파벳길이)

		int uniqueAlphaLength = 0; // 최소 한번 사용한 단어의 길이를 구한다.
		for (int i = 0; i < word.length(); i++) {
			// 현재 영어문자
			char current = word.toLowerCase().charAt(i);

			// 현재 영어문자가 사용된 상태인가?
			int alphaIdx = current - 'a';
			if (!isUsed[alphaIdx]) {
				// 아직 사용되지 않은 상태라면
				isUsed[alphaIdx] = true;

				// current 알파벳을 추가하고
				// 최소 한번이상이라도 사용한 알파벳 길이 증가
				uniqueAlpha[uniqueAlphaLength++] = current;
			}
		}

		System.out.print("문자열에 있는 문자 : ");
		for (int i = 0; i < uniqueAlphaLength; i++) {
			char current = uniqueAlpha[i];
			if (i == uniqueAlphaLength - 1) // 마지막문자
				System.out.println(current);
			else
				System.out.print(current + ", ");

		}
		System.out.println("문자 개수: " + uniqueAlphaLength);
	}

	
	//배열 실습문제 미경님 코드 리뷰
	public void practice15_kmk() {
		// 문자열 입력 받기
		// 어떤 문자가 들어갔는지 배열에 저장
		// 문자 개수와 함께 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자열에 있는 문자 : ");
		
		/*//미경씨 코드
		char[] arr = new char[str.length()];
		char[] com = new char['z'-'a'+1]; //길이 26 (a에서부터 z)입니다.
		int count = 0;
		*/
		
		// (코멘트1) 
		// 알파벳 카운트(alphaCnt)로 해볼게요.
		// 알파벳(a~z)은 총 26개 있습니다.
		// 알파카운트는 각 알파벳이 몇번 사용됐는지를 알려주는 목적으로 사용돼요.
		// 즉 src="apple"일때의 알파카운트는
		// alphaCnt['a'-'a']=alphaCnt[0]=1
		// alphaCnt['p'-'a']=alphaCnt[15]=2
		// alphaCnt['l'-'a']=alphaCnt[11]=1
		// alphaCnt['e'-'a']=alphaCnt[4]=1
		// 이고, 나머지 알파벳의 alphaCnt는 모두 0이죠.
		int [] alphaCnt=new int[26]; 
		
		
	
		//각 인덱스에 해당하는 문자를 배열arr에 넣는다. 는 목적으로 for문을 만들었군요.
		//음 그런데 조금 효율성을 따져본다면, 굳이 넣을 필요는 없는거같아요.
		//각 문자열을 배열에 따로 저장하기보다는 바로 카운트를 하는게 좋을 거같아요!
		/*//미경씨 코드
		char[] arr = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i); // str
		}
		*/
		char now; //현재 나온 알파벳
		for(int i=0; i<str.length(); i++) {
			now=str.charAt(i); 
			alphaCnt[now-'a']++; //현재 알파벳 나온횟수를 1증가
		}

		
		

		/*
		char a = 'a';
		for(char j = 0; j < com.length; j++) {
			com[j] = a;	// a~z
			a++;
		}
		*/
		// 저는 아래코드 부분부터 무슨 의미인지 잘몰라서...
		// 과감하게 스킵할게요 죄송해요 ㅠ
		// 조금 이해하기 쉽게 설명해볼게요.ㅠㅠ
		
		// alphaCnt는 입력한 문자열 str에 있는 알파벳이 몇번쓰였는지를 카운트하는 거에요
		// 그렇다면 str(입력한 문자열)="apple"이라면, p가 2번이상나왔지만
		// a(1번), p(2번), l(1번), e(1번) 순서로 출력해야겠죠?
		// (1번), (2번)은 "apple"문자열에서 나온 각 알파벳이 나온 횟수를 의미해요
		
		// 만약에 str(입력한 문자열)="star"이라면, 어떠한 문자도 2번이상 안나왔죠?
		// 즉, 서로다른 문자들로만 있다면, s t a r 을 출력하겠죠?
		// 맨처음에 미경씨가 만든 arr에 넣어봐요.
		
		// 즉, 최소 한번이라도 나온 문자가 나온 횟수는 최대 입력한 문자열(str)의 길이겠죠.
		// "apple"의 경우에는 char형 배열 arr은 {'a', 'p', 'l', 'e'}를 의미하고
		// "star"의 경우에는  char형 배열 arr은 {'s', 't', 'a', 'r'}이죠.
		
		char[] arr = new char[str.length()];
		int count=0; //들어있는 단어 개수에요.
		
		for(int i=0; i<str.length(); i++) {
			now= str.charAt(i);//현재 i번째 위치의 단일문자를 나타냅니다.
			
			//arr에 now(단일문자)가 있는지 확인해주는 boolean을 만든다.
			boolean isHere=false;
			
			//arr에 now가 있는지 탐색한다.
			for(int j=0; j<arr.length; j++) {
				if(arr[j]==now) //arr배열에 now가 들어있다.
					isHere=true;
			}
		
			//그런데 now가 arr에 없는데(isHere은 false)
			//now에 해당하는 alphaCnt는 0보다 크다면
			//arr에 now(현재 i번째 위치의 단일문자)를 넣는다.
			if(isHere==false && alphaCnt[now-'a']>0) {
				arr[count]=now;
				count++;
			}
		}
		
		
		
		//여긴 문자 출력이군요
		//문자열에 있는 문자를 하나씩 출력해야하는데
		//마지막 문자를 제외한 나머지문자는 모두 , 가 들어있죠?
		/*
		for(int b = 0; b < str.length(); b++) {
			//arr[b]와 com[b]
			if(arr[b] == com[b]) {
				System.out.print(" ");
			} else {
				System.out.print(arr[b] + ", ");
			}
		}
		*/
		for(int i = 0; i < count; i++) {
			if(arr[i] == count-1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.print("문자 개수 : " + count);
		
		
//		for(int j = 0; j < str.length(); j++) {
//			if() {
//				count += 1;
//			}
//			System.out.print("문자 개수 : " + count);
//		}
	}
	
	

	// 실습문제16
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		String userInput = ""; // 사용자로부터 입력한 대상들
		char isContinue;

		do {
			// 사용자가 입력한 배열 길이만큼의 문자열 배열을 선언 및 할당
			System.out.print("배열의 크기를 입력하세요 : ");
			int arraySize = sc.nextInt(); // 배열의 크기
			String strArray[] = new String[arraySize];
			
			//버퍼를 비운다
			sc.nextLine();
			
			for (int i = 0; i < strArray.length; i++) {
				System.out.print((i + 1) + "번째 문자열 : ");
				strArray[i] = sc.nextLine();
				
				//마지막 문자열
				if(i==strArray.length-1)
					userInput+=strArray[i];
				else
					userInput+=(strArray[i]+", ");
			}

			do {
				System.out.print("더 값을 입력하시겠습니까? (Y/N) : ");
				isContinue = sc.nextLine().toLowerCase().charAt(0);
				switch (isContinue) {
				case 'y':
					userInput+=", ";
					break; 
					
				case 'n':
					// 더 값을 입력할지에 대한 대답이 n이라면 배열전체의 값을 출력한다.
					System.out.println("["+userInput+"]");
					return;

				default:
					System.out.println("잘못입력했습니다.(Y/N)중 하나만 다시 입력해주세요!");
				}
			} while (isContinue != 'y'); //y를 입력하면 계속 진행, n은 호출한곳으로 리턴, 다른문자 y입력할때까지 무한루프
			// 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화
		} while (true);		
	}
}

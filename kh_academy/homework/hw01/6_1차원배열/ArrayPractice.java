package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	// �迭- �ǽ�����1
	public void practice1() {
		// ���̰� 10�� �迭�� �����ϰ�
		int[] arr = new int[10];

		// 1~10������ ���� �ݺ����� �̿��Ͽ�
		for (int i = 0; i < arr.length; i++)
			arr[i] = i + 1;

		// ������� �迭 �ε����� ���� �� ���� ���
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	// �ǽ�����2
	public void practice2() {
		// ���̰� 10�� �迭�� �����Ѵ�.
		int[] arr = new int[10];

		// 1~10������ ���� �ݺ����� �̿��Ͽ�
		// �������� �迭�ε����� ������ ���� ���
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	// �ǽ�����3
	public void practice3() {
		Scanner sc= new Scanner(System.in);
		System.out.print("���� ����: ");
		int num= sc.nextInt();
		if(num>0) {

			int arr[]= new int[num];
			for(int i=0; i<arr.length ;i++)
				arr[i]=(i+1);
			for(int i=0; i<arr.length; i++)
				System.out.print(arr[i]+" ");
			
		}else {
			System.out.println("���� ������ �Է����ּ���!");
		}
	}

	// �ǽ�����4
	public void practice4() {
		//���̰� 5�� String�迭 ����
		String fruits[]= {"���", "��","����", "������", "����"};
		System.out.print(fruits[1]);
	}


	// �ǽ�����5
	public void practice5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڿ�: ");
		String words= sc.nextLine();
		
		System.out.print("����: ");
		char target= sc.nextLine().charAt(0);
		
		//���ڿ��� ���ڰ� ����ִ��� Ȯ���ϴ� �迭
		boolean isTarget[]=new boolean [words.length()];
		
		//target���ڸ� ī��Ʈ
		int targetCnt=0;
		
		for(int i=0; i<words.length(); i++)
			if(target==words.charAt(i)) { //target�̵���մٸ�
				isTarget[i]=true;
				targetCnt++;
			}
		System.out.print(words+"�� "+target+"�� �����ϴ� ��ġ (�ε���): ");
		for(int i=0; i<words.length(); i++)
			if(isTarget[i])
				System.out.print(i+" ");
		
		System.out.println("\n"+target+"�� ����: "+targetCnt);
	}

	
	// �ǽ�����6
	public void practice6() {
		//��~�ϱ��� �ʱ�ȭ�� ���ڿ� �迭�� �����
		//0~6������ ���ڸ� �Է¹޾�
		Scanner sc= new Scanner(System.in);
		System.out.print("0~6 ������ ���� �Է�: ");
		int num= sc.nextInt();
		
		if(num>=0 && num<=6) {
			//�Է��� ���ڿ� ���� �ε����� �ִ� ������ ���
			String days[]= {"��","ȭ","��","��","��","��","��"};
			System.out.println(days[num]+"����");
		}else {

			//������ ���� ���ڸ� �Է� �� "�߸� �Է��߽��ϴ�"��� ���
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}

	
	// �ǽ����� 7
	public void practice7() {
		Scanner sc= new Scanner(System.in);
		System.out.print("����: ");
		int num= sc.nextInt();
		
		int arr[]= new int[num];
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			System.out.print("�迭 "+i+"��° �ε����� ������: ");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println("\n����: "+ sum);
	}
	
	// �ǽ����� 8
	public void practice8() {
		Scanner sc= new Scanner(System.in);
		
		int num;
		do {
			System.out.print("����: ");
			num=sc.nextInt();
			//3�̻� Ȧ�� �ڿ����� �Է�
			if(num>=3 && num%2!=0) {
				int []arr=new int[num];
				int now=0;
				//�迭�� ���ֱ�
				for(int i=0; i<arr.length; i++) {
					//�迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���� �ְ�
					if(i<=(arr.length/2))
						arr[i]=++now;
						
					//�߰����Ŀ����� �������� 1�� �����Ͽ� ������������ ���� �־� ���
					else
						arr[i]=--now;
				}
				//arr���
				for(int i=0; i<arr.length; i++) {
					int current= arr[i];
					if(i!=arr.length-1)
						System.out.print(current+", ");
					else
						System.out.print(current);
				}
				return;
			}else {
				//3�̸��̰ų�, ¦����� ����Է�
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}while(true);
	}
	
	
	// �ǽ����� 9
	public void practice9() {
		Scanner sc= new Scanner(System.in);
		//����ڰ� �Է��� ���� �迭�� �ִ��� �˻��Ѵ�.
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String userInput= sc.nextLine();
		
		String menu[]= {"�Ķ��̵�", "���", "���� �ٻ��", "����޺�", "���Ѹ�", "�ڸ���ĭ ��ٸ�"};
		for(int i=0; i<menu.length; i++) {
			//����� �Է°� menu[i]��° ���ڿ��� ��ġ�ϸ� ��ް���
			if(userInput.equals(menu[i])) {
				System.out.println(userInput+"ġŲ ��ް���");
				return; //���� �� ȣ���� ������ ���ư���.
			}	
		}
		System.out.println(userInput+"ġŲ�� ���� �޴��Դϴ�.");
	}
	
	
	// �ǽ����� 10
	public void practice10() {
		Scanner sc= new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ (-����): ");
		String personId= sc.nextLine();
		if(personId.length() !=14) {
			System.out.println("�ֹι�ȣ�� �߸� �Է��߽��ϴ�!");
		}else {
			char [] originId= new char[14]; //14�ڸ�
			for(int i=0; i<originId.length; i++)
				originId[i]=personId.charAt(i);
			
			//���纻(��������)�� �����.
			//���纻 �迭�� '-' ���� ���ڸ��� '*'�� ������.
			//���1 : �ݺ����� �̿�
			char [] copyId1= new char[originId.length];
			for(int i=0; i<copyId1.length; i++) {
				copyId1[i]=originId[i]; //������ �����ѵڿ�
				if(i>=7) //'-'���ڸ� �����, �ε����� 7�̻��̶��
					copyId1[i]='*'; //���纻�� ������.
			}
			
			System.out.print("\n(���纻1): ");
			for(char i : copyId1) 
				System.out.print(i);
			System.out.println();

			
			//���2: System.arraycopy()�̿�
			char [] copyId2= new char[originId.length];
			System.arraycopy(originId, 0, copyId2, 0, originId.length);
			
			for(int i=0; i<copyId2.length; i++)
				if(i>=7)
					copyId2[i]='*';
			
			System.out.print("\n(���纻2): ");
			for(char i : copyId2)
				System.out.print(i);
			System.out.println();
			
			
			//���3: Arrays.copyOf()�̿�
			char [] copyId3= Arrays.copyOf(originId, originId.length);
			for(int i=0; i<copyId3.length; i++)
				if(i>=7)
					copyId3[i]='*';
			
			System.out.print("\n(���纻3): ");
			for(int i=0; i<copyId3.length; i++) 
				System.out.print(copyId3[i]);	
			System.out.println();
			
			
			//����
			System.out.print("����: ");
			for(char i: originId)
				System.out.print(i);
			System.out.println();
		}
	}
	
	
	// �ǽ����� 11
	public void practice11() {
		//10���� ���� ������ �� �ִ� �������迭�� ���� �� �Ҵ�
		int [] nums=new int[10];
		
		//1~10������ ������ �߻����� �迭�� �ʱ�ȭ�� �� ����ϼ���
		for(int i=0; i<nums.length; i++) {
			//���� ����
			int randomNum=(int)(Math.random()*10+1);
			nums[i]=randomNum;
		}
		
		//���
		for(int i=0; i<nums.length; i++)
			System.out.print(nums[i]+" ");
	}
	
	
	// �ǽ�����12
	public void practice12() {
		//10���� ������ �迭 ���� �� �Ҵ�
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
		//�ִ� �ּڰ� ���
		System.out.println();
		System.out.println("�ִ�: "+max);
		System.out.println("�ּڰ�: "+min);
	}
	
	
	// �ǽ����� 13
	public void practice13() {
		//10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ�
		int nums[]= new int[10];
		
		boolean isUsed[]=new boolean[10];
		
		//1~10 ������ ������ �߻����� �ߺ��Ǵ� ���� ���� �迭�� �ʱ�ȭ ���� ����Ͻÿ�.
		for(int i=0; i<nums.length; i++) {
			int randomNum; 
			do{
				randomNum=(int)(Math.random()*10+1);
			}while(isUsed[randomNum-1]); //�����ѹ��� ���� ���ڶ�� ������ ����
			//���� ������� ���� ���ڶ��-> true�� ����ߴٰ� ǥ��.
			isUsed[randomNum-1]=true;
			nums[i]=randomNum;
		}
		
		//���
		for(int i=0; i<nums.length; i++)
			System.out.print(nums[i]+" ");
	}
	
	
	// �ǽ����� 14
	public void practice14() {
		//�ζǹ�ȣ(1~45) �ڵ������� ���α׷�
		//�ߺ������� ������������ ����
		int lotto[]= new int[6];
		boolean isUsed[]= new boolean[45];
		for(int i=0; i<lotto.length; i++) {
			//1~45���� �����ѹ� ����
			int randomNum;
			do{
				randomNum=(int)(Math.random()*45+1);
			}while(isUsed[randomNum-1]);//�̹̻��� ���ڶ�� �ٽ� ����������
			
			//���� ���� ���ڰ� �ƴ϶��
			//���緣���ѹ��� �̹� ����� ���ڷ� �ٲ۴�.
			isUsed[randomNum-1]=true;
			lotto[i]=randomNum;
		}
		
		//�ζǹ�ȣ�� ������������ ����(Arrays.sort())
		Arrays.sort(lotto);
		for(int i=0; i<lotto.length; i++)
			System.out.print(lotto[i]+" ");
	}
	
	// �ǽ����� 15
	// �ּ��� �ð����⵵O(N)���� ��Ÿ������.
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ�: ");
		String word = sc.nextLine(); // \n������ ������, \n�� ������ ������ ����

		// �ּ� �ѹ��̶� ����� ���ĺ����� ��Ƴ���.
		boolean isUsed[] = new boolean[26]; // ���ĺ��� ���� ���������� Ȯ��(false�� �ʱ�ȭ)
		char uniqueAlpha[] = new char[26]; // �ִ� 26(���ĺ�����)

		int uniqueAlphaLength = 0; // �ּ� �ѹ� ����� �ܾ��� ���̸� ���Ѵ�.
		for (int i = 0; i < word.length(); i++) {
			// ���� �����
			char current = word.toLowerCase().charAt(i);

			// ���� ����ڰ� ���� �����ΰ�?
			int alphaIdx = current - 'a';
			if (!isUsed[alphaIdx]) {
				// ���� ������ ���� ���¶��
				isUsed[alphaIdx] = true;

				// current ���ĺ��� �߰��ϰ�
				// �ּ� �ѹ��̻��̶� ����� ���ĺ� ���� ����
				uniqueAlpha[uniqueAlphaLength++] = current;
			}
		}

		System.out.print("���ڿ��� �ִ� ���� : ");
		for (int i = 0; i < uniqueAlphaLength; i++) {
			char current = uniqueAlpha[i];
			if (i == uniqueAlphaLength - 1) // ����������
				System.out.println(current);
			else
				System.out.print(current + ", ");

		}
		System.out.println("���� ����: " + uniqueAlphaLength);
	}

	
	//�迭 �ǽ����� �̰�� �ڵ� ����
	public void practice15_kmk() {
		// ���ڿ� �Է� �ޱ�
		// � ���ڰ� ������ �迭�� ����
		// ���� ������ �Բ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.next();
		System.out.print("���ڿ��� �ִ� ���� : ");
		
		/*//�̰澾 �ڵ�
		char[] arr = new char[str.length()];
		char[] com = new char['z'-'a'+1]; //���� 26 (a�������� z)�Դϴ�.
		int count = 0;
		*/
		
		// (�ڸ�Ʈ1) 
		// ���ĺ� ī��Ʈ(alphaCnt)�� �غ��Կ�.
		// ���ĺ�(a~z)�� �� 26�� �ֽ��ϴ�.
		// ����ī��Ʈ�� �� ���ĺ��� ��� ���ƴ����� �˷��ִ� �������� ���ſ�.
		// �� src="apple"�϶��� ����ī��Ʈ��
		// alphaCnt['a'-'a']=alphaCnt[0]=1
		// alphaCnt['p'-'a']=alphaCnt[15]=2
		// alphaCnt['l'-'a']=alphaCnt[11]=1
		// alphaCnt['e'-'a']=alphaCnt[4]=1
		// �̰�, ������ ���ĺ��� alphaCnt�� ��� 0����.
		int [] alphaCnt=new int[26]; 
		
		
	
		//�� �ε����� �ش��ϴ� ���ڸ� �迭arr�� �ִ´�. �� �������� for���� ���������.
		//�� �׷��� ���� ȿ������ �������ٸ�, ���� ���� �ʿ�� ���°Ű��ƿ�.
		//�� ���ڿ��� �迭�� ���� �����ϱ⺸�ٴ� �ٷ� ī��Ʈ�� �ϴ°� ���� �Ű��ƿ�!
		/*//�̰澾 �ڵ�
		char[] arr = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i); // str
		}
		*/
		char now; //���� ���� ���ĺ�
		for(int i=0; i<str.length(); i++) {
			now=str.charAt(i); 
			alphaCnt[now-'a']++; //���� ���ĺ� ����Ƚ���� 1����
		}

		
		

		/*
		char a = 'a';
		for(char j = 0; j < com.length; j++) {
			com[j] = a;	// a~z
			a++;
		}
		*/
		// ���� �Ʒ��ڵ� �κк��� ���� �ǹ����� �߸���...
		// �����ϰ� ��ŵ�ҰԿ� �˼��ؿ� ��
		// ���� �����ϱ� ���� �����غ��Կ�.�Ф�
		
		// alphaCnt�� �Է��� ���ڿ� str�� �ִ� ���ĺ��� ������������� ī��Ʈ�ϴ� �ſ���
		// �׷��ٸ� str(�Է��� ���ڿ�)="apple"�̶��, p�� 2���̻󳪿�����
		// a(1��), p(2��), l(1��), e(1��) ������ ����ؾ߰���?
		// (1��), (2��)�� "apple"���ڿ����� ���� �� ���ĺ��� ���� Ƚ���� �ǹ��ؿ�
		
		// ���࿡ str(�Է��� ���ڿ�)="star"�̶��, ��� ���ڵ� 2���̻� �ȳ�����?
		// ��, ���δٸ� ���ڵ�θ� �ִٸ�, s t a r �� ����ϰ���?
		// ��ó���� �̰澾�� ���� arr�� �־����.
		
		// ��, �ּ� �ѹ��̶� ���� ���ڰ� ���� Ƚ���� �ִ� �Է��� ���ڿ�(str)�� ���̰���.
		// "apple"�� ��쿡�� char�� �迭 arr�� {'a', 'p', 'l', 'e'}�� �ǹ��ϰ�
		// "star"�� ��쿡��  char�� �迭 arr�� {'s', 't', 'a', 'r'}����.
		
		char[] arr = new char[str.length()];
		int count=0; //����ִ� �ܾ� ��������.
		
		for(int i=0; i<str.length(); i++) {
			now= str.charAt(i);//���� i��° ��ġ�� ���Ϲ��ڸ� ��Ÿ���ϴ�.
			
			//arr�� now(���Ϲ���)�� �ִ��� Ȯ�����ִ� boolean�� �����.
			boolean isHere=false;
			
			//arr�� now�� �ִ��� Ž���Ѵ�.
			for(int j=0; j<arr.length; j++) {
				if(arr[j]==now) //arr�迭�� now�� ����ִ�.
					isHere=true;
			}
		
			//�׷��� now�� arr�� ���µ�(isHere�� false)
			//now�� �ش��ϴ� alphaCnt�� 0���� ũ�ٸ�
			//arr�� now(���� i��° ��ġ�� ���Ϲ���)�� �ִ´�.
			if(isHere==false && alphaCnt[now-'a']>0) {
				arr[count]=now;
				count++;
			}
		}
		
		
		
		//���� ���� ����̱���
		//���ڿ��� �ִ� ���ڸ� �ϳ��� ����ؾ��ϴµ�
		//������ ���ڸ� ������ ���������ڴ� ��� , �� �������?
		/*
		for(int b = 0; b < str.length(); b++) {
			//arr[b]�� com[b]
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
		System.out.print("���� ���� : " + count);
		
		
//		for(int j = 0; j < str.length(); j++) {
//			if() {
//				count += 1;
//			}
//			System.out.print("���� ���� : " + count);
//		}
	}
	
	

	// �ǽ�����16
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		String userInput = ""; // ����ڷκ��� �Է��� ����
		char isContinue;

		do {
			// ����ڰ� �Է��� �迭 ���̸�ŭ�� ���ڿ� �迭�� ���� �� �Ҵ�
			System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
			int arraySize = sc.nextInt(); // �迭�� ũ��
			String strArray[] = new String[arraySize];
			
			//���۸� ����
			sc.nextLine();
			
			for (int i = 0; i < strArray.length; i++) {
				System.out.print((i + 1) + "��° ���ڿ� : ");
				strArray[i] = sc.nextLine();
				
				//������ ���ڿ�
				if(i==strArray.length-1)
					userInput+=strArray[i];
				else
					userInput+=(strArray[i]+", ");
			}

			do {
				System.out.print("�� ���� �Է��Ͻðڽ��ϱ�? (Y/N) : ");
				isContinue = sc.nextLine().toLowerCase().charAt(0);
				switch (isContinue) {
				case 'y':
					userInput+=", ";
					break; 
					
				case 'n':
					// �� ���� �Է������� ���� ����� n�̶�� �迭��ü�� ���� ����Ѵ�.
					System.out.println("["+userInput+"]");
					return;

				default:
					System.out.println("�߸��Է��߽��ϴ�.(Y/N)�� �ϳ��� �ٽ� �Է����ּ���!");
				}
			} while (isContinue != 'y'); //y�� �Է��ϸ� ��� ����, n�� ȣ���Ѱ����� ����, �ٸ����� y�Է��Ҷ����� ���ѷ���
			// �迭�� �ε����� ���� �� ���� ����ڰ� �Է��Ͽ� �ʱ�ȭ
		} while (true);		
	}
}

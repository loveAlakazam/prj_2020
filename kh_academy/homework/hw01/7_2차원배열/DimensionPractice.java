package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	//�ǽ�����1
	public void practice1() {
		//3��3�� ¥�� ���ڿ� �迭�� ���� �� �Ҵ�
		//������ �迭: ��� ���� �������ִ� �迭
		String arr2d[][]=new String [3][3];
		for(int r=0; r<arr2d.length; r++) {
			for(int c=0; c<arr2d[r].length; c++) {
				arr2d[r][c]="("+r+","+c+")";
			}
		}
		
		//���
		for(int r=0; r<arr2d.length; r++) {
			for(int c=0; c<arr2d[r].length; c++)
				System.out.print(arr2d[r][c]);
			System.out.println();
		}
	}
	
	
	//�ǽ�����2
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
	
	
	//�ǽ�����3
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
			//r�� c��( 0<=r,c<=2): ������ �������� �����Ѵ�.
			if(r<arr.length-1) {
				int colSum=0; // �����࿡ �ִ� ������ ��
				for(int c=0; c<arr[r].length-1; c++) {
					arr[r][c]=(int)(Math.random()*10+1);
					colSum+=arr[r][c];
				}
				//������ ��
				arr[r][arr[r].length-1]=colSum;
			}
		}
		
		//�������� �ִ� �������
		for(int c=0; c<arr.length; c++) {
			int rowSum=0;
			for(int r=0; r<arr.length-1; r++) {
				rowSum+=arr[r][c];
			}
			arr[arr.length-1][c]=rowSum;
		}
		
		//���
		for(int r=0; r<arr.length; r++) {
			for(int c=0; c<arr[r].length; c++)
				System.out.printf("%4d",arr[r][c]);
			System.out.println();
		}
	}
	
	//�ǽ�����5
	public void practice5() {
		Scanner sc= new Scanner(System.in);
		
		// 1~10 ���� ������ �Է��ϸ� true���ȴ�.
		int rowNum=0;
		int colNum=0;
		boolean isRow, isCol;
		do {
			isRow=isCol=false; //false�� �ʱ�ȭ
			
			System.out.print("�� ũ��: ");
			rowNum= sc.nextInt();
			if(!(rowNum>=1 && rowNum<=10)) {
				System.out.println("1~10������ ���ڸ� �Է��ϼ���!");
				continue;
			}
			
			isRow=true;
			
			
			System.out.print("�� ũ��: ");
			colNum= sc.nextInt();
			if(!(colNum>=1 && colNum<=10)) {
				System.out.println("1~10������ ���ڸ� �Է��ϼ���!");
				continue;
			}
			
			isCol=true;
			//��ũ��� ��ũ�Ⱑ ��� 1~10������ �������� Ȯ��
		}while(!(isRow && isCol));
		
		//���� ����빮�ڸ� �Է�
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
	
	//�ǽ����� 6
	public void practice6() {
		String[][] strArr=new String[][] {
			{"��","��","��", "��","��"},
			{"��","��","��","��","��"},
			{"��","��","��","��","��"},
			{"��","��","��","��","��"},
			{"��","��","!","��","!!"}
		};
		
		System.out.println("[ �����帧(���ι���) ]");
		for(int r=0; r<strArr.length; r++) {
			for(int c=0; c<strArr[r].length; c++)
				System.out.print(strArr[r][c]+" ");
			System.out.println();
		}
		System.out.println();
		System.out.println("[ ���ι���  ]");
		for(int c=0; c<strArr.length; c++) {
			for(int r=0; r<strArr.length; r++)
				System.out.print(strArr[r][c]+" ");
			System.out.println();
		}
	}
	
	//�ǽ�����7
	public void practice7() {
		Scanner sc =new Scanner(System.in);
		//����ڿ��� ���� ũ�⸦ �Է¹ް�
		System.out.print("���� ũ��: ");
		int rowSize= sc.nextInt();
		if(rowSize>0) {
			//������ ���� �迭�� ���� �� �Ҵ�
			char dynamicArray[][]=new char[rowSize][];
			
			//�׼���ŭ�� �ݺ��� ���� ���� ũ�⸦ �޾�
			// �� �ε����� a���� �� �ε��� ������ŭ �ϳ��� �÷��� �����ϰ� ���
			char now='a';
			for(int r=0; r<dynamicArray.length; r++) {
				System.out.print(r+"���� �� ũ��:");
				int colSize=sc.nextInt();
				dynamicArray[r]=new char[colSize]; 
				
				//�迭���� ���ĺ� �Է�
				for(int c=0; c<dynamicArray[r].length; c++)
					dynamicArray[r][c]=now++;
			}
			
			//�迭���
			for(int r=0; r<dynamicArray.length; r++) {
				for(int c=0; c<dynamicArray[r].length; c++)
					System.out.print(dynamicArray[r][c]+" ");
				System.out.println();
			}
		}else {
			System.out.println("0���� ū ���� �Է����ּ���!");
		}
	}
	
	//�ǽ�����8
	public void practice8() {
		//1���� �迭�� 12���� �л����� �⼮�� ������ �ʱ�ȭ �ϰ�
		String [] students= {
				"���ǰ�", "������", "�����", "�����", 
				"���̹�", "�ں���", "�ۼ���", "������",
				"������", "��õ��", "��ǳǥ", "ȫ����"
		};
		
		//3�� 2������ 2�����迭 2���� �̿��Ͽ� �д��� ����
		String [][] team= new String[3][2];
		int teamCnt=students.length/(team.length * team[0].length) ; //�д� ����
		int nowTeam=1;//���ۺд�
		int nowStudent=0; //�����л�
		do {
			for(int r=0; r<team.length; r++) {
				for(int c=0; c<team[r].length; c++)
					team[r][c]=students[nowStudent++];
			}
			
			System.out.println("== "+nowTeam+"�д� ==");
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
				"���ǰ�", "������", "�����", "�����", 
				"���̹�", "�ں���", "�ۼ���", "������",
				"������", "��õ��", "��ǳǥ", "ȫ����"
		};
		
		
		//�л����� ���ʴ�� String team[][][]�迭�� �ִ´�.
		int now=0;
		String team[][][]=new String[2][3][2];
		for(int i=0; i<team.length; i++) {
			for(int r=0; r<team[i].length; r++) {
				for(int c=0; c<team[i][r].length; c++)
					team[i][r][c]=students[now++];
			}
		}
		
		//practice9() �ٸ� Ǯ��.
//		for(int i=0; i<team.length; i++) {
//			for(int r=0; r<team[i].length; r++) {
//				for(int c=0; c<team[i][r].length; c++)
//					System.out.print(team[i][r][c]+" ");
//				System.out.println();
//			}
//			System.out.println();
//		}
		
		//name�� �л��� ���ٰ� �ʱ�ȭ��.
		//0��° �ε���: �д�(1~2)
		//1��° �ε���: ���ȣ(�ٹ�ȣ: 1~3)
		//2��° �ε���: ����ȣ(0:����, 1: ������)
		int result[]= {-1,-1,-1};
		
		
		for(int i=0; i<team.length; i++) { //i��° �д�
			for(int r=0; r<team[i].length; r++) {//��
				for(int c=0; c<team[i][r].length; c++) {//��
					if(team[i][r][c].equals(name)) {
						//�˻��� �л��� �����Ѵٸ�
						result[0]=(i+1);//�д�
						result[1]=(r+1);//���°��(1~3)
						result[2]=c; //����:0, ������:1
					}
				}
			}
		}
		return result;
	}
	
	//�ǽ�����9
	public void practice9() {
		//�ڸ� ��ġ�� ���� ������ �л��̸��� �˻��Ͽ�
		//�ش� �л��� ��� �ڸ��� �ɾҴ��� ����Ͻÿ�.
		Scanner sc=new Scanner(System.in);
		practice8(); //�ڸ�ǥ�� �ҷ��´�.
		System.out.println("=======================");
		System.out.print("�˻��� �л� �̸��� �Է��ϼ���: ");
		String searchName=sc.nextLine();
		//�˻��� �̸��� �¼��� �ִ°�?
		int result[]=isStudent(searchName);
		if(result[0]>0) {
			//�д��� 1,2�д����� �Ǿ��ֱ⶧���� -> �˻��� �̸��� ������
			
			//���°��?
			String jul="";
			switch(result[1]) {
			case 1:jul="ù";break;
			case 2:jul="��";break;
			case 3:jul="��";break;
			}
			
			//���ʿ�����?
			String leftRight=(result[2]==0)?"����":"������";
			
			//�˻���� ���
			System.out.println("�˻��Ͻ� "+searchName+" �л��� "+ result[0]+"�д� "+jul+"��° �� "+leftRight+"�� �ֽ��ϴ�.");
			
		}else {
			//�������� ����
			System.out.println("�˻��Ͻ� "+searchName+" �л��� �������� �ʽ��ϴ�.");
		}
	}
	
}

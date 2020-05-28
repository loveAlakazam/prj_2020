package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	//�迭- �ǽ�����1
	public void practice1() {
		//���̰� 10�� �迭�� �����ϰ�
		int [] arr= new int[10];
		
		//1~10������ ���� �ݺ����� �̿��Ͽ�
		for(int i=0; i<arr.length; i++)
			arr[i]=i+1;
		
		//������� �迭 �ε����� ���� �� ���� ���
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	
	//�ǽ�����2
	public void practice2() {
		//���̰� 10�� �迭�� �����Ѵ�.
		int []arr= new int[10];
		
		//1~10������ ���� �ݺ����� �̿��Ͽ�
		//�������� �迭�ε����� ������ ���� ���
		for(int i=0; i<arr.length; i++) {
			arr[i]=arr.length-i;
		}
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	
	//�ǽ�����3
	
	
	//�ǽ�����4
	
	
	//2020.05.28 
	//�ǽ�����5
	
	//�ǽ�����6
	
	//�ǽ����� 11
	
	//�ǽ����� 15
	//�ּ��� �ð����⵵O(N)���� ��Ÿ������.
	public void practice15() {
		Scanner sc =new Scanner(System.in);
		System.out.print("���ڿ�: ");
		String word= sc.nextLine(); // \n������ ������, \n�� ������ ������ ����
		
		// �ּ� �ѹ��̶� ����� ���ĺ����� ��Ƴ���.
		boolean isUsed[] =new boolean[26]; //���ĺ��� ���� ���������� Ȯ��(false�� �ʱ�ȭ)
		char uniqueAlpha[]= new char[26]; //�ִ� 26(���ĺ�����)
		
		int uniqueAlphaLength=0; // �ּ� �ѹ� ����� �ܾ��� ���̸� ���Ѵ�.
		for(int i=0; i<word.length(); i++) {
			//���� �����
			char current=word.toLowerCase().charAt(i);
			
			//���� ����ڰ� ���� �����ΰ�?
			int alphaIdx= current-'a';
			if(!isUsed[alphaIdx]) {
				//���� ������ ���� ���¶��
				isUsed[alphaIdx]=true;
				
				//current ���ĺ��� �߰��ϰ�
				//�ּ� �ѹ��̻��̶� ����� ���ĺ� ���� ���� 
				uniqueAlpha[uniqueAlphaLength++]=current;
			}
		}
		
		System.out.print("���ڿ��� �ִ� ���� : ");
		for(int i=0; i<uniqueAlphaLength; i++) {
			char current=uniqueAlpha[i];
			if(i==uniqueAlphaLength-1) //����������
				System.out.println(current);
			else
				System.out.print(current+", ");
			
		}
		System.out.println("���� ����: "+uniqueAlphaLength);
	}
	
	public void practice15_2() {
		//� ���ڰ� ������ �迭�� �����ϰ�
		//������ ������ �Բ� ���
		Scanner sc =new Scanner(System.in);
		System.out.print("���ڿ�: ");
		String words= sc.next();
		
		//���� �ܾ��� ���̸�ŭ�� �迭���� �Ҵ�
		char []usedAlpha= new char[words.length()];
		
		//�� ���ĺ��� �ּ� �ѹ��̻� ����ߴ����� Ȯ��
		
		int uniqueCnt=0; //�ּ� �ѹ��̻�(�ߺ�x) ����� ���ĺ� ����
		
		
		for(int i=0; i<words.length(); i++) {
			//���� ���ĺ�
			char current= words.charAt(i);
			
			//���� ���ĺ��� usedAlpha�� �ִ°�?
			boolean isHere= false; //usedAlpha�� current�� ���ٰ� �ʱ�ȭ�Ѵ�
			
			for(int j=0; j< usedAlpha.length; j++) {
				//current�� usedAlpha �迭�� �ִٸ�
				if(usedAlpha[j]==current) {
					isHere=true;
					break;
				}
			}
			
			//������ĺ��� �ִ°�?
			if(isHere) //�ִٸ�-> uniqueCnt�� �÷����Ѵ�.
				uniqueCnt++;
			
			
		}
		
		System.out.print("���ڿ��� �ִ� ���� :");
		for(int i=0; i<isUsedAlpha.length; i++)
			if(isUsedAlpha[i])
				System.out.print((char)('a'+i)+ " ");
		System.out.println("\n���� ����: "+uniqueCnt);
	}
	
	//�ǽ�����16
	
	
	
}

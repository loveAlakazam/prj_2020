package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	//�ݺ���-���ǹ� ���չ���
	//�ǽ�����6
	
	//�迭�� Ȱ���� Ǯ��
	public void rps() {
		//����� �̸��� �Է��ϰ� 
		//��ǻ�Ͱ� ����/����/�� ������ ������ ���ڷ� ���ؼ� �����Ѵ�.
		//����ڿ��Դ� ���� ����/����/���� ��������
		//����ڰ� exit�� �Է��ϱ� �������� ������������ ��� ����
		//exit���Ŀ��� �ݺ��� ���߰� ����� (��/��/��)�� ����ϼ���.
		
		//����: 0/ ����:1 / ��:2
		//�����: ��
		//��ǻ��: ��
		
		//������� ���������� ����� ���� ����.
		int roundCnt=0; //��������Ƚ��
		int winCnt=0; //�̱�Ƚ��
		int drawCnt=0; //���Ƚ��
		int lostCnt=0; //��Ƚ��
		
		String rpsResult[][]= {
			//�����: ����(0)
				//��ǻ��:����(���), ����(��), ��(�̱�)
				{"�����ϴ�.", "�����ϴ� �Ф�", "�̰���ϴ� ^-^!!"},
			//�����: ����(1)
				//��ǻ��: ����(�̱�), ����(���), ��(��)
				{"�̰���ϴ� ^-^!!", "�����ϴ�.", "�����ϴ� �Ф�"},
			//�����: ��(2)
				//��ǻ��: ����(��), ����(�̱�), ��(���)
				{"�����ϴ� �Ф�", "�̰���ϴ� ^-^!!", "�����ϴ�."}
		};
		
		Scanner sc= new Scanner(System.in);
		
		//����� �̸��� �Է����ּ���.
		System.out.print("����� �̸�: ");
		String userName=sc.nextLine();
		String order; //����+����+��+exit
		do {
			//���������� �Է�
			System.out.print("����������: ");
			order=sc.nextLine();
			
			//order�� exit�̶��-> ����� �ݺ����� ����������.
			int user;
			switch(order) {
				case "����":
					user=0;
					break;
					
				case "����":
					user=1;
					break;
					
				case "��":
					user=2;
					break;
					
				case "exit": //��/��/���� ����ϰ� return.
					System.out.println(userName+"���� ���");
					System.out.println(roundCnt+"�� "+winCnt+"�� "
					+drawCnt+"�� "+ lostCnt+"��");
					return; //���ѹݺ����� ����������, ȣ���Ѱ����� ���ư���.
					
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					continue; //�Ʒ��ڵ� �����ϰ� �������� �ݺ�.
			}
			
			//����/����/�� �� �Է��ϸ� ���� ���� ����
			roundCnt++;
			
			//��ǻ���� ����������
			int computer=(int)(Math.random()*3); //0,1,2
			String rps[]= {"����","����","��"};
			
			//���� ���
			System.out.println("��ǻ��: "+rps[computer]);
			System.out.println(userName+": "+order);
			
			String msg=rpsResult[user][computer];
			System.out.println(msg);//�޽��� ���
			
			if(msg.equals("�̰���ϴ� ^-^!!")) // �̰�ٴ� �޽����� �޾Ҵٸ�
				winCnt++;
			else if(msg.equals("�����ϴ�.")) // ���ٴ� �޽����� �޾Ҵٸ�
				drawCnt++;
			else //���ٴ� �޽���
				lostCnt++;
			System.out.println();
		}while(true);
	}
}

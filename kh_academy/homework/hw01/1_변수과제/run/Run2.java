package com.kh.practice1.run;

import java.util.Scanner;

import com.kh.practice1.func.VariablePractice2;

public class Run2 {

	public static void main(String[] args) {
		VariablePractice2 vp2 = new VariablePractice2();
		
		//Scanner�� ���ؼ�, ����ڷκ��� ���ڿ��� �Է¹޽��ϴ�.
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ� ������ ���ڹ��ڿ��� �Է¹޽��ϴ�.
		String stringNum1, stringNum2;
		System.out.print("ù��° ������ �Է����ּ���: ");
		stringNum1= sc.nextLine();
		
		System.out.print("�ι�° ������ �Է����ּ���: ");
		stringNum2= sc.nextLine();
		
		//Integer ������ü���� parseInt()�޼ҵ带 ����Ͽ�, ���ڿ��� ���ڷ� ��ȯ�մϴ�.
		//�̸� �Ľ�(parsing)�̶�� �ϸ�, parsing�� ���ڿ��� �ٸ� �ڷ���(����, �Ǽ�, ��) ���� ��ȯ��Ű�� ���� �ǹ��մϴ�.
		int num1=Integer.parseInt(stringNum1);
		int num2=Integer.parseInt(stringNum2);
		
		//System.out.println()�� 
		// ���ڿ� �Է¾����� ���ุ�մϴ�. (�ݸ�, printf�� print�� ���ڿ��Է��� �ʼ���)
		// �Է��� ���ڿ��� ��°� ������ �մϴ�.
		System.out.println("ù��° ����: "+ num1);
		System.out.println("�ι�° ����: "+ num2);
		
		int sum= vp2.sum(num1, num2);
		System.out.println("���ϱ� ���: "+ sum);
		
		int sub= vp2.sub(num1, num2);
		System.out.println("���� ���: "+ sub);
		
		int mul= vp2.mul(num1, num2);
		System.out.println("���ϱ� ���: "+ mul);
		
		int div= vp2.div(num1, num2);
		System.out.println("������ �� ���: "+ div);
		
		int mod= vp2.mod(num1, num2);
		System.out.println("������ ������ ���: "+ mod);
	}

}

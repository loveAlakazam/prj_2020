package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice4 {
	public void printThreeWords2() {
		//����ڷκ��� ���ڿ��� �Է¹޴´�.
		Scanner sc= new Scanner(System.in);
		
		// \n�� ������ ������ ���ڿ��� �Է¹޴´�.
		System.out.print("�ܾ �Է����ּ���: ");
		String sampleWord= sc.next();
		
		//�ܾ���̰� 3�̸��� �ܾ��� ��쿡�� ���ܰ� �߻��Ѵ�.
		//[����] java.lang.StringIndexOutOfBoundsException
		
		
		//���⼭ try-catch���� ����غ��ڽ��ϴ�.
		try {
			 System.out.printf("ù��° ����: %c\n", sampleWord.charAt(0));
			 System.out.printf("�ι�° ����: %c\n", sampleWord.charAt(1));
			 System.out.printf("����° ����: %c\n", sampleWord.charAt(2));
			 
		}catch(StringIndexOutOfBoundsException e){
			//checkPrint�Լ����� StringIndexOutOfBoundsException ���ܰ� �߻��ϸ�
			//�Լ��� �ߴ��ϰ�, catch������� ����.
			
			//���̰� 3�ں��� ���� ��쿡�� ���� �߻�
			System.out.println("�ش� �ܾ�� 3���� �̸��Դϴ�.");
			System.out.println("����: "+e.toString()); //���� ���
		}
		
	}
	
}

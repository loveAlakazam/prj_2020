package selfReview;

import java.util.Arrays;

public class CopyReview {
	public static void deepcopy1() {
		//�ݺ����� �̿��� ���� ����
		
		//���� ���� �� �ʱ�ȭ
		int origin[]= new int[5];
		for(int i=0; i<origin.length; i++)
			origin[i]=i+1;
		
		//���纻 
		int copy[]=new int[origin.length]; //origin�� ���̸�ŭ ���ο� �迭�� ����
		for(int i=0; i<copy.length; i++)
			copy[i]=origin[i];
		
		System.out.print("original -���� ��: ");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i]+" ");
		}
		System.out.println();
		
		System.out.print("copy -���� ��: ");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println("\n");
		
		//������ ����
		System.out.print("origin -������: ");
		origin[4]=99;
		for(int i=0; i<origin.length; i++)
			System.out.print(origin[i]+" ");
		System.out.println();
		
		System.out.print("copy -������: ");
		for(int i=0; i<copy.length; i++)
			System.out.print(copy[i]+" ");
		System.out.println();
	}
	
	
	public static void deepcopy2() {
		//�����迭
		int [] origin=new int[5];
		for(int i=0; i<origin.length; i++) {
			origin[i]=i+2;
		}
		
		//���纻 �迭
		int [] copy= new int[10]; //���纻 �迭 �ʱ�ȭ
		//���� ����
		System.out.print("���� ���� copy�迭: ");
		for(int i=0; i<copy.length; i++)
			System.out.print(copy[i]+" ");
		
		//����
		System.out.print("\n���� ���� copy�迭: ");
		System.arraycopy(origin, 0, copy, 5, origin.length);
		for(int i=0; i<copy.length; i++)
			System.out.print(copy[i]+" ");
	}
	
	public static void deepcopy3() {
		//�����迭
		int [] origin= new int[5];
		for(int i=0; i<origin.length; i++) {
			origin[i]=i+1;
		}
		
		int []copy= new int[10];
		
		//�����ϱ� �� �����迭�� ���纻 �迭
		//�����迭
		System.out.println("Arrays.copyOf()�� ����ϱ� ��");
		System.out.print("�����迭: ");
		for(int i=0;i<origin.length; i++)
			System.out.print(origin[i]+" ");
		
		//���纻 �迭
		System.out.print("\n���纻�迭: ");
		for(int i=0;i<copy.length; i++)
			System.out.print(copy[i]+" ");
	
		System.out.println("\n");
		System.out.println("Arrays.copyOf()�� ����� ��");
		copy=Arrays.copyOf(origin, origin.length);
		
		//�����迭 �����͸� ����
		System.out.print("�����迭: ");
		origin[3]=202;
		
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i]+" ");
		}
	
		System.out.print("\n���纻 �迭: ");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
	}
	
	
	
	public static void main(String []args) {
//		deepcopy1();
//		deepcopy2();
		deepcopy3();
	}
}

package part04;

public class ArrayExam2 {

	public static void main(String[] args) {
		int [] int_array= new int[100];
		System.out.println("array.length: "+int_array.length);
		for(int i=0; i<int_array.length; i++) {
			//���� �ִ´�.
			int_array[i]=i+1;
		}
		
		//�ش����� ������ �Ҹ��Ѵ� : ������ scope (����i)
		int sum=0;
		for(int i=0; i<int_array.length; i++) {
			//�迭 �ȿ��ִ� ���� ������.
			sum+=int_array[i];
		}
		System.out.println("sum: "+sum);

	}

}

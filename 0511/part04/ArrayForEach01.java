package part04;

public class ArrayForEach01 {

	public static void main(String[] args) {
		// �ݺ����� �̿��Ͽ�, �迭�ǿ��� ����
		int [] arr= {10,20,30,40,50};
		
		int value;
		//�ε����� �̿��Ͽ� ���� ������.
		for(int i=0; i<arr.length;i++){
			value=arr[i];
			System.out.println(value);
		}
		
		// for each
        // for(���� ���� �� �ִ� ����: �迭)
		for(int val:arr) {
			System.out.println(val);
		}
		

	}

}

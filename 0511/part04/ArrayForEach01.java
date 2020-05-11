package part04;

public class ArrayForEach01 {

	public static void main(String[] args) {
		// 반복문을 이용하여, 배열의원소 접근
		int [] arr= {10,20,30,40,50};
		
		int value;
		//인덱스를 이용하여 값을 꺼낸다.
		for(int i=0; i<arr.length;i++){
			value=arr[i];
			System.out.println(value);
		}
		
		// for each
        // for(값을 받을 수 있는 변수: 배열)
		for(int val:arr) {
			System.out.println(val);
		}
		

	}

}

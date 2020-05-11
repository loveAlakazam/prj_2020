package part04;

public class ArrayExam2 {

	public static void main(String[] args) {
		int [] int_array= new int[100];
		System.out.println("array.length: "+int_array.length);
		for(int i=0; i<int_array.length; i++) {
			//값을 넣는다.
			int_array[i]=i+1;
		}
		
		//해당블록이 끝나면 소멸한다 : 변수의 scope (변수i)
		int sum=0;
		for(int i=0; i<int_array.length; i++) {
			//배열 안에있는 값을 빼낸다.
			sum+=int_array[i];
		}
		System.out.println("sum: "+sum);

	}

}

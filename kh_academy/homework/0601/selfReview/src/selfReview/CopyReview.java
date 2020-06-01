package selfReview;

import java.util.Arrays;

public class CopyReview {
	public static void deepcopy1() {
		//반복문을 이용한 깊은 복사
		
		//원본 선언 및 초기화
		int origin[]= new int[5];
		for(int i=0; i<origin.length; i++)
			origin[i]=i+1;
		
		//복사본 
		int copy[]=new int[origin.length]; //origin의 길이만큼 새로운 배열을 생성
		for(int i=0; i<copy.length; i++)
			copy[i]=origin[i];
		
		System.out.print("original -변경 전: ");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i]+" ");
		}
		System.out.println();
		
		System.out.print("copy -변경 전: ");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println("\n");
		
		//원본값 변경
		System.out.print("origin -변경후: ");
		origin[4]=99;
		for(int i=0; i<origin.length; i++)
			System.out.print(origin[i]+" ");
		System.out.println();
		
		System.out.print("copy -변경후: ");
		for(int i=0; i<copy.length; i++)
			System.out.print(copy[i]+" ");
		System.out.println();
	}
	
	
	public static void deepcopy2() {
		//원본배열
		int [] origin=new int[5];
		for(int i=0; i<origin.length; i++) {
			origin[i]=i+2;
		}
		
		//복사본 배열
		int [] copy= new int[10]; //복사본 배열 초기화
		//복사 이전
		System.out.print("복사 이전 copy배열: ");
		for(int i=0; i<copy.length; i++)
			System.out.print(copy[i]+" ");
		
		//복사
		System.out.print("\n복사 이후 copy배열: ");
		System.arraycopy(origin, 0, copy, 5, origin.length);
		for(int i=0; i<copy.length; i++)
			System.out.print(copy[i]+" ");
	}
	
	public static void deepcopy3() {
		//원본배열
		int [] origin= new int[5];
		for(int i=0; i<origin.length; i++) {
			origin[i]=i+1;
		}
		
		int []copy= new int[10];
		
		//복사하기 전 원본배열과 복사본 배열
		//원본배열
		System.out.println("Arrays.copyOf()를 사용하기 전");
		System.out.print("원본배열: ");
		for(int i=0;i<origin.length; i++)
			System.out.print(origin[i]+" ");
		
		//복사본 배열
		System.out.print("\n복사본배열: ");
		for(int i=0;i<copy.length; i++)
			System.out.print(copy[i]+" ");
	
		System.out.println("\n");
		System.out.println("Arrays.copyOf()를 사용한 후");
		copy=Arrays.copyOf(origin, origin.length);
		
		//원본배열 데이터를 수정
		System.out.print("원본배열: ");
		origin[3]=202;
		
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i]+" ");
		}
	
		System.out.print("\n복사본 배열: ");
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

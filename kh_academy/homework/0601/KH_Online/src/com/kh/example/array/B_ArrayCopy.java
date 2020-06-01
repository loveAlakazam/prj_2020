package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	// 얕은복사: 배열의 주소만 복사
	// 깊은복사: 동일한 새로운 배열을 하나 생성하여 실제 내부값 복사

	// 얕은복사
	public void method1() {
		int[] originArr = { 1, 2, 3, 4, 5 };

		int[] copyArr = originArr; // copyArr은 originArr의 주소값을 갖는다.
		System.out.println("originArr : " + originArr);
		System.out.println("copyArr: " + copyArr);

		System.out.println();

		System.out.print("Origin Arr: ");
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}

		System.out.println();
		System.out.print("copy Arr: ");
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}

		System.out.println();
		System.out.println("originArr[0]의 값을 99로 변경");
		originArr[0] = 99;

		System.out.print("originArr: ");// 99 2 3 4 5
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}

		System.out.println();
		System.out.print("copyArr: "); // 99 2 3 4 5
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		// originArr과 copyArr이 서로 같은 객체를 참조한다.
	}

	// 깊은복사
	public void method2() {
		int[] originArr = { 1, 2, 3, 4, 5 };

		// originArr의 배열길이만큼 공간 할당하기.
		// 공간만 만들었음. -> int 자료형 기본값 :0
		int[] copyArr = new int[originArr.length];

		System.out.println("originArr address: " + originArr);
		System.out.println("copyArr address: " + copyArr);

		// 깊은복사 -1 : for문을 이용한 복사
		// 깊은복사 -2 : System 클래스에 있는 arraycopy()메소드를 이용한 복사
		// 깊은복사 -3 : Arrays클래스에 있는 copyOf() 메소드를 이용한 복사
	}

	// 깊은복사1 - for문을 이용한 복사
	public void deepcopy1() {
		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = new int[originArr.length];

		// 주소값이 서로 다르다.
		// 즉, originArr과 copyArr은 참조하는 객체가 서로 다르다. (주소값이 다르기때문에)
		System.out.println("originArr 주소값: " + originArr);
		System.out.println("copyArr 주소값: " + copyArr);

		for (int i = 0; i < copyArr.length; i++) {
			copyArr[i] = originArr[i];
		}

		System.out.print("originArr: ");
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.print("copoyArr: ");
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");	
		}
		
		
		System.out.println();
		originArr[0]=99; //originArr[0]을 99로 변경
		copyArr[1]=50;   //copyArr[1]을 50으로 변경
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		
	}
	
	//깊은복사 2
	public void deepcopy2() {
		//	System 클래스의 arraycopy()를 이용
		int [] originArr= {1,2,3,4,5};
		int [] copyArr=new int[10];
		
		/*
		 * System.arraycopy(src: 원본배열-어떤배열을 똑같이 카피할 것인가?,
		 * 					srcPos: 원본배열의 시작위치-원본배열의 어디서부터 복사를 시작할건가?,
		 * 					dest:   복사배열,
		 * 					destPost: 복사배열의 시작위치- 복사배열의 어디에 붙여넣을건지,
		 * 					length: 복사할 길이,
		 * );
		 * */
		
		
		//[error message]
		//The method arraycopy(Object, int, Object, int, int) 
		//in the type System is not applicable for the arguments (int[], int, int[], int, int[])
		
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		System.out.print("originArr: ");
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		
		System.out.print("\ncopyArr: ");
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
	}
	
	//깊은복사3
	//Arrays클래스에 있는 copyOf()를 이용.
	public void deepcopy3() {
		int [] originArr= {1,2,3,4,5};
		int [] copyArr= new int[10];
		System.out.println("배열복사 이전");
		System.out.print("copyArr: ");
		for(int i=0; i<copyArr.length; i++)
			System.out.print(copyArr[i]+" ");
		
		System.out.println();
		
		// ctrl 눌러서 링크확인 
		//Array.copyOf()는 System.arraycopy()를 사용했다.
		//Array.copyOf( 원래배열, 복사할 원래 배열의 길이);
		System.out.println("\n배열복사 이후");
		copyArr=Arrays.copyOf(originArr, originArr.length);
		
		System.out.print("copyArr: ");
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		String str="";
		System.out.print(str);
	}
}

 package part04;

public class Array2DExam1 {

	public static void main(String[] args) {
		int [][]array2d= new int[3][4];
		array2d[0][1]=10;
		
		//각 행마다 배열의개수가 다른 배열도 만들 수 있따.
		int [][]array2d2= new int[3][];
		array2d2[0]=new int[1];
		array2d2[1]=new int[2];
		array2d2[2]=new int[3];
		
		int[][]array6= {{0}, {0,1}, {0,1,2}};

	}

}
